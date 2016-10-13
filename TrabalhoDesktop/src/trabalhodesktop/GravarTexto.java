package trabalhodesktop;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class GravarTexto {

    String nome;
    
    public void criaArquivo(String nome){
        try{
            File diretorio = new File("C:/Users/Luiz Guilherme/Documents/5° Semestre/Desktop");
            diretorio.mkdir();
            File arquivo = new File(diretorio, nome+".txt");
            arquivo.createNewFile();    
        }catch(IOException e){
            System.out.println("Erro ao gerar arquivo." +e.getMessage());
        }  
    }
    
    public void preencherArquivo(){
        try{
            PrintWriter arq = null;           
            arq = new PrintWriter("C:/Users/Luiz Guilherme/Documents/5° Semestre/Desktop/"+nome+".txt");
            String dados = JOptionPane.showInputDialog("Digite os dados do arquivo");
            arq.println();
            arq.close();
        }catch(IOException e){
            System.out.println("Erro ao gerar arquivo." + e.getMessage());
        }
    }
}  

