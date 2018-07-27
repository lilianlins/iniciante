
import java.io.BufferedWriter;
import java.io.FileWriter;
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
public class Votação2018 {
    public Votação[ ] FCadastraVotação (Votação[ ] votação  ) {
        int i;
        for (i=0;i<100;i++){
            votação[i]= new Votação();
            votação[i].NumeroCandidato=(int)(Math.random()*300);
            votação[i].NumeroSeção=(int) (Math.random()*10);
            System.out.println(votação[i].NumeroCandidato+" "+votação[i].NumeroSeção);
        }
        JOptionPane.showMessageDialog(null,"Gravação efetuada com Sucesso");
 return votação;   
}
    public Votação[]Classifica (Votação[]votação){
        int i,j;
        String m = " ";
        Votação [] Aux = new Votação[100];
        for (i=0;i<100;i++){
            
            Aux[i]= new Votação();
        }
        for (i=0;i<100;i++){
            for(j=i+1;j<99;j++){
            if (votação[i].NumeroSeção>votação[j].NumeroSeção){
                Aux[i]=votação[j];
                votação[j]=votação[i];
                votação[i]=Aux[i];
            }
            }
            m+=(votação[i].NumeroSeção+" "+votação[i].NumeroCandidato+"\n");
        }
        JOptionPane.showMessageDialog(null,m);
        JOptionPane.showMessageDialog(null,"classificados com sucesso");
     return votação; 
    }
    
    public Votação[ ] Gravação (Votação[ ] votação  ) throws IOException {
    int i;
    String fileName = "Votação2018.txt";
    BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
    for (i=0;i<100;i++){
            votação[i]= new Votação();
            votação[i].NumeroCandidato=(int)(Math.random()*300);
            writer.write(Integer.toString(votação[i].NumeroCandidato));
            writer.newLine();
            votação[i].NumeroSeção=(int) (Math.random()*10);
            writer.write(Integer.toString(votação[i].NumeroSeção));
            writer.newLine();
        }
   
    JOptionPane.showMessageDialog(null,"arquivo gerado");
    writer.close();
    return votação;
}
    public void Eleitores(Votação[]votação){
        Votação[]Aux=new Votação[10];
        int i;
        String m =" ";
        for(i=0;i<10;i++){
            Aux[i] = new Votação();
        }
        for(i=0;i<100;i++){
          Aux[votação[i].NumeroSeção].NumeroCandidato+=1;
          Aux[votação[i].NumeroSeção].NumeroSeção=votação[i].NumeroSeção;
        }
        for (i=0;i<10;i++){
           m+=(Aux[i].NumeroSeção+" "+Aux[i].NumeroCandidato+"\n");
        }
        JOptionPane.showMessageDialog(null,m);
    }
    
}
