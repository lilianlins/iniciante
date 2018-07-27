/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lilian
 */
public class Votação {
    int NumeroSeção;
    int NumeroCandidato;
    
    //construtor
    Votação (){
        this (0,0);}
    Votação (int NSeção ,int NCandidato){
        NumeroSeção = NSeção;
        NumeroCandidato = NCandidato;
    }       
}
