package Domain.Client;

import Domain.RentalContract.RentalContract;
import Repository.ClientRepository;
import Services.IdGenerator;

import java.util.ArrayList;
import java.util.List;

import static Repository.RepositoryUtils.addToRepository;

public abstract class Client{
    private final ClientRepository repo;
    private String id;
    private String name;
    private String address;
    private String number;
    ArrayList<RentalContract> activeContracts;

    protected Client(String name, String address, String number, ClientRepository repo) {
        this.id = IdGenerator.generateID("client");
        this.name = name;
        this.address = address;
        this.number = number;
        this.repo = repo;
        this.activeContracts = new ArrayList<>();
    }

    public void addContract(RentalContract contract) {
        this.activeContracts.add(contract);
    }

    protected List<RentalContract> getActiveContracts() {
        return activeContracts;
    }

    public String getName() {
        return name;
    }
}
