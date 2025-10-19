package Menu;

import java.util.Scanner;

public class Menu {

    static Scanner sc = new Scanner(System.in);

    public void showMenu(){

        int option;

        do {
            System.out.println("""
            ======== MENU ========
            [1] - CADASTRAR USUARIO
            [2] - CONSULTAR USUARIO
            [0] - SAIR DO PROGRAMA
            ======================
            """);
            System.out.println("Digite o que gostaria de realizar");
            option = sc.nextInt();

            switch(option){
                case 1:
                    Register reg = new Register();
                    reg.registerUser();
                    break;

                case 2:
                    Consult consult = new Consult();
                    consult.startConsult();
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        } while (option != 0);
    }
}
