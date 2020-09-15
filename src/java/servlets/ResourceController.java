/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import session.UserFacade;
import entity.Resource;
import entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import session.ResourceFacade;
//import session.UserFacade;

/**
 *
 * @author pupil
 */
@WebServlet(name = "ResourceController", urlPatterns = {
    "/showFormAddResource",
    "/showFormAddUser",
    "/createResourse",
    "/createUser",
    "/listResources",
    "/deleteRecource",
    "/showEditResource",
    "/updateResource"
})
public class ResourceController extends HttpServlet {
    @EJB
    private ResourceFacade resourceFacade;
    @EJB
    private UserFacade userFacade;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        HttpSession session = request.getSession(false);
        if(session == null){
            
        }
        String path = request.getServletPath();
        switch (path){
            case "/showFormAddResource":
                request.getRequestDispatcher("/showFormAddResource.jsp")
                        .forward(request, response);
                break;
            case "/createResourse":
                String name = request.getParameter("name");
                String url = request.getParameter("url");
                String login = request.getParameter("login");
                String password = request.getParameter("password");
                Resource resource = new Resource(name, url, login, password);
                resourceFacade.create(resource);
                request.setAttribute("info", "Resource \""
                        + resource.getName()+"\" created");
                request.getRequestDispatcher("/index.jsp")
                        .forward(request, response);
                break;
            case "/showFormAddUser":
                request.getRequestDispatcher("/showFormAddUser.jsp")
                        .forward(request, response);
                break;
            case "/createUser":
                String Uname = request.getParameter("name");
                String Ulogin = request.getParameter("login");
                String Upassword = request.getParameter("password");
                User user = new User(Uname, Ulogin, Upassword);
                userFacade.create(user);
                request.setAttribute("info", "User \""
                        + user.getName()+"\" created");
                request.getRequestDispatcher("/index.jsp")
                        .forward(request, response);
                break;
            case "/listResources":
                
                break;
            case "/deleteRecource":
                
                break;
            case "/showEditResource":
                
                break;
            case "/updateResource":
                
                break;  
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}