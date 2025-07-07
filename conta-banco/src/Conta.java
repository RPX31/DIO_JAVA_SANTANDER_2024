public class Conta {
    
    int numero;
    String agencia;
    String nomeCliente;
    double saldo;


    public Conta(){};

    
    public void buscarConta(int numeroDaConta){

       numeroDaConta = this.getNumero();

        System.out.println("Conta encontrada" + numeroDaConta);
    }
    public void depositar(double valor){

        this.setSaldo(this.getSaldo() + valor ) ;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
