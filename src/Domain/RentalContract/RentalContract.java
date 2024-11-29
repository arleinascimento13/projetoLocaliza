package Domain.RentalContract;

import Domain.Client.Client;
import Domain.Vehicle.Vehicle;
import Repository.RentalContractRepository;
import Services.IdGenerator;
import static Repository.RepositoryUtils.addToRepository;

public abstract class RentalContract {
    private String id;
    private Client client;
    private Vehicle vehicle;
//    private Calendar startDate;
//    private Calendar endDate;
    private double totalCost;
    private boolean active;

    //, Calendar startDate, Calendar endDate
    protected RentalContract(Vehicle vehicle, double totalCost, boolean active, RentalContractRepository repo) {
        this.id = IdGenerator.generateID("rentalContract");
        this.vehicle = vehicle;
//        this.startDate = startDate;
//        this.endDate = endDate;  me desculpa ricardo, mas eu to zero paciencia pra tentar organizar essa bomba de data
        this.totalCost = totalCost;

    }

    protected void changeContract(boolean i){
        this.active = i;
    }

    protected String getId() {
        return id;
    }

}
