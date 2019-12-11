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
 * @version 1.2
 */

public class Tabuleiro {
    
    //atributos
    private final int X = 3;
    private final int Y = 3;
    private final char[][] tabuleiro;
    
    //Construtor Padrão
    public Tabuleiro(){
        tabuleiro = new char[X][Y];
    }
    
    /**
     * Método que retorna o valor do atributo X.
     * 
     * @return X
     */    
    public int getX(){
        return X;
    }
    
    /**
     * Método que retorna o valor do atributo Y.
     * 
     * @return Y
     */    
    public int getY(){
        return Y;
    }
    
    /**
     * Método que retorna o Tabuleiro.
     * 
     * @return tabuleiro
     */    
    public char[][] getTabuleiro(){
        return tabuleiro;
    }
    
    /**
     * Método que retorna determinada posição do Tabuleiro.
     * 
     * @param x posição no eixo das abcissas
     * @param y posição no eixo das ordenadas
     * @return posição do tabuleiro
     */    
    public char getPosicao(int x, int y){
        return tabuleiro[x][y];
    }
    
    /**
     * Método que determina o caracter que preencherá na posição do Tabuleiro.
     * 
     * @param x posição no eixo das abcissas
     * @param y posição no eixo das ordenadas
     * @param Caracter que será colocado na posição (x,y)
     */    
    public void setPosicao(int x, int y, char Caracter){
        tabuleiro[x][y] = Caracter;
    }
}