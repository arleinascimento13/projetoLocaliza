# Vehicle Rental System - Object-Oriented Architecture

This document outlines the architecture for a vehicle rental system, adhering strictly to **Object-Oriented Programming (OOP)** principles. The classes model data and behaviors directly associated with entities, while separate services handle business rules.

## 1. Class `Vehicle`
- **Description**: Represents a vehicle available for rental.
- **Attributes**:
  - `String licensePlate`
  - `String model`
  - `String brand`
  - `int year`
  - `String color`
  - `double dailyRate`
  - `boolean available`

- **Instance Methods**:
  - `boolean isAvailable()`: Checks if the vehicle is available for rental.
  - `void changeAvailability(boolean available)`: Updates the availability status of the vehicle.

- **Responsibility**: Models the properties and state of a vehicle (available or rented) without rental logic.

## 2. Class `Client`
- **Description**: Models a client renting vehicles.
- **Attributes**:
  - `String name`
  - `String cpf`
  - `String phone`
  - `String address`
  - `List<RentalContract> activeContracts`

- **Instance Methods**:
  - `void addContract(RentalContract contract)`: Adds a rental contract to the client’s history.
  - `List<RentalContract> getActiveContracts()`: Returns a list of the client’s active contracts.

- **Responsibility**: Manages client data and rental history.

## 3. Class `RentalContract`
- **Description**: Represents a rental contract linking a client to a vehicle for a specific period.
- **Attributes**:
  - `Client client`
  - `Vehicle vehicle`
  - `LocalDate startDate`
  - `LocalDate endDate`
  - `double totalAmount`
  - `boolean active`

- **Instance Methods**:
  - `boolean isActive()`: Checks if the contract is still active.
  - `void closeContract()`: Ends the contract and updates the vehicle’s availability to "available."

- **Responsibility**: Manages the information and state of a specific rental.

## 4. Interface `MaintenanceService`
- **Description**: Defines the services that can be performed on vehicles for maintenance.

- **Methods**:
  - `void scheduleMaintenance(Vehicle vehicle, LocalDate date)`: Schedules maintenance for the vehicle.
  - `void performMaintenance(Vehicle vehicle)`: Marks maintenance as completed.

- **Responsibility**: Models the interface for maintenance services, separating business rules from the `Vehicle` class.

## 5. **Services**

### 5.1 Class `RentalService`
- **Description**: Service handling vehicle rental rules. This service is separate from the `RentalCompany` class to ensure separation of responsibilities.
- **Methods**:
  - `RentalContract rentVehicle(Client client, Vehicle vehicle, int days)`: Creates a rental contract between a client and a vehicle.
  - `void registerReturn(RentalContract contract)`: Finalizes the vehicle rental and updates its availability.

- **Responsibility**: Manages business logic for vehicle rentals and returns.

### 5.2 Class `MaintenanceServiceImplementation`
- **Description**: Concrete implementation of the `MaintenanceService` interface, handling vehicle maintenance.
- **Methods**:
  - `void scheduleMaintenance(Vehicle vehicle, LocalDate date)`: Schedules maintenance for a specific vehicle.
  - `void performMaintenance(Vehicle vehicle)`: Marks maintenance as completed, releasing the vehicle.

- **Responsibility**: Controls maintenance operations for vehicles.

### 5.3 Class `ReportService`
- **Description**: Service for generating reports.
- **Methods**:
  - `void generateAvailableVehiclesReport(List<Vehicle> fleet)`: Generates a report of all available vehicles.
  - `void generateActiveRentalsReport(List<RentalContract> contracts)`: Generates a report of active rentals.
  - `void generateClientReport(List<Client> clients)`: Generates a report of clients and their rentals.

- **Responsibility**: Provides reporting functionalities, separating these operations from the application logic.

## 6. Class `Application`
- **Description**: AmbientTests.Test class to start the application.
- **Methods**:
  - `public static void main(String[] args)`: System entry point, initializing dependencies and simulating operations.

- **Responsibility**: Controls application execution without business logic.

---
