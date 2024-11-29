package Domain.RentalContract;

import Domain.Client.ClientPessoaFisica;
import Domain.Client.ClientPessoaJuridica;
import Domain.Vehicle.Vehicle;
import Repository.RentalContractRepository;

import static Repository.RepositoryUtils.addToRepository;

public class RentalContractCNPJ extends RentalContract {
    private ClientPessoaJuridica cpnj;

    public RentalContractCNPJ(ClientPessoaJuridica cpnj, Vehicle vehicle, double totalCost, boolean active, RentalContractRepository repo) {
        super(vehicle, totalCost, active, repo);
        this.cpnj = cpnj;
        cpnj.addContract(this);
        changeContract(active);
        vehicle.changeAvailability(false);
        addToRepository(repo, this);
    }
}
