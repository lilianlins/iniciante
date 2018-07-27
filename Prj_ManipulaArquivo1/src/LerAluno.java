
import java.io.IOException;
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
public class LerAluno {
    
    public static void main (String arg [ ]) throws IOException {
    Aluno[ ] aluno = new Aluno[3];	
    GravaAluno m = new GravaAluno(); 
      int opc=0      ;
      while (opc!=9){
 opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Gravar Aluno \n 2 - Ler Aluno \n 9 - Finaliza"));
      switch (opc)     {
            case 1: aluno = m.GravaAluno(aluno);
                         break;
            case 2: m.LerAluno (aluno);
                         break;
            case 9: JOptionPane.showMessageDialog(null,"FINALIZADO ");
                         break;
            default: JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
         }   }  } }

