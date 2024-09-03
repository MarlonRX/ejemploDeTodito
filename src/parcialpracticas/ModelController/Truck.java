package parcialpracticas.ModelController;

public class Truck extends Vehicle<Integer> {
    public Truck(Integer id, String model) {
        super(id, model);
    }

    @Override
    public void startEngine() {
        System.out.println("El motor del camión ha arrancado.");
    }

    @Override
    public void drive() {
        System.out.println("El camión está en marcha.");
    }
}