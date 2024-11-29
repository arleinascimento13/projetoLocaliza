package Services;

import Domain.Client.ClientPessoaFisica;
import Domain.Client.ClientPessoaJuridica;
import Domain.RentalContract.RentalContract;
import Domain.RentalContract.RentalContractCNPJ;
import Domain.RentalContract.RentalContractCPF;
import Domain.Vehicle.Vehicle;
import Repository.RentalContractRepository;

public class ContractValidator {
    public static void validatePJ (ClientPessoaJuridica pj, Vehicle v, int totalCost, RentalContractRepository rcp){

        RentalContractCNPJ x = new RentalContractCNPJ(pj,v,totalCost, true, rcp);
    }

    public static void validateCPF (ClientPessoaFisica pf, Vehicle v, int totalCost, RentalContractRepository rcp){
        RentalContractCPF x = new RentalContractCPF(pf,v,totalCost, true, rcp);
    }
}
