
public class Main {
    public static void main(String[] args) {

    }


    /*Scanner leitor = new Scanner(System.in);
    Perguntas listaPrincipal = new Perguntas();
    int opcao = -1;

        while (opcao != 3) {
        System.out.println(listaPrincipal.listaPerguntas);
        opcao = leitor.nextInt();
        if (!Arrays.asList(Perguntas.quantidadeDePerguntas).contains(opcao)) {
            System.out.println("Opção diggitada inválida, por favor digite uma opção válida");
        }

        switch (opcao) {
            //cadastra o usuario
            case 1:
                System.out.println(listaPrincipal.caso1Perguntas);
                //digita o nome e salva nome
                System.out.println("Digite o nome: ");
                leitor.nextLine();
                listaPrincipal.nome = leitor.nextLine();
                //digita cpf e salva cpf
                System.out.println("Digite o CPF: ");
                listaPrincipal.cpfCadastro1 = leitor.nextLine();
                //digita data de nascimento e salva a mesma
                System.out.println("Digite a data de nascimento (dd/mm/aaaa)");
                listaPrincipal.dataNascimento1 = leitor.nextLine();
                //digita o email e salva o email
                System.out.println("Digite o email: ");
                listaPrincipal.email1 = leitor.nextLine();
                //digitar endereço
                System.out.println("Digite o seu endereço completo + CEP: ");
                listaPrincipal.endereçoCadastro1 = leitor.nextLine();
                //data do cadastro
                System.out.println("Data do cadastro: ");
                listaPrincipal.dataCadastro1 = leitor.nextLine();
                break;
            //consulta as inforamções do usuario
            case 2:
                System.out.println("Digite o CPF de cliente que gostaria de consultar:  \n");
                String cpfDigitadoConsulta = leitor.nextLine();
                leitor.nextLine();
                if (listaPrincipal.cpfCadastro1 == null) {
                    System.out.println("Nenhum usuário cadastrado ainda");
                } else if (cpfDigitadoConsulta == listaPrincipal.cpfCadastro1) {
                    System.out.printf("Nome: %S \n" +
                            "CPF: %S \n" +
                            "DATA DE NASCIMENTO: %S \n" +
                            "Email cadastrado: %S \n" +
                            "Endereço completo: %S \n" +
                            "Data de cadastro: %S \n", listaPrincipal.nome, listaPrincipal.cpfCadastro1, listaPrincipal.dataNascimento1, listaPrincipal.email1, listaPrincipal.endereçoCadastro1, listaPrincipal.dataCadastro1);
                }
                break;
            // sai da aba menu
            case 3:
        }
    }*/
}