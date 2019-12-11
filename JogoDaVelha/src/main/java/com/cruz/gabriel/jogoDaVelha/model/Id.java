/*
 * # JOGO DA VELHA #
 *   Gabriel Cruz
 *  Dezembro - 2019
 */
package com.cruz.gabriel.jogoDaVelha.model;

import java.util.Random;

/**
 * Classe responsável por gerar um ID.
 * Tem como responsabilidade única gerar um ID aleatório para um jogo.
 *
 * @author Gabriel Cruz
 * @version 1.0
 */

public class Id {
    //Atributos
    private String id;

    //Construtor Padrão
    public Id(){}
    
    //Construtor com Id
    public Id(String id) {
        this.id = id;
    } 
    
    /**
     * Método que retorna o valor do atributo id.
     * 
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * Método que define o valor do atributo id
     * 
     */
    public void setId() {
        id = geraIdAleatorio();
    } 

    /**
     * Método que cria um id Aleatorio.
     * Esse id é composto por 17 simbolos diferentes, sendo os caracteres
     * hexadecimais e o "-"
     * 
     * @return id
     */
    private String geraIdAleatorio(){
        
        Random aleatorizador = new Random();
        String hexadecimal;
        String idAuxiliar = "";
        
        //Repete a geração de caractere 36 vezes para atingir o tamanho proposto
        for (int i = 0; i < 36; i++) {
            int numeroInteiro = aleatorizador.nextInt(17);
            
            if (numeroInteiro == 16){
                hexadecimal = "-";
            }
            else{
                hexadecimal = Integer.toHexString(numeroInteiro);
            }
            
            idAuxiliar = idAuxiliar.concat(hexadecimal); 
        }
               
        return idAuxiliar;
    }
}
