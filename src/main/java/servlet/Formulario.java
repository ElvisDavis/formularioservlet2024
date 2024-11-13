package servlet;

import jakarta.jws.WebService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

//Implemento elpath de acceso o llave
@WebServlet("/ingresar")
public class Formulario extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //seteamos el setContextpath
        resp.setContentType("text/html");
        //declaro e inicializo una variable de tipo String
        String username = req.getParameter("username");
        //declaro e inicializo una variable de tipo String para trae el password
        String password = req.getParameter("password");
        //Declaramos e inicializamos una variable donde vamos a
        //guardar el email
        String email = req.getParameter("email");
        //Implemetar una variable para guardar  los lenguajes de progrmación
        String[] lenguajes = req.getParameterValues("lenguajes");
        String idioma = req.getParameter("idioma");
        String pais = req.getParameter("pais");
        String[] roles=req.getParameterValues("roles");
        boolean habilitar=req.getParameter("habilitar") != null && req.getParameter("habilitar").equals("on");


        PrintWriter out = resp.getWriter();
        //Creo la plantilla html
        out.print("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"utf-8\">");
        out.println("<title>Formulario</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Manejo de formulario</h1>");
        out.println("<ul>");
        out.println("<li>Nombre usuario : "+ username+"</li>");
        out.println("<li>Password : " +password+"</li>");
        out.println("<li>Email : " + email + "</li>");
        out.println("<ul>Lenguajes :");
        Arrays.asList(lenguajes).forEach(lenguaje ->{
            out.println("<li>"+lenguaje + "<li>");
        });
        out.print("</u>");
        out.println("</ul>");
        out.println("</body>");
        out.println("</html>");
    }
}
