/*
 * # JOGO DA VELHA #
 *   Gabriel Cruz
 *  Dezembro - 2019
 */
package com.cruz.gabriel.jogoDaVelha.controllerl.servlet;

import com.cruz.gabriel.jogoDaVelha.model.Id;
import com.cruz.gabriel.jogoDaVelha.model.Movimento;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Classe Servlet para um Movimento.
 * Tem como responsabilidade única servir como comunicação entre o Front-End e o
 * Back-End quando em relação ao início do jogo.
 *
 * @author Gabriel Cruz
 * @version 1.0
 */

/* Não sei se é assim mesmo que funciona mandar um atributo por url, porém não 
 * consegui encontrar em nenhum lugar a forma correta de se fazer isso */ 
@WebServlet(name = "MovimentoServlet", urlPatterns = {"/game/{id}/moviment"})
public class MovimentoServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
                
        Id id;
        char caracter;
        int x, y;
        caracter = request.getParameter("player");
        id = request.getParameter("id");
        /* Não tenho certeza se é assim mesmo, mas, ao procurar, essa foi a forma
         * que encontrei */
        x=request.getParameter("position.x");
        y=request.getParameter("position.y");
        Movimento movimento = new Movimento(id);
        String resposta = movimento.preenchePosicao(x, y, caracter);
        
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
        return "Esse servlet é responsável pela comunicação a cada jogada feita";
    }// </editor-fold>
}