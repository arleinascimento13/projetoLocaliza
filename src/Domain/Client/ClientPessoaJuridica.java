package Domain.Client;

import Repository.ClientRepository;
import static Repository.RepositoryUtils.addToRepository;

public class ClientPessoaJuridica extends Client {
    private int cpnj;

    public ClientPessoaJuridica(String agent, String address, String number, ClientRepository repo, int cpnj) {
        super(agent, address,  number,repo);
        this.cpnj = cpnj;

        addToRepository(repo, this);
    }
}
