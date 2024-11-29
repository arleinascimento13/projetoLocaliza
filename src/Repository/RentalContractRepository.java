package Repository;

import Domain.RentalContract.RentalContract;

import java.util.ArrayList;
import java.util.List;

public class RentalContractRepository implements IRepository<RentalContract> {
    ArrayList<RentalContract> list;

    public RentalContractRepository(){
        this.list = new ArrayList<>();
    }

    @Override
    public void create(RentalContract i) {
        list.add(i);
    }

    @Override
    public List<RentalContract> getAll() {
        return list;
    }

    @Override
    public RentalContract get(String i) {
        return null;
    }

    @Override
    public void delete(RentalContract i) {

    }

    @Override
    public void edit(RentalContract i) {

    }
}
