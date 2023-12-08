package poo;

public class Finally {

    public static void main(String[] args) {

        try {
            int vet[] = new int[4];
            System.out.println("Msg antes da excecao:");
            vet[4] = 1;
            System.out.println("Esta mensagem nao vai ser exibida"); // est� linha nunca vai ser executada.
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e ) { // ArithmeticException e somente para ilustra��o do uso do |
            System.out.println("Ocorreu uma excecao ao tentar acessar uma variavel inexistente");
        } finally {
            System.out.println("Essa mensagem sempre sera executada!");
        }
    }

}
