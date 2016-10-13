package trabalhodesktop;

import java.util.Date;

public class Transacao {

    private int idTransacao;
    private Date dataTransacao;
    private ContaCorrente contaCorrente = new ContaCorrente();
    private ContaLimite contaLimite = new ContaLimite();
    private ContaPoupanca contaPoupanca = new ContaPoupanca();

    public int getIdTransacao() {
        return idTransacao;
    }

    public void setIdTransacao(int idTransacao) {
        this.idTransacao = idTransacao;
    }

    public Date getDataTransacao() {
        return dataTransacao;
    }

    public void setDataTransacao(Date dataTransacao) {
        this.dataTransacao = dataTransacao;
    }

    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(ContaCorrente contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public ContaLimite getContaLimite() {
        return contaLimite;
    }

    public void setContaLimite(ContaLimite contaLimite) {
        this.contaLimite = contaLimite;
    }

    public ContaPoupanca getContaPoupanca() {
        return contaPoupanca;
    }

    public void setContaPoupanca(ContaPoupanca contaPoupanca) {
        this.contaPoupanca = contaPoupanca;
    }
}
