package poo;

import java.util.Scanner;

public class  ProjetoConta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        Conta c1 = new Conta();
        
        c1.titular = "Giacomin";
        c1.numero = 1234;
        c1.saldo = 1500;
        
        Conta c2 = new Conta();
        
        c2.titular = "Zé";
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
