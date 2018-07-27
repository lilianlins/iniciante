 

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
public class Principal {

    /**
     *
     * @param args
     
     */
   
    public static void main(String[] args) {
        
    
        
        Estatistica [] Est = new Estatistica [15];
        ClasseMetodos m = new ClasseMetodos();
        Estatistica[]quant=new Estatistica[15];
        
        int opc = 0;
        while(opc!=9){
            opc=Integer.parseInt(JOptionPane.showInputDialog("          Estatistica 2018            \n| 1 - Cadastro Estatística			\n" +
"| 2 - Consulta por tipo de veículo		\n" +
"| 3 - Consulta por quantidade de acidentes	\n" +
"| 4 - Consulta todos as cidades                 \n" +
"| 5 - Consulta maior menor média de acidentes	\n" +
"| 9 - Finaliza.	"));
        
   
    switch (opc){
    case 1:Est=m.FCADRASTRAESTATISTICA(Est);
            break;
    case 2:m.FTipo(Est);
            break;
    case 3:m.PqtAcidentes(Est);
            break;
    case 4:m.PConsultaAcidentes(Est);
            break;      
    case 5:quant=m.Contador(Est,quant);
            m.Consultar(quant,Est);
            break; 
    case 9: JOptionPane.showMessageDialog(null,"FINALIZADO ");
            break;
    default: JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
}
   
}
    }
}