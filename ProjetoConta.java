package poo;

import java.util.Scanner;

public class ProjetoConta {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Conta c1 = new Conta();
        Cliente cliente1 = new Cliente();
        c1.setTitular(cliente1);        

        System.out.println("Qual o número de sua conta? ");
        int numero = entrada.nextInt();
        c1.setNumero(numero);
        System.out.println("Qual o saldo da sua conta? ");
        int saldo = entrada.nextInt();
        c1.setSaldo(saldo);
        
        System.out.println("Qual o nome referente a sua conta? ");
        String nomecliente = entrada.nextLine();
        cliente1.setNome(nomecliente);
        
        System.out.println("Qual o CPF referente a sua conta? ");
        String cpfcliente = entrada.nextLine();
        cliente1.setCpf(cpfcliente);
        
        System.out.println("Qual o endereço referente a sua conta? ");
        String endereçocliente = entrada.nextLine();
        cliente1.setEndereço(endereçocliente);
        
        System.out.println("Qual o fone referente a sua conta? ");
        String fonecliente = entrada.nextLine();
        cliente1.setFone(fonecliente);        
        
        int fim = 0, escolha = 0;
        
        while( fim != 3){
            System.out.println("Digite: \n 1- para depositar \n 2- para sacar \n 3- para finalizar o programa");
            escolha = entrada.nextInt();
            if (escolha == 1) {
                System.out.println("Qual o valor a ser depositado?");
                int depositar = entrada.nextInt();
                c1.depositarValor(depositar);
                c1.getSaldo();
                System.out.println("Digite: \n 1- para depositar \n 2- para sacar \n 3- para finalizar o programa");
                escolha = entrada.nextInt();
            }
            if (escolha == 2) {
                System.out.println("Qual o valor a ser sacado?");
                int sacar = entrada.nextInt();
                c1.sacarValor(sacar);
                c1.getSaldo();
                if (true) {
                    System.out.println("Saque efetuado com sucesso!");
                }else if (false){
                    System.out.println("Saque não efetuado!");
                }
            }
            if (escolha == 3) {
                fim = 3;
            }
        }
    }
}
