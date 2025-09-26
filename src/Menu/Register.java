package Menu;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Register {
    Scanner sc = new Scanner(System.in);

    public String nome = "";
    public Date dataNascimento1 = new Date();
    public String cpfCadastro1 = "";
    public String email1 =  "";
    public Date dataCadastro1 = new Date();
    public String endereçoCadastro1 = "";

    public void registerUser(){

        System.out.println("Digite o nome do cliente que gostaria de cadastrar: ");
        nome = sc.nextLine();

        System.out.println("\nDigite a data de nascimento dd/mm/yyyy: ");
        String inputDateUser = sc.next();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);

    }
}
