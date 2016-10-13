package trabalhodesktop;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Main{
    
    private Transacao transacao = new Transacao();
    private ImplementaDados impD = new ImplementaDados();
    Scanner ler = new Scanner(System.in);
    
    ArrayList<ContaCorrente> arrayCorrente = new ArrayList<>();
    ArrayList<ContaLimite> arrayLimite = new ArrayList<>();
    ArrayList<ContaPoupanca> arrayPoupanca = new ArrayList<>();
    
    public void deposito(int tipoConta){
        //1 = Conta Corrente / 2 = Limite / 3 = Poupanca
        if (tipoConta == 1){
            System.out.println("\nCodigo do Cliente....: ");
            transacao.getContaCorrente().getCliente().setIdCliente(ler.nextInt());
            
            System.out.println("Nome.................:");
            transacao.getContaCorrente().getCliente().setNomeCliente(ler.next());
            
            System.out.println("Codigo da Conta......: ");
            transacao.getContaCorrente().setIdConta(ler.nextInt());
            
            System.out.println("Tipo de Transacao\n1: Saque\n2: Deposito");
            transacao.setIdTransacao(ler.nextInt());
            
            Calendar calendar =  Calendar.getInstance();
            transacao.setDataTransacao(calendar.getTime()); 
            transacao.getContaCorrente().deposito(200.00);
        }
        else if(tipoConta == 2){
            System.out.println("\nCodigo do Cliente....: ");
            transacao.getContaLimite().getCliente().setIdCliente(ler.nextInt());
            
            System.out.println("Nome.................:");
            transacao.getContaLimite().getCliente().setNomeCliente(ler.next());
            
            System.out.println("Codigo da Conta......: ");
            transacao.getContaLimite().setIdConta(ler.nextInt());            
           
            System.out.println("Tipo de Transacao\n1: Saque\n2: Deposito");
            transacao.setIdTransacao(ler.nextInt());    
            
            Calendar calendar =  Calendar.getInstance();                    
            transacao.setDataTransacao(calendar.getTime());            
            transacao.getContaLimite().deposito(250.00);            
        }
        else if(tipoConta ==3){
            System.out.println("\nCodigo do Cliente....: ");
            transacao.getContaPoupanca().getCliente().setIdCliente(ler.nextInt());
           
            System.out.println("Nome.................:");
            transacao.getContaPoupanca().getCliente().setNomeCliente(ler.next());
            
            System.out.println("Codigo da Conta......: ");
            transacao.getContaPoupanca().setIdConta(ler.nextInt());            
            
            System.out.println("Tipo de Transacao\n1: Saque\n2: Deposito");
            transacao.setIdTransacao(ler.nextInt());                                        
            
            Calendar calendar =  Calendar.getInstance();                       
            transacao.setDataTransacao(calendar.getTime());                                        
            transacao.getContaPoupanca().deposito(300.00);            
        }
    }
    
    public void extrato(int tipoConta){
        if (tipoConta == 1)
            impD.extratoContaCorrente(transacao);
        else if(tipoConta == 2)
            impD.extratoContaLimite(transacao);
        else if(tipoConta == 3)
            impD.extratoContaPoupanca(transacao);
    }
    
    public static void main(String[] args) throws ParseException{
        
        Main m =  new Main();
        GravarTexto gt = new GravarTexto();
        Scanner ler = new Scanner(System.in);
        int x = 0;
        Transacao transacao = new Transacao();
        
        do{
            
            System.out.println("Selecione o tipo de conta:\n1 - Conta Corrente\n2 - Conta Limite\n3 - Conta Poupanca\n4 - Encerrar Sessao");
            x = ler.nextInt();
            if ( x != 1 && x != 2 && x != 3 && x != 4)
                System.out.println("\nSelecione uma opcao valida!\n");
            m.deposito(x);
            m.extrato(x); 
            switch (x) {
                case 1:
                    gt.criaArquivo(transacao.getContaCorrente().getCliente().getNomeCliente());
                    break;
                case 2:
                    gt.criaArquivo(transacao.getContaLimite().getCliente().getNomeCliente());
                    break;
                case 3:
                    gt.criaArquivo(transacao.getContaPoupanca().getCliente().getNomeCliente());
                    break;
                default:
                    break;
            }
        }while (x != 4);
    }
}