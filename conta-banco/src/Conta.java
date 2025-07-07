public class Conta {
    
    int numero;
    String agencia;
    String nomeCliente;
    double saldo;


    public Conta(){}

     public void visualizarConta() {
        System.out.println("==== Dados da Conta ====");
        System.out.println("Cliente: " + this.nomeCliente);
        System.out.println("Agência: " + this.agencia);
        System.out.println("Número da Conta: " + this.numero);
        System.out.printf("Saldo: R$ %.2f%n", this.saldo);
        System.out.println("========================");
    }
    public void buscarConta(int numeroDaConta) {
        if (this.numero == numeroDaConta) {
            System.out.println("Conta encontrada: " + this.numero);
        } else {
            System.out.println("Conta não encontrada.");
        }
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
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
