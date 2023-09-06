package poo;

public class Conta {
    
    // atributos
    
    int numero;
    String titular;
    double saldo;
    
    // metodos
    
    void consultarSaldo(){
        System.out.println("O saldo � " + this.saldo);
    }
    boolean sacarValor(double valorSaque){            
        if (valorSaque > this.saldo) {
            System.out.println("N�o tem como sacar esse saldo.");
            return false;
        }
        else{
            this.saldo -= valorSaque;
            System.out.println("Saldo em sua conta : " + this.saldo);
            return true;
        }
    }
    void depositarValor(double valorDepositar){
        this.saldo += valorDepositar;
        System.out.println("Saldo em sua conta : " + this.saldo);
    }
    void transferirValor(double valorTransferir, Conta destino){
       boolean retirou = this.sacarValor(valorTransferir);
        if (retirou == false) {
            System.out.println("Saldo Insuficiente. Imposs�vel Transferir!");
        }else{
            destino.depositarValor(valorTransferir);
        }
    }
}
