/*
 * # JOGO DA VELHA #
 *   Gabriel Cruz
 *  Dezembro - 2019
 */
package com.cruz.gabriel.jogoDaVelha.model;

/**
 * Classe Modelo para um Tabuleiro.
 * Tem como responsabilidade única servir como modelo para um tabuleiro.
 *
 * @author Gabriel Cruz
 * @version 1.0
 */

public class Tabuleiro {
    
    private int X = 3;
    private int Y = 3;
    private char[][] tabuleiro;
    
    public Tabuleiro(){
        tabuleiro = new char[X][Y];
    }
}
