package Repository;

import Domain.Client.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientRepository implements IRepository<Client> {
    ArrayList<Client> list;

    public ClientRepository(){
        this.list = new ArrayList<>();
    }

    @Override
    public List<Client> getAll() {
        return list;
    }

    @Override
    public void create(Client i) {
        list.add(i);
    }

    @Override
    public Client get(String i) {
        for (Client client : list){
            if (i.equals(client.getName())){
                return client;
            }
        }
        return null;
    }

    @Override
    public void delete(Client i) {
        list.remove(i);
    }

    @Override
    public void edit(Client i) {

    }
}
