package Menu;

import java.util.Date;

public class Client {

    private String nome = "";
    private Date dataNascimento1 = new Date();
    private String cpfCadastro1 = "";
    private String email1 =  "";
    private Date dataCadastro1 = new Date();
    private String endereçoCadastro1 = "";

    public Client(String nome, Date dataNascimento1, String cpfCadastro1, String email1, Date dataCadastro1, String endereçoCadastro1){
        this.nome = nome;
        this.dataNascimento1 = dataNascimento1;
        this.cpfCadastro1 = cpfCadastro1;
        this.email1 = email1;
        this.dataCadastro1 = dataCadastro1;
        this.endereçoCadastro1 = endereçoCadastro1;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Date getDataNascimento1() { return dataNascimento1; }
    public void setDataNascimento1(Date dataNascimento1) { this.dataNascimento1 = dataNascimento1; }

    public String getCpfCadastro1() { return cpfCadastro1; }
    public void setCpfCadastro1(String cpfCadastro1) { this.cpfCadastro1 = cpfCadastro1; }
}
