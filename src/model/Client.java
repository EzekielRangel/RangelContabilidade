package model;

import java.util.Date;

public class Client {
    private String name;
    private Date birthDate;
    private String userCPF;
    private String email;
    private Date registerDate;
    private Address address;

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

    public Address getUserAddress() { return address; }
    public void setUserAddress(Address userAddress) { this.address = userAddress; }

}
