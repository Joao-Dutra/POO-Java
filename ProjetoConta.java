package poo;

import java.util.Scanner;

public class  ProjetoConta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        Conta c1 = new Conta();
        Cliente cliente1 = new Cliente();
        
        c1.titular = cliente1;
        c1.numero = 1234;
        c1.saldo = 1000;
        
        
        
        c1.titular.nome = "Maria";
        System.out.println(c1.titular.nome);
        cliente1.cpf = "555.222.111-20";
        System.out.println(cliente1.cpf);
        
        
        
        Conta c2 = new Conta();
        Cliente cliente2 = new Cliente();
        
        c2.titular = cliente2;
        c2.numero = 4321;
        c2.saldo = 200;
        
        System.out.println("A conta " + c1.numero + " é da(o) " + c1.titular + " e ela(o) tem " + c1.saldo + " de saldo em sua conta. ");
        
        
        c1.consultarSaldo();
        
        
        System.out.println("Qual o valor a ser sacado?");
        double s = teclado.nextDouble();
        c1.sacarValor(s);
            
        
        System.out.println("Qual o valor a ser depositado?");
        double d = teclado.nextDouble();
        c1.depositarValor(d);
        
        System.out.println("Qual o valor a ser transferido?");
        double t = teclado.nextDouble();
        c1.transferirValor(t,c2);
    }
}
