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

    public ClientService(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

    public boolean isCpfValid(String cpf) {
        if (cpf == null || cpf.length() != 11) {
            return false;
        }
        for (char c : cpf.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public void registerUser() {

        Client client = new Client();

        while(true){
            System.out.println("\nDigite o CPF para o cadastro: ");
            String inputCPF = sc.nextLine();


            if(clientRepository.getActiveClientSet().contains(inputCPF)){
                System.out.println("CPF já cadastrado, por favor, digite um novo CPF");
            } else if (isCpfValid(inputCPF)) {
                client.setUserCPF(inputCPF);
                System.out.println("CPF cadastrado com sucesso!");
                break;
            } else {
                System.out.println("CPF inválido! Digite 11 dígitos numéricos");
            }
            //if (isCpfValid(inputCPF)) {
            //    client.setUserCPF(inputCPF);
            //    System.out.println("CPF cadastrado com sucesso!");
            //    break;
            //} else {
            //    System.out.println("CPF inválido! Digite 11 dígitos numéricos.");
            //}
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

        Address address = getUserAddress();
        client.setUserAddress(address);

        clientRepository.addClient(client);
        System.out.println("Cliente adicionado ao repositório com sucesso!");
    }

    public Address getUserAddress() {

        Address address = new Address();

        System.out.println("Digite o nome da rua: ");
        address.setStreetName(sc.nextLine());

        while (true){
            System.out.println("Digite o número da casa: ");
            String houseNumInput = sc.nextLine();

            if (houseNumInput.isBlank()) {
                System.out.println("Digite um número");
                continue;
            } if (houseNumInput.matches("\\d+")) {
                address.setNumber(houseNumInput);
                break;
            }
            System.out.println("Digite apenas números");
        }

        while (true) {
            System.out.println("Digite a cidade: ");
            String city = sc.nextLine();

            if (!city.isBlank()) {
                address.setCity(city);
                break;
            }

            System.out.println("A cidade não pode ser vazia");
        }

        while(true){
            System.out.println("Digite o bairro: ");
            String district = sc.nextLine();

            if(!district.isBlank()){
                address.setDistrict(district);
                break;
            }

            System.out.println("O bairro não pode estar vazio");
        }

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




