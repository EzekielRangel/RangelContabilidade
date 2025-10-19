package Menu;

import java.util.Date;

public class Client {

    private String name = "";
    private Date birthDate = new Date();
    private String userCPF;
    private String email =  "";
    private Date registerDate = new Date();
    Address address = new Address();


    public Client() {
    }

    //client construcotor
    public Client(String name, Date birthDate, String userCPF, String email, Date registerDate, Address addres){
        this.name = name;
        this.birthDate = birthDate;
        this.userCPF = userCPF;
        this.email = email;
        this.registerDate = registerDate;
        this.address = addres;
    }

    // getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Date getBirthDate() { return birthDate; }
    public void setBirthDate(Date birthDate) { this.birthDate = birthDate; }

    public String getUserCPF() { return userCPF; }
    public void setUserCPF(String userCPF) { this.userCPF = userCPF; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Date getRegisterDate() { return registerDate; }
    public void setRegisterDate(Date registerDate) { this.registerDate = registerDate; }

    public Address getUserAddres() { return address; }
    public void setUserAddres(Address userAddres) { this.address = userAddres; }

}
