/*
 * # JOGO DA VELHA #
 *   Gabriel Cruz
 *  Dezembro - 2019
 */

package com.cruz.gabriel.jogoDaVelha.model;

import static com.cruz.gabriel.jogoDaVelha.util.DefinidorFirstPlayer.defineFirstPlayer;

/**
 * Classe Modelo para um Jogo.
 * Tem como responsabilidade única servir como modelo para um jogo.
 *
 * @author Gabriel Cruz
 * @version 1.1
 */

public class Jogo {
    //Atributos
    private Id id;
    private Jogador jogador1, jogador2;
    private Tabuleiro tabuleiro;
    
    //Construtor Padrão
    public Jogo(){
        id.setId();
        jogador1.setCaracter(defineFirstPlayer());
        if (jogador1.getCaracter()=='X'){
            jogador2.setCaracter('O'); 
        }else{
            jogador2.setCaracter('X'); 
        }
    }
    
    /**
     * Método que retorna o atributo id.
     * 
     * @return id
     */
    public Id getId() {
        return id;
    }
    
    /**
     * Método que retorna o valor do atributo id como String.
     * 
     * @return id como String
     */
    public String getIdAsString() {
        return id.getId();
    }
    
    /**
     * Método que retorna o caracter usado pelo primeiro jogador.
     * 
     * @return caracter de quem joga primeiro
     */
    public char getCaracterPrimeiroJogador() {
        return jogador1.getCaracter();
    }
    
    /**
     * Método que retorna o caracter usado pelo primeiro jogador como String.
     * 
     * @return String de quem joga primeiro
     */
    public String getCaracterPrimeiroJogadorAsString() {
        return Character.toString(jogador1.getCaracter());
    }
    
    /**
     * Método que retorna o caracter usado pelo Segundo jogador.
     * 
     * @return caracter de quem joga depois
     */
    public char getCaracterSegundoJogador() {
        return jogador2.getCaracter();
    }
    
    /**
     * Método que retorna o caracter usado pelo Segundo jogador como String.
     * 
     * @return String de quem joga depois
     */
    public String getCaracterSegundoJogadorAsString() {
        return Character.toString(jogador2.getCaracter());
    }
}
