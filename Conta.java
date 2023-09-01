package poo;

public class Conta {
    
    // atributos
    
    int numero;
    String titular;
    double saldo;
    
    // metodos
    
    void consultarSaldo(){
        System.out.println("O saldo é " + this.saldo);
    }
    boolean sacarValor(double valorSaque){            
        if (valorSaque > this.saldo) {
            System.out.println("Não tem como sacar esse saldo.");
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
}
