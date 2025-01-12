package ma.fstt.ejbconsummer.servlets;

import ma.fstt.container.EtudiantServiceRemote;
import ma.fstt.ejbconsummer.util.EJBLookupUtil;
import ma.fstt.entities.Etudiant;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.io.IOException;
import java.util.List;

@WebServlet("/listEtudiants")
public class ListEtudiantsServlet extends HttpServlet {

    private EtudiantServiceRemote etudiantService;

    @Override
    public void init() throws ServletException {
        try {
            etudiantService = EJBLookupUtil.getEtudiantService();
        } catch (NamingException e) {
            throw new ServletException("Impossible de trouver l'EJB via JNDI", e);
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Etudiant> etudiants = etudiantService.getAllEtudiants();

        request.setAttribute("etudiants", etudiants);
        request.getRequestDispatcher("listEtudiants.jsp").forward(request, response);
    }
}
