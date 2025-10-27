package repository;

import model.Client;

import java.util.HashSet;
import java.util.Set;

public class ClientRepository {

    private Set<Client> activeClientSet = new HashSet<>();

    public Set<Client> getActiveClientSet() { return activeClientSet; }

    public void addClient(Client client) { activeClientSet.add(client); }

}
