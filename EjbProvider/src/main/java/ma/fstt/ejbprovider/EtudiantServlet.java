//package ma.fstt.ejbprovider;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import ma.fstt.entities.Etudiant;
//import ma.fstt.container.EtudiantServiceRemote;
//
//import javax.naming.InitialContext;
//import javax.naming.NamingException;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.List;
//
//@WebServlet("/EtudiantServlet")
//public class EtudiantServlet extends HttpServlet {
//
//    private EtudiantServiceRemote etudiantService;
//
//    @Override
//    public void init() throws ServletException {
//        try {
//            InitialContext ctx = new InitialContext();
//            etudiantService = (EtudiantServiceRemote) ctx.lookup(
//                    "java:global/EjbProvider-1.0-SNAPSHOT/EtudiantServiceImpl!ma.fstt.container.EtudiantServiceRemote"
//            );
//        } catch (NamingException e) {
//            throw new ServletException(e);
//        }
//    }
//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//
//        List<Etudiant> etudiants = etudiantService.getAllEtudiants();
//        out.println("<h1>List of Students</h1>");
//        for (Etudiant etudiant : etudiants) {
//            out.printf("<p>%d - %s %s (CNE: %s, Address: %s, Level: %s)</p>%n",
//                    etudiant.getId_etudiant(),
//                    etudiant.getNom(),
//                    etudiant.getPrenom(),
//                    etudiant.getCne(),
//                    etudiant.getAdresse(),
//                    etudiant.getNiveau());
//        }
//    }
//}
