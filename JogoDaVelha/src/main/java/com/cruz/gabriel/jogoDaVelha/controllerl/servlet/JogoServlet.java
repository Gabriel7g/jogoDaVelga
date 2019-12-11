/*
 * # JOGO DA VELHA #
 *   Gabriel Cruz
 *  Dezembro - 2019
 */
package com.cruz.gabriel.jogoDaVelha.controllerl.servlet;

import com.cruz.gabriel.jogoDaVelha.model.Jogo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Classe Servlet para um Jogo.
 * Tem como responsabilidade única servir como comunicação entre o Front-End e o
 * Back-End quando em relação ao início do jogo.
 *
 * @author Gabriel Cruz
 * @version 1.1
 */

@WebServlet(name = "JogoServlet", urlPatterns = {"/game"})
public class JogoServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws javax.servlet.ServletException
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
                
        Jogo jogo = new Jogo();
        String resposta = "{\n\t\"id\" : \"" + jogo.getIdAsString() + "\",\n\t"
                + "\"firstPlayer\" : \"" 
                + jogo.getCaracterPrimeiroJogadorAsString() + "\" }";
        
        try (PrintWriter out = response.getWriter()) {
            out.println(resposta);
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
     * Retorna uma descrição simples do qeu faz esse Servlet.
     *
     * @return uma String contendo a descrição do Servlet
     */
    @Override
    public String getServletInfo() {
        return "Esse servlet é responsável pelo início do jogo";
    }// </editor-fold>
}