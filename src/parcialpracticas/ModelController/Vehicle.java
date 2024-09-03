package parcialpracticas.ModelController;

public abstract class Vehicle<T> implements Drivable {
    private T id;
    private String model;

    public Vehicle(T id, String model) {
        this.id = id;
        this.model = model;
    }

    public T getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public abstract void startEngine();
}