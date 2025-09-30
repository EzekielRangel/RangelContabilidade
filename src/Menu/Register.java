package Menu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Register extends Client{
    Scanner sc = new Scanner(System.in);

    public Register(String nome, Date dataNascimento1, String cpfCadastro1, String email1, Date dataCadastro1, String endereçoCadastro1) {
        super(nome, dataNascimento1, cpfCadastro1, email1, dataCadastro1, endereçoCadastro1);
    }

    public Register() {
        super();
    }

    public void registerUser(){

        System.out.println("Digite o nome do cliente que gostaria de cadastrar: ");
        nome = sc.nextLine();

        System.out.println("\nDigite a data de nascimento dd/mm/yyyy: ");
        String inputDateUser = sc.next();

        //logica de verificar se a data informada esta correta
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);

        try{
            Date parsedDate = sdf.parse(inputDateUser);
        }catch (ParseException e){
            System.out.println("Data inválida");
        }

        System.out.println("\nDigite o CPF para o cadastro: ");
        cpfCadastro1 = sc.nextLine();

        System.out.println("\nDigite o email para adicionar ao cadastro: ");
        email1 = sc.nextLine();

        System.out.println("\nDigite o email para ser cadastrado");

    }
}
