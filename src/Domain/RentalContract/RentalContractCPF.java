package Domain.RentalContract;

import Domain.Client.ClientPessoaFisica;
import Domain.Vehicle.Vehicle;
import Repository.RentalContractRepository;

public class RentalContractCPF extends RentalContract {
    private ClientPessoaFisica cpf;
    public RentalContractCPF(ClientPessoaFisica cpf, Vehicle vehicle, double totalCost, boolean active, RentalContractRepository repo) {
        super(vehicle, totalCost, active, repo);
        this.cpf = cpf;
        cpf.addContract(this);
    }


}
