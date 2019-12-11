/*
 * # JOGO DA VELHA #
 *   Gabriel Cruz
 *  Dezembro - 2019
 */
package com.cruz.gabriel.jogoDaVelha.util;

import com.cruz.gabriel.jogoDaVelha.model.Jogo;
import com.cruz.gabriel.jogoDaVelha.model.Tabuleiro;

/**
 * Classe responsável por definir se o jogo acabou.
 * Tem como responsabilidade única definir se o jogo acabou.
 *
 * @author Gabriel Cruz
 * @version 1.0
 */

public class DefinidorFimDeJogo {
    /**
     * Método que define o fim de jogo
     * 
     * @param tabuleiro
     * @param jogo
     * @return boolean se uma linha foi preenchida com caracteres iguais
     */
    public static int defineFimDeJogo(Tabuleiro tabuleiro, Jogo jogo){
        
        if (tabuleiro.getPosicao(0, 0) == tabuleiro.getPosicao(0, 1) && 
                tabuleiro.getPosicao(0, 1) ==  tabuleiro.getPosicao(0, 2)){
            return 1;
        }
        else if (tabuleiro.getPosicao(1, 0) == tabuleiro.getPosicao(1, 1) && 
                tabuleiro.getPosicao(1, 1) ==  tabuleiro.getPosicao(1, 2)){
            return 1;
        }  
        else if (tabuleiro.getPosicao(2, 0) == tabuleiro.getPosicao(2, 1) && 
                tabuleiro.getPosicao(2, 1) ==  tabuleiro.getPosicao(2, 2)){
            return 1;
        }  
        else if (tabuleiro.getPosicao(0, 0) == tabuleiro.getPosicao(1, 0) && 
                tabuleiro.getPosicao(1, 0) ==  tabuleiro.getPosicao(2, 0)){
            return 1;
        }  
        else if (tabuleiro.getPosicao(0, 1) == tabuleiro.getPosicao(1, 1) && 
                tabuleiro.getPosicao(1, 1) ==  tabuleiro.getPosicao(2, 1)){
            return 1;
        }  
        else if (tabuleiro.getPosicao(0, 2) == tabuleiro.getPosicao(1, 2) && 
                tabuleiro.getPosicao(1, 2) ==  tabuleiro.getPosicao(2, 2)){
            return 1;
        }  
        else if (tabuleiro.getPosicao(0, 2) == tabuleiro.getPosicao(1, 1) && 
                tabuleiro.getPosicao(1, 1) ==  tabuleiro.getPosicao(2, 0)){
            return 1;
        }  
        else if (tabuleiro.getPosicao(0, 0) == tabuleiro.getPosicao(1, 1) && 
                tabuleiro.getPosicao(1, 1) ==  tabuleiro.getPosicao(2, 2)){
            return 1;
        }  
        else if(jogo.getTurno()==8){
            return 2;
        }
        else{
            return 0;
        }
    }
}
