package trabalhodesktop;

public class ContaLimite extends ContaCorrente{

    private double valorLimite;

    public double getValorLimite() {
        return valorLimite;
    }

    public void setValorLimite(double valorLimite) {
        this.valorLimite = valorLimite;
    }
    
    public ContaLimite(double valorLimite) {
        this.valorLimite = valorLimite;
    }
    
    public ContaLimite(){
        super();
    }
    
    public void saque(double valor){
        if ( valor > this.valorLimite ) 
            System.out.println("\nSaldo Insuficiente.\nSaldo disponivel para saque: " +this.valorLimite );
        else{
            this.valorLimite -= valor;
            System.out.println("\nOperacao realizada com sucesso\nSaldo disponivel: " +this.valorLimite);
        }
    }
}
