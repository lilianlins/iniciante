/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lilian
 */
public class Estatistica {
    int CodCidade;
    String NomeCidade;
    int QtdAcidentes;
    int TipoVeiculo;
 Estatistica (){
     this (0,"",0,0);}
 Estatistica (int Cidade,String Nome,int Qtd,int Tipo){
     CodCidade=Cidade;
     NomeCidade=Nome;
     QtdAcidentes=Qtd;
     TipoVeiculo=Tipo;
 } 
 }
   