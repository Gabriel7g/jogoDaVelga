/*
 * # JOGO DA VELHA #
 *   Gabriel Cruz
 *  Dezembro - 2019
 */
package com.cruz.gabriel.jogoDaVelha.util;

import com.cruz.gabriel.jogoDaVelha.model.Id;

/**
 * Classe responsável por definir quem será o primeiro jogador a mexer.
 * Tem como responsabilidade única gerar o caracter que terá o primeiro 
 * movimento.
 *
 * @author Gabriel Cruz
 * @version 1.1
 */

public class DefinidorFirstPlayer {
    /**
     * Método que define de quem será o primeiro movimento.
     * 
     * @return caracterInicial
     */
    public static char defineFirstPlayer(Id id){
        
        char[] idTexto = id.getId().toCharArray();
        int somaId = 0;
        char caracterInicial;
        
        for (int i = 0; i < 36; i++) {
            if (!(idTexto[i]=='-')){
                somaId = somaId + hexadecimalCharToInt(idTexto[i]);
            }
        }

        if (somaId % 2 == 1){
            caracterInicial = 'O';
        }
        else{
            caracterInicial = 'X';
        }     
               
        return caracterInicial;
    }
    
    private static int hexadecimalCharToInt(char num){
        switch(num){
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            case 'a':
                return 10;
            case 'b':
                return 11;
            case 'c':
                return 12;
            case 'd':
                return 13;
            case 'e':
                return 14;
            case 'f':
                return 15;
            default:
                return 0;
        }
    }
}
