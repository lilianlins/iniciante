


import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lilian
 */
public class ClasseMetodos {
    
   public Estatistica[] FCADRASTRAESTATISTICA(Estatistica[] Est){
       
       ClasseMetodos m = new ClasseMetodos();
       int i;
       for (i=0;i<15;i++){
           Est[i]=new Estatistica();
           Est[i].CodCidade=(int)(1+(Math.random()*10));
           System.out.println(Est[i].CodCidade);
           Est[i].NomeCidade=m.Estado(Est[i].NomeCidade,Est[i].CodCidade);
           System.out.println(Est[i].NomeCidade);
           Est[i].QtdAcidentes=(int)(Math.random()*1001);
           System.out.println(Est[i].QtdAcidentes);
           Est[i].TipoVeiculo=(int)(1+(Math.random()*2));
           System.out.println(Est[i].TipoVeiculo);
       }
       return Est;
   }
        
    
   public String Estado (String Est, int Est1){
       int i;
       for(i=0;i<15;i++){
       switch (Est1){
           case 1:Est="São Paulo";
               break;
           case 2:Est="Rio de Janeiro";
               break;
           case 3:Est="Minas Gerais";
               break;
           case 4:Est="Rio Grande do Sul";
               break;
           case 5:Est="Acre";
               break;
           case 6:Est="Recife";
               break;
           case 7:Est="Bahia";
               break;
           case 8:Est="Ceara";
               break;
           case 9:Est="Para";
               break;
           case 10:Est="Santa Catarina";
               break;                
       }
   }
   return Est;
   }
    
   public void FTipo(Estatistica[]Est){
       int i,Soma=0;
       int pesq;
       pesq=Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para pesquisa sobre carro ou 2 para moto:"));
       for(i=0;i<15;i++){
        if (Est[i].TipoVeiculo==pesq){
            Soma+=1;
        }
   }
       JOptionPane.showMessageDialog(null,"A quantidade total de acidentes é:"+Soma);
   }  
   
    public void PqtAcidentes(Estatistica[]Est){
        int i;
        String m="";
        for (i=0;i<15;i++){
        if(Est[i].QtdAcidentes>100&&Est[i].QtdAcidentes<500){
            m+=Est[i].NomeCidade+"-"+Est[i].QtdAcidentes+"\n";
        }
        }
        JOptionPane.showMessageDialog(null,"Relação de Estados com quantidade de acidentes >100 e <500:\n "+ m);
        
    }
    public void PConsultaAcidentes(Estatistica[]Est){
        int i,j;
        Estatistica []aux=new Estatistica[15];
        String m="";
        for(i=0;i<15;i++){
            aux[i]=new Estatistica();
        }
        for(i=0;i<16;i++){
            for(j=i+1;j<15;j++){
            if(Est[i].CodCidade>Est[j].CodCidade){
                aux[i]=Est[i];
                Est[i]=Est[j];
                Est[j]=aux[i];
            }
        }
        }
        for (i=0;i<15;i++){
            m+=(Est[i].CodCidade+" "+Est[i].NomeCidade+" "+Est[i].QtdAcidentes+"\n");
            
        }
        JOptionPane.showMessageDialog(null,m);
    }
    
    Estatistica [] Contador (Estatistica[]Est,Estatistica [] quant){
        
        int i,j,n;
        for(j=0;j<15;j++){
            quant[j]=new Estatistica();   
        }
        for (i=0;i<15;i++){
            
            quant[Est[i].CodCidade].QtdAcidentes+=Est[i].QtdAcidentes;
            if(quant[Est[i].CodCidade].NomeCidade==Est[i].NomeCidade){
               break;}else{
            quant[Est[i].CodCidade].NomeCidade=Est[i].NomeCidade;}
        }
   return quant;
    }
     
    public void Consultar(Estatistica[]quant,Estatistica []Est){
        int i,j;
        Estatistica[]maior=new Estatistica[1];
        Estatistica[]menor=new Estatistica[1];
        for(i=0;i<1;i++){
            maior[i]=new Estatistica();
            menor[i]=new Estatistica();
            menor[i].QtdAcidentes=quant[Est[i].CodCidade].QtdAcidentes;
            menor[i].NomeCidade=quant[Est[i].CodCidade].NomeCidade;
            System.out.println(menor[i].NomeCidade+" "+menor[i].QtdAcidentes);
        }
        
            
            for(i=0;i<15;i++){
            if(quant[Est[i].CodCidade].QtdAcidentes>maior[0].QtdAcidentes){
                maior[0].QtdAcidentes=quant[Est[i].CodCidade].QtdAcidentes;
                maior[0].NomeCidade=quant[Est[i].CodCidade].NomeCidade;
                
            }else{
                if(quant[Est[i].CodCidade].QtdAcidentes<menor[0].QtdAcidentes){
               
                menor[0].NomeCidade=quant[Est[i].CodCidade].NomeCidade;
            }}
 
    }System.out.println(menor[0].NomeCidade);
            
            JOptionPane.showMessageDialog(null,"O Estado com maior numero de acidentes foi:"+maior[0].NomeCidade+"\n"+"O Estado com menor numero de acidentes foi:"+menor[0].NomeCidade+"\n");
    }
    
    }


