package Menu;

import java.util.Date;

public class Client {

    private String name = "";
    private Date birthDate = new Date();
    private String userCPF[];
    private String email =  "";
    private Date registerDate = new Date();
    private String userAddres = "";


    public Client() {
    }

    public Client(String nome, Date dataNascimento1, String cpfCadastro1, String email1, Date dataCadastro1, String enderecoCadastro1){
        this.name = nome;
        this.birthDate = dataNascimento1;
        this.userCPF = new String[]{cpfCadastro1};
        this.email = email1;
        this.registerDate = dataCadastro1;
        this.userAddres = enderecoCadastro1;
    }

    // getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Date getBirthDate() { return birthDate; }
    public void setBirthDate(Date birthDate) { this.birthDate = birthDate; }

    public String[] getUserCPF() { return userCPF; }
    public void setUserCPF(String userCPF) { this.userCPF = new String[]{userCPF}; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Date getRegisterDate() { return registerDate; }
    public void setRegisterDate(Date registerDate) { this.registerDate = registerDate; }

    public String getUserAddres() { return userAddres; }
    public void setUserAddres(String userAddres) { this.userAddres = userAddres; }

}
