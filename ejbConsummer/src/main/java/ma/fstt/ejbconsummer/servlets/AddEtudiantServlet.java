package ma.fstt.ejbconsummer.servlets;

import ma.fstt.container.EtudiantServiceRemote;
import ma.fstt.entities.Etudiant;
import ma.fstt.ejbconsummer.util.EJBLookupUtil;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.naming.NamingException;
import java.io.IOException;

@WebServlet("/addEtudiant")
public class AddEtudiantServlet extends HttpServlet {

    private EtudiantServiceRemote etudiantService;

    @Override
    public void init() throws ServletException {
        try {
            // Utilisation de la classe utilitaire pour récupérer le service
            etudiantService = EJBLookupUtil.getEtudiantService();
        } catch (NamingException e) {
            throw new ServletException("Impossible de trouver l'EJB via JNDI", e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String cne = request.getParameter("cne");
        String adresse = request.getParameter("adresse");
        String niveau = request.getParameter("niveau");

        // Création d'un nouvel étudiant
        Etudiant etudiant = new Etudiant(nom, prenom, cne, adresse, niveau);

        // Ajout de l'étudiant dans la base
        etudiantService.addEtudiant(etudiant);

        // Redirection vers la liste des étudiants après ajout
        response.sendRedirect("listEtudiants.jsp");
    }
}
