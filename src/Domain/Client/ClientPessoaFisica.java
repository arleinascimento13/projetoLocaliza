package Domain.Client;

import Repository.ClientRepository;
import static Repository.RepositoryUtils.addToRepository;

public class ClientPessoaFisica extends Client{
    private int cpf;
    public ClientPessoaFisica(String agent, String address, String number, ClientRepository repo, int cpf) {
        super(agent, address,  number, repo);
        this.cpf = cpf;

        addToRepository(repo, this);
    }

    public Object getType(){
        return cpf;
    }
}
