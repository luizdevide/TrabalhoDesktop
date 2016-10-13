package trabalhodesktop;

public class ImplementaDados implements Dados{

    @Override
    public void extratoContaLimite(Transacao transacao){
        
        System.out.println("\n ===== Extrato Conta Limite =====\n");
        System.out.println("Numero da Conta...........: " +transacao.getContaLimite().getIdConta());
        System.out.println("Cliente...................: " +transacao.getContaLimite().getCliente().getNomeCliente());
        System.out.println("Tipo de Transacao.........: " +transacao.getIdTransacao());
        System.out.println("Data da Transcação........: " +transacao.getDataTransacao());
        System.out.println("Saldo.....................: " +transacao.getContaLimite().getSaldo());
        System.out.println("Limite....................: " +transacao.getContaLimite().getValorLimite()); 
    }
    
    @Override
    public void extratoContaPoupanca(Transacao transacao){
        System.out.println("\n ===== Extrato Conta Poupanca =====\n");
        System.out.println("Numero da Conta...........: " +transacao.getContaPoupanca().getIdConta());
        System.out.println("Cliente...................: " +transacao.getContaPoupanca().getCliente().getNomeCliente());
        System.out.println("Tipo de Transacao.........: " +transacao.getIdTransacao());
        System.out.println("Data da Transcação........: " +transacao.getDataTransacao());
        System.out.println("Saldo.....................: " +transacao.getContaPoupanca().getSaldo());
        System.out.println("Aniversario da Conta......: " +transacao.getContaPoupanca().getAniversario()); 
    }
    
    @Override
    public void extratoContaCorrente(Transacao transacao){
        System.out.println("\n ===== Extrato Conta Corrente =====\n");
        System.out.println("Numero da Conta...........: " +transacao.getContaCorrente().getIdConta());
        System.out.println("Cliente...................: " +transacao.getContaCorrente().getCliente().getNomeCliente());
        System.out.println("Tipo de Transacao.........: " +transacao.getIdTransacao());
        System.out.println("Data da Transcação........: " +transacao.getDataTransacao());
        System.out.println("Saldo.....................: " +transacao.getContaCorrente().getSaldo());
    }
}
