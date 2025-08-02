
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        perguntas listaPrincipal = new perguntas();
        String nomePF = "";
        String dataNascimento1 = null;
        long cpfCadastro1 = -1;
        int option = -1;

        while(option != 3){
            System.out.println(listaPrincipal.listaPerguntas);
            option = reader.nextInt();
            if (!Arrays.asList(perguntas.quantidadeDePerguntas).contains(option)){
                System.out.println("Opção digitada inválida, por favor digite uma opção válida");
            }

            switch(option){
                case 1:
                    System.out.println(listaPrincipal.caso1Perguntas);
                    reader.nextLine();
                    System.out.println("Digite o nome: ");
                    nomePF = reader.nextLine();
                    System.out.println("Digite o CPF: ");
                    cpfCadastro1 = reader.nextLong();
                    System.out.println("Digite a data de nascimento (dd/mm/aaaa)");
                    dataNascimento1 = reader.nextLine();
                    reader.nextLine();
                    break;
                case 2:
                    System.out.println("Digite o CPF de quem gostaria de consultar:  \n");
                    long cpfDigitadoConsulta = reader.nextLong();
                    if(cpfCadastro1 == -1){
                        System.out.println("Nenhum usuário cadastrado ainda");
                    } else if(cpfDigitadoConsulta == cpfCadastro1){
                        System.out.printf("Nome %S \n" +
                                "CPF %d \n" +
                                "DATA DE NASCIMENTO %s \n", nomePF, cpfCadastro1, dataNascimento1);
                    }
                    break;
                case 3:
                    System.out.println("Programa finalizado com sucesso");
                    break;
            }
        }
    }
}