package parcialpracticas.ModelController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class ParcialPracticas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ArrayList de vehículos
        ArrayList<Vehicle<?>> vehicles = new ArrayList<>();

        // Solicitar datos del usuario para Car
        System.out.print("Ingrese el ID del coche: ");
        String carId = scanner.nextLine();
        System.out.print("Ingrese el modelo del coche: ");
        String carModel = scanner.nextLine();
        Vehicle<String> car = new Car(carId, carModel);

        // Solicitar datos del usuario para Truck
        System.out.print("Ingrese el ID del camión: ");
        int truckId = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea
        System.out.print("Ingrese el modelo del camión: ");
        String truckModel = scanner.nextLine();
        Vehicle<Integer> truck = new Truck(truckId, truckModel);

        vehicles.add(car);
        vehicles.add(truck);

        // Iterar sobre ArrayList
        System.out.println("Iterando sobre ArrayList:");
        for (Vehicle<?> vehicle : vehicles) {
            vehicle.startEngine();
            vehicle.drive();
            System.out.println("ID del vehículo: " + vehicle.getId());
            System.out.println("Modelo del vehículo: " + vehicle.getModel());
            System.out.println();
        }

        // HashMap de vehículos
        HashMap<String, Vehicle<?>> vehicleMap = new HashMap<>();
        vehicleMap.put(carId, car);
        vehicleMap.put(String.valueOf(truckId), truck);

        // Iterar sobre HashMap
        System.out.println("Iterando sobre HashMap:");
        for (String key : vehicleMap.keySet()) {
            Vehicle<?> vehicle = vehicleMap.get(key);
            vehicle.startEngine();
            vehicle.drive();
            System.out.println("ID del vehículo: " + vehicle.getId());
            System.out.println("Modelo del vehículo: " + vehicle.getModel());
            System.out.println();
        }

        // LinkedList de vehículos
        LinkedList<Vehicle<?>> vehicleList = new LinkedList<>();
        vehicleList.add(car);
        vehicleList.add(truck);

        // Iterar sobre LinkedList
        System.out.println("Iterando sobre LinkedList:");
        for (Vehicle<?> vehicle : vehicleList) {
            vehicle.startEngine();
            vehicle.drive();
            System.out.println("ID del vehículo: " + vehicle.getId());
            System.out.println("Modelo del vehículo: " + vehicle.getModel());
            System.out.println();
        }

        scanner.close();
    }
}