package Menu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Register {
    Scanner sc = new Scanner(System.in);

    public Register() {
        super();
    }

    Client client = new Client();
    Address address = new Address();

    public boolean isCpfValid(String cpf) {
        if (cpf == null || cpf.length() != 11) {
            return false;
        }
        for (char c : cpf.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false; // find a char that is not a number
            }
        }
        return true;
    }


    public void registerUser() {

        boolean isNameOk = true;
        while(isNameOk){
            System.out.println("Digite o nome do cliente que gostaria de cadastrar: ");
            String inputName = sc.nextLine();

            if (inputName.matches(".*\\d.*")) {
                System.out.println("Nome inválido, não pode conter numeros");
            } else {
                client.setName(inputName);
                System.out.println("Name cadastrado com sucesso!");
                isNameOk = false;
            }
        }

        boolean isBirthDateOk = true;
        while (isBirthDateOk){
            System.out.println("\nDigite a data de nascimento dd/mm/yyyy: ");
            String inputDateUser = sc.next();

            //logica de verificar se a data informada esta correta
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);

            try {
                Date parsedDate = sdf.parse(inputDateUser);
                client.setBirthDate(parsedDate);
                System.out.println("Data de nascimento cadastrada com sucesso! ");
                isBirthDateOk = false;
            } catch (ParseException e) {
                System.out.println("Data inválida");
            }
        }

        boolean isCpfOk = true;
        while(isCpfOk){
            System.out.println("\nDigite o CPF para o cadastro: ");
            String inputCPF = sc.nextLine();

            if (isCpfValid(inputCPF)) {
                client.setUserCPF(inputCPF);
                System.out.println("CPF cadastrado com sucesso!");
                isCpfOk = false;
            } else {
                System.out.println("CPF inválido! Digite 11 dígitos numéricos.");
            }
        }

        boolean isEmailOk = true;
        while(isEmailOk){
            System.out.println("\nDigite o email para adicionar ao cadastro: ");
            client.setEmail(sc.nextLine());
            System.out.println("Email cadastrado com sucesso!");
            isEmailOk = false;
        }


        //verificar se par o registerDate, preciso fazer a msm logica da data novamente, ou é so passar diferentes valores


        registerUserAddres();
    }


    public Address registerUserAddres() {

        System.out.println("Digite o nome da rua: ");
        address.setRoadName(sc.nextLine());

        boolean isHousNumbOk = true;
        while (isHousNumbOk){
            System.out.println("Digite o numero da casa: ");
            String houseNumInput = sc.nextLine();

            if(houseNumInput.matches(".*[A-Za-z].*")) {
                System.out.println("Numero da casa inválido! Digite um numero válido;");
            } else {
                Integer houseNum = Integer.parseInt(houseNumInput);
                address.setHouseNum(houseNum);
                isHousNumbOk = false;
            }
        }

        System.out.println("Digite a cidade: ");
        address.setCity(sc.nextLine());

        System.out.println("Digite o bairro: ");
        address.setDistrict(sc.nextLine());

        System.out.println("Digite o estado: ");
        address.setEstate(sc.nextLine());

        return address;
    }
}
