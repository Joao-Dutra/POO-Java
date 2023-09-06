package poo;

import java.util.Scanner;

public class ProjetoTelevisor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Televisor TV = new Televisor();

        TV.canal = 1;
        TV.volume = 0;
        TV.ligado = false;

        TV.statusTelevisor();

        if (TV.status == false) {

            char ligar = entrada.next().charAt(0);
            String fim = "iniciar";
            String comando = "";

            if (ligar == 's') {
                TV.ligarTelevisor();
                System.out.println("Para desligar o Televisor basta digitar : e ");
                while (comando != fim) {
                    
                    comando = entrada.nextLine();
                    
                    switch (comando) {
                        case "w":
                            TV.aumentarVolume();
                            break;
                        case "s":
                            TV.reduzirVolume();
                            break;
                        case "d":
                            TV.subirCanal();
                            break;
                        case "a":
                            TV.descerCanal();
                            break;
                        case "q":
                            TV.mostraStatus();
                            break;
                        case "e":    
                            comando = fim;
                    }
                    
                }
                TV.desligarTelevisor();
            }

        }

    }
}
