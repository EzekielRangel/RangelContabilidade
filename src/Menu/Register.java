package Menu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Register extends Client{
    Scanner sc = new Scanner(System.in);

    public Register() {
        super();
    }

    public Register(String name, Date birthDate, String userCPF, String email, Date registerDate, String userAddres) {
        super(name, birthDate, userCPF, email, registerDate, userAddres);
    }

    public boolean validatorCPF(String cpf) {
        if (cpf == null || cpf.length() != 11) {
            return false;
        }
        for (char c : cpf.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false; // encontrou caractere que não é número
            }
        }
        return true;
    }


    public void registerUser(){

        System.out.println("Digite o nome do cliente que gostaria de cadastrar: ");
        setName(sc.nextLine());

        System.out.println("\nDigite a data de nascimento dd/mm/yyyy: ");
        String inputDateUser = sc.next();

        //logica de verificar se a data informada esta correta
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);

        try{
            Date parsedDate = sdf.parse(inputDateUser);
            setBirthDate(parsedDate);
        }catch (ParseException e){
            System.out.println("Data inválida");
        }

        System.out.println("\nDigite o CPF para o cadastro: ");
        String inputCPF = sc.nextLine();

        if(validatorCPF(inputCPF)){
            setUserCPF(inputCPF);
            System.out.println("CPF cadastrado com sucesso!");
        } else {
            System.out.println("CPF inválido! Digite 11 dígitos numéricos.");
        }


        System.out.println("\nDigite o email para adicionar ao cadastro: ");
        setEmail(sc.nextLine());

        //verificar se par o registerDate, preciso fazer a msm logica da data novamente, ou é so passar diferentes valores

        System.out.println("\nDigite o endereço do cliente para adicionar ao cadastro: ");
        setUserAddres(sc.nextLine());

    }
}
