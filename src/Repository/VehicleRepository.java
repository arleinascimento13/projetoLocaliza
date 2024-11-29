package Repository;

import Domain.Client.Client;
import Domain.Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleRepository implements IRepository<Vehicle>{
    ArrayList<Vehicle> list;

    public VehicleRepository(){
        this.list = new ArrayList<>();
    }

    @Override
    public List<Vehicle> getAll() {
        return list;
    }

    @Override
    public void create(Vehicle i) {
        list.add(i);
    }

    @Override
    public Vehicle get(String i) {
        for (Vehicle LicensePlate : list){
            if (i.equals(LicensePlate.getLicensePlate())){
                return LicensePlate;
            }
        }
        return null;
    }

    @Override
    public void delete(Vehicle i) {
        list.remove(i);
    }

    @Override
    public void edit(Vehicle i) {

    }
}
