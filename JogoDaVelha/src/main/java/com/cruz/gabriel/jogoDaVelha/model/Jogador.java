/*
 * # JOGO DA VELHA #
 *   Gabriel Cruz
 *  Dezembro - 2019
 */
package com.cruz.gabriel.jogoDaVelha.model;

import java.util.Random;

/**
 * Classe Modelo para um Jogador.
 * Tem como responsabilidade única servir como modelo para um jogador.
 *
 * @author Gabriel Cruz
 * @version 1.0
 */

public class Jogador {
    //Atributos
    private char caracter;

    //Construtor Padrão
    public Jogador(){
    }
    
    /**
     * Método que retorna o valor do atributo caracter.
     * 
     * @return jogador
     */
    public char getCaracter() {
        return caracter;
    }

    /**
     * Método que define o valor do atributo caracter
     * 
     */
    public void setCaracter(char caracter) {
        this.caracter = caracter;
    } 
}
