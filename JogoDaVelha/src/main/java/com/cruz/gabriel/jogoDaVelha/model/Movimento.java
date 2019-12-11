/*
 * # JOGO DA VELHA #
 *   Gabriel Cruz
 *  Dezembro - 2019
 */
package com.cruz.gabriel.jogoDaVelha.model;

import com.cruz.gabriel.jogoDaVelha.util.DefinidorFimDeJogo;

/**
 * Classe Modelo para um Movimento.
 * Tem como responsabilidade única servir como modelo para um movimento.
 *
 * @author Gabriel Cruz
 * @version 1.1
 */

public class Movimento {
    
    //Atributos
    Tabuleiro tabuleiro;
    Jogo jogo;
    
    //Construtor Vazio
    public Movimento(){}
    
    //Construtor Padrão
    public Movimento(Id id){
        tabuleiro = new Tabuleiro();
        jogo = new Jogo(id);
    }
    
    /**
     * Metodo responsável pelo funcionamento do jogo.
     * Esse metodo tem como responsábilidade única possibilitar uma jogada
     *
     * @param x coordenada do movimento no eixo das abscissas
     * @param y coordenada do movimento no eixo das ordenadas
     * @param caracter utilizado na jogada
     * @return Resposta para o Front-End sobre o ocorrimento da jogada
     */
    public String preenchePosicao(int x, int y, char caracter){
        for (int i = 0; i < tabuleiro.getX(); i++) {
            /* O "for" está ao contrário do outro para que no x o sentido das 
             * posições seja crescente enquanto no y decrescente */
            for (int j = tabuleiro.getY()-1; j >= 0; j--) {
                if (i==x && j==y) {
                    /* Verifica se a posição está ocupada */
                    if(!Character.isDefined(tabuleiro.getPosicao(x, y))) {
                        /* Verifica se é turno do jogador que selecionou a 
                         * posição para marcar */
                        if(jogo.getTurno() % 2 == 0 && 
                                caracter == jogo.getCaracterPrimeiroJogador() ||
                                jogo.getTurno() % 2 == 1 &&
                                caracter == jogo.getCaracterSegundoJogador()){
                            tabuleiro.setPosicao(x, y, caracter);
                            jogo.increaseTurno();
                            //verifica se o jogo terminou
                            switch (DefinidorFimDeJogo.
                                    defineFimDeJogo(tabuleiro,jogo)) {
                                case 1:
                                    return "{\n\t\"msg\" : \"Partida finalizada"
                                           + "\",\n\t\"winner\" : \""+ caracter
                                           + "\" }";
                                case 2:
                                    return "{\n\t\"status\" : \"Partida finaliz"
                                           + "ada\",\n\t\"winner\" : \"Draw\"}";
                                default:
                                    return "200";
                                    // Ou seria:
                                    // return "Código 200";
                            }
                        }
                        else{
                            return "{\n\t\"msg\" : \"Não é turno do jogador\"";
                        }                        
                    }
                    else{
                        return "{\n\t\"msg\" : \"Posição já ocupada\"";
                    }
                }
            }
        }
        return "{\n\t\"msg\" : \"Partida Inexistente\"";
    }
}