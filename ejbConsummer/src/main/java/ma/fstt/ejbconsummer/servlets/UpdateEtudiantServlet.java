package ma.fstt.ejbconsummer.servlets;

import ma.fstt.container.EtudiantServiceRemote;
import ma.fstt.ejbconsummer.util.EJBLookupUtil;
import ma.fstt.entities.Etudiant;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.naming.NamingException;
import java.io.IOException;

@WebServlet("/updateEtudiant")
public class UpdateEtudiantServlet extends HttpServlet {

    private EtudiantServiceRemote etudiantService;

    @Override
    public void init() throws ServletException {
        try {
            etudiantService = EJBLookupUtil.getEtudiantService();
        } catch (NamingException e) {
            throw new ServletException("Impossible de trouver l'EJB via JNDI", e);
        }
    }

    // Méthode GET : Affiche le formulaire avec les données existantes
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idParam = request.getParameter("id_etudiant");

        // Validation du paramètre
        if (idParam == null || idParam.isEmpty()) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "ID de l'étudiant manquant");
            return;
        }

        int id;
        try {
            id = Integer.parseInt(idParam);
        } catch (NumberFormatException e) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "ID invalide");
            return;
        }

        // Récupération de l'étudiant depuis le service
        Etudiant etudiant = etudiantService.getEtudiant(id);
        if (etudiant == null) {
            response.sendError(HttpServletResponse.SC_NOT_FOUND, "Étudiant introuvable");
            return;
        }

        // Ajout de l'étudiant comme attribut pour le JSP
        request.setAttribute("etudiant", etudiant);

        // Redirection vers le formulaire JSP
        request.getRequestDispatcher("editEtudiant.jsp").forward(request, response);
    }

    // Méthode POST : Enregistre les modifications
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Validation des paramètres
        String idParam = request.getParameter("id_etudiant");
        if (idParam == null || idParam.isEmpty()) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "ID de l'étudiant manquant");
            return;
        }

        int id;
        try {
            id = Integer.parseInt(idParam);
        } catch (NumberFormatException e) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "ID invalide");
            return;
        }

        // Récupérer les nouvelles données depuis le formulaire
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String cne = request.getParameter("cne");
        String adresse = request.getParameter("adresse");
        String niveau = request.getParameter("niveau");

        // Validation des champs obligatoires
        if (nom == null || nom.isEmpty() || prenom == null || prenom.isEmpty() || cne == null || cne.isEmpty()) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Certains champs obligatoires sont vides");
            return;
        }

        // Récupération de l'étudiant existant
        Etudiant etudiant = etudiantService.getEtudiant(id);
        if (etudiant == null) {
            response.sendError(HttpServletResponse.SC_NOT_FOUND, "Étudiant introuvable");
            return;
        }

        // Mise à jour des données
        etudiant.setNom(nom);
        etudiant.setPrenom(prenom);
        etudiant.setCne(cne);
        etudiant.setAdresse(adresse);
        etudiant.setNiveau(niveau);

        // Enregistrement des modifications
        etudiantService.updateEtudiant(etudiant);

        // Redirection vers la liste des étudiants
        response.sendRedirect("listEtudiants");
    }
}
