package Domain.Vehicle;

import Repository.VehicleRepository;
import Services.IdGenerator;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import static Repository.RepositoryUtils.addToRepository;


public class Vehicle {
    private String id;
    private String licensePlate;
    private String model;
    private String brand;
    private boolean available;

    public Vehicle(String licensePlate, String model, String brand, boolean available, VehicleRepository repo) {
        this.id = IdGenerator.generateID("vehicle");
        this.licensePlate = licensePlate;
        this.model = model;
        this.brand = brand;
        this.available = available;

        addToRepository(repo, this);
    }

    public boolean isAvailable() {
        return this.available;
    }

    public void changeAvailability(boolean available) {
        this.available = available;
    }

//    public String formattedDate(){
//        SimpleDateFormat sdf = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy");
//        String formattedDate = sdf.format(prodDate.getTime());
//        return formattedDate;
//    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "licensePlate='" + licensePlate + '\'' +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", available=" + available +
                '}';
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getModel() {
        return model;
    }
}
