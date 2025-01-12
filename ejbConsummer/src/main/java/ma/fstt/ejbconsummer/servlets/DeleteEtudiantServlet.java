package ma.fstt.ejbconsummer.servlets;

import ma.fstt.container.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ma.fstt.ejbconsummer.util.EJBLookupUtil;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.io.IOException;

@WebServlet("/deleteEtudiant")
public class DeleteEtudiantServlet extends HttpServlet {

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
        int id = Integer.parseInt(request.getParameter("id_etudiant"));

        etudiantService.deleteEtudiant(id);

        response.sendRedirect("listEtudiants.jsp");
    }
}
