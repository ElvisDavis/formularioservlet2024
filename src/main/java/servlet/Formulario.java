package servlet;

import jakarta.jws.WebService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

//Implemento elpath de acceso
@WebServlet("/ingresar")
public class Formulario extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //seteamos el setContextpath
        resp.setContentType("text/html");
        //declaro e inicializo una variable de tipo String
        String username=req.getParameter("username");
        //declaro e inicialzo una variable de tipo String para trae el password
        String password=req.getParameter("password");
    }
}
