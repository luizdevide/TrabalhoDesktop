package trabalhodesktop;

public class ContaCorrente {

    private int idConta;
    private double saldo;
    private Cliente cliente = new Cliente();

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void saque(double valor){
        if ( valor > this.saldo )
            System.out.println("\nSaldo Insuficiente.\nSaldo disponivel para saque: " +this.saldo);
        else{
            this.saldo -= valor;
            System.out.println("\nOperaçao realizado com sucesso.\nSaldo disponivel: " +this.saldo);
        }
    }
    
    public void deposito(double valor){
        this.saldo += valor;
        System.out.println("\nOperacao realizada com sucesso\nSaldo disponivel: " +this.saldo);
    }
    
    public void extrato(){
        
    }
}
