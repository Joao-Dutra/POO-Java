package poo;

import java.util.Scanner;

public class ProjetoContaAntigo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Conta c1 = new Conta();
        Cliente cliente1 = new Cliente();

        c1.setTitular(cliente1);
        c1.setNumero(1234);
        c1.setSaldo(1000);

        System.out.println(c1.getSaldo());

        cliente1.setNome("Maria");
        System.out.println(cliente1.getNome());
        cliente1.setCpf("555.222.111-20");
        System.out.println(cliente1.getCpf());

        Conta c2 = new Conta();
        Cliente cliente2 = new Cliente();

        c2.setTitular(cliente2);
        c2.setNumero(4321);
        c2.setSaldo(200);

        System.out.println("A conta " + c1.getNumero() + " é da(o) " + c1.getTitular().getNome() + " e ela(o) tem " + c1.getSaldo() + " de saldo em sua conta. ");

        c1.consultarSaldo();

        System.out.println("Qual o valor a ser sacado?");
        double s = teclado.nextDouble();
        c1.sacarValor(s);

        System.out.println("Qual o valor a ser depositado?");
        double d = teclado.nextDouble();
        c1.depositarValor(d);

        System.out.println("Qual o valor a ser transferido?");
        double t = teclado.nextDouble();
        c1.transferirValor(t, c2);
    }
}
