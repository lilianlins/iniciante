
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
public class SistemaVotação {
    public static void main(String arg []) throws IOException {
      Votação [] votação = new Votação [100];
      Votação2018 m = new Votação2018();
      
      int opc = 0;
      while (opc != 9){
          opc = Integer.parseInt(JOptionPane.showInputDialog("    Sistema de Votação    \n 1- Carregar Seção/Numero eleitor \n 2- Classificar por Seção \n 3-Gravar Registros \n 4-Mostrar Indicadores \n 9-Finalizar"));
      
          switch (opc){
              case 1:votação = m.FCadastraVotação(votação);
              break;
              case 2:m.Classifica(votação);
              break;
              case 3:m.Gravação(votação);
              break;
              case 4:
                      while (opc !=9){
                          opc = Integer.parseInt(JOptionPane.showInputDialog("|    Mostrar Indicadores    |\n" +
"|    Estatísticas de Votação em 2016    |\n" +
"|  1 – Quantidade Eleitores por Seção	 \n" +
"|  2 –Seção com Maior e Menor número de Eleitores  \n" +
"|  3 – Quantidade de votos por candidato\n" +
"|  4 – 10 primeiros colocadas   \n" +
"|  9 – Finaliza consulta  "));
                          switch (opc){
                              case 1:m.Eleitores(votação);
                                  break;
                              case 2:
                                  break;
                              case 3:
                                  break;
                              case 4:
                                  break;
                              case 9:JOptionPane.showMessageDialog(null,"Finalizado");
                              break;
                              default:JOptionPane.showMessageDialog(null,"Opção Invalida");
                          }
                      }
              break;
              case 9:JOptionPane.showMessageDialog(null,"Finalizado");
              break;
              default:JOptionPane.showMessageDialog(null,"Opção Invalida");
          }
      }
      
    }
   
}
