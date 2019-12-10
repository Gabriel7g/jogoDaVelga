/*
 * # JOGO DA VELHA #
 *   Gabriel Cruz
 *  Dezembro - 2019
 */
package com.cruz.gabriel.jogoDaVelha.util;

import java.util.Random;

/**
 * Classe responsável por definir quem será o primeiro jogador a mexer.
 * Tem como responsabilidade única gerar o caracter que terá o primeiro 
 * movimento.
 *
 * @author Gabriel Cruz
 * @version 1.0
 */

public class DefinidorFirstPlayer {
    /**
     * Método que define de quem será o primeiro movimento.
     * 
     * @return caracterInicial
     */
    public static char defineFirstPlayer(){
        
        Random aleatorizador = new Random();
        char caracterInicial;
        
        //Repete a geração de caractere 36 vezes para atingir o tamanho proposto
        int numeroInteiro = aleatorizador.nextInt(2);

        if (numeroInteiro == 0){
            caracterInicial = 'O';
        }
        else{
            caracterInicial = 'X';
        }     
               
        return caracterInicial;
    }
}
