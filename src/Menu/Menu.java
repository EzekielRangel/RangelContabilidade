package Menu;

import repository.ClientRepository;
import service.ClientService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    Scanner sc = new Scanner(System.in);

    public void showMenu(){

        int option = 0;
        ClientRepository clientRepository = new ClientRepository();
        ClientService clientService = new ClientService(clientRepository);

        do {
            System.out.println("""
            ======== MENU ========
            [1] - CADASTRAR USUARIO
            [2] - CONSULTAR USUARIO
            [0] - SAIR DO PROGRAMA
            ======================
            """);
            System.out.println("Digite o que gostaria de realizar");
            String inputOption = sc.nextLine();

            try{
                option = Integer.parseInt(inputOption);
                
                if(option < 0){
                    System.out.println("Digite um número dentro do intervalo permitido!");
                } else {
                    switch(option){
                        case 1:
                            clientService.registerUser();
                            break;
                        case 2:
                            clientService.startConsult();
                            break;
                        case 0:
                            System.out.println("Programa encerrado com sucesso");
                            break;
                        default:
                            System.out.println("Opção inválida");
                    }
                }
            } catch (Exception ex){
                System.out.println("Digite um número válido!");
            }
        } while (option != 0);
    }
}
