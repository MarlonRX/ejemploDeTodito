package parcialpracticas.ModelController;

public class Car extends Vehicle<String> {
    public Car(String id, String model) {
        super(id, model);
    }

    @Override
    public void startEngine() {
        System.out.println("El motor del coche ha arrancado.");
    }

    @Override
    public void drive() {
        System.out.println("El coche está conduciendo.");
    }
}