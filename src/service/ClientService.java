package service;

import model.Client;
import model.Address;
import repository.ClientRepository;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ClientService {

    Scanner sc = new Scanner(System.in);
    private ClientRepository clientRepository;
    Address address = new Address();

    public ClientService(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

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
        Client client = new Client();

        while(true){
            System.out.println("\nDigite o CPF para o cadastro: ");
            String inputCPF = sc.nextLine();

            if (isCpfValid(inputCPF)) {
                client.setUserCPF(inputCPF);
                System.out.println("CPF cadastrado com sucesso!");
                break;
            } else {
                System.out.println("CPF inválido! Digite 11 dígitos numéricos.");
            }
        }

        while(true){
            System.out.println("Digite o nome do cliente que gostaria de cadastrar: ");
            String inputName = sc.nextLine();

            if (inputName.matches(".*\\d.*")) {
                System.out.println("Nome inválido, não pode conter numeros");
            } else {
                client.setName(inputName);
                System.out.println("Nome cadastrado com sucesso!");
                break;
            }
        }

        while (true){
            System.out.println("\nDigite a data de nascimento dd/mm/yyyy: ");
            String inputDateUser = sc.next();
            //logica de verificar se a data informada esta correta
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);

            try {
                Date parsedDate = sdf.parse(inputDateUser);
                client.setBirthDate(parsedDate);
                System.out.println("Data de nascimento cadastrada com sucesso! ");
                break;
            } catch (ParseException e) {
                System.out.println("Data inválida");
            }
        }

        while(true){
            System.out.println("\nDigite o email para adicionar ao cadastro: ");
            client.setEmail(sc.nextLine());
            System.out.println("Email cadastrado com sucesso!");
            break;
        }

        registerUserAddres();

        clientRepository.addClient(client);
        System.out.println("Cliente adicionado ao repositório com sucesso!");
    }

    public Address registerUserAddres() {

        System.out.println("Digite o nome da rua: ");
        address.setStreetName(sc.nextLine());

        while (true){
            System.out.println("Digite o numero da casa: ");
            String houseNumInput = sc.nextLine();

            if(houseNumInput.matches(".*[A-Za-z].*")) {
                System.out.println("Numero da casa inválido! Digite um numero válido");
            } else {
                Integer houseNum = Integer.parseInt(houseNumInput);
                address.setNumber(houseNum);
                break;
            }
        }

        System.out.println("Digite a cidade: ");
        address.setCity(sc.nextLine());

        System.out.println("Digite o bairro: ");
        address.setDistrict(sc.nextLine());

        while(true){
            System.out.println("Digite o estado: ");
            String stateInput = sc.nextLine();

            if(stateInput.matches(".*\\d.*")) {
                System.out.println("Estado inválido! Digite um estado válido");
            } else {
                address.setState(stateInput);
                break;
            }
        }
        return address;
    }

    public void startConsult(){
        boolean consultOk = true;
        while (consultOk){
            System.out.println("Digite o CPF do usuário que gostaria de cadastrar (sem pontos)");
            String cpfToConsult = sc.nextLine();

            Client found = clientRepository.getActiveClientSet().stream().filter(c -> c.getUserCPF().equals(cpfToConsult)).findFirst().orElse(null);

            if (found != null) {
                showClient(found);
            } else {
                System.out.println("Cliente não encontrado.");
            }
        }
    }

    public void showClient(Client client) {
        System.out.println("Informações do cliente:");
        System.out.println("CPF: " + client.getUserCPF());
        System.out.println("Nome: " + client.getName());
        System.out.println("Data de nascimento: " + client.getBirthDate());
        System.out.println("Email: " + client.getEmail());
        System.out.println("Endereço: " + client.getUserAddress().toString());
    }
}




