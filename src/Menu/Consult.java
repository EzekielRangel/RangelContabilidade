package Menu;

import java.util.Scanner;

public class Consult {

    static Client c = new Client();
    Scanner sc = new Scanner(System.in);

    public void startConsult(){
        boolean consulOk = true;
        while (consulOk){
            System.out.println("Digite o CPF do usuário que gostaria de cadastrar (sem pontos)");
            String cpfToConsult = sc.nextLine();

            if(cpfToConsult.equals(c.getUserCPF())){
                showClient();
                consulOk = false;
            } else {
                System.out.println("CPF inválido");
            }
        }
    }

    public void showClient(){
        System.out.println("Informações do client ");
        System.out.println("Nome:  " + c.getName());
        System.out.println("CPF: " + c.getUserCPF());
        System.out.println("Data de nascimento: " + c.getBirthDate());
        System.out.println("Email: " + c.getEmail());
        System.out.println("Endereço: " + c.getUserAddres());
    }
}
