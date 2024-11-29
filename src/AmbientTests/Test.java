package AmbientTests;

import java.util.Calendar;
import java.util.List;

import Domain.Client.Client;
import Domain.Client.ClientPessoaFisica;
import Domain.Client.ClientPessoaJuridica;
import Domain.RentalContract.RentalContract;
import Domain.Vehicle.Vehicle;
import Repository.ClientRepository;
import Repository.RentalContractRepository;
import Repository.VehicleRepository;
import Services.ContractValidator;

import static Services.ContractValidator.validateCPF;
import static Services.ContractValidator.validatePJ;

public class Test {
    public static void main(String[] args) {
        RentalContractRepository repoRC = new RentalContractRepository();
        ClientRepository repoC = new ClientRepository();
        VehicleRepository repoV = new VehicleRepository();

        Vehicle v = new Vehicle("ECV-AAA","Camaro", "Chevrolet", true, repoV);
        ClientPessoaFisica cpf = new ClientPessoaFisica("Arlei", "Rua Amarela, 123", "81979107860", repoC, 123);
        ClientPessoaJuridica cpj = new ClientPessoaJuridica("Arlei", "Rua Amarela, 123", "81979107860", repoC, 123);

        validatePJ(cpj, v, 1200,repoRC);
        validateCPF(cpf, v, 1200,repoRC);
    }
}