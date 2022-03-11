package epam.javatutor.module4.task12;

public class Car {

    private String model;
    private Engine engine;
    private Wheel wheel;
    private double scopeFuel;
    private int tankVolume;

    public Car(String model, Engine engine, Wheel wheel, double scopeFuel, int tankVolume) {
        this.model = model;
        this.engine = engine;
        this.wheel = wheel;
        this.scopeFuel = scopeFuel;
        this.tankVolume = tankVolume;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public double getScopeFuel() {
        return scopeFuel;
    }

    public void setScopeFuel(double scopeFuel) {
        this.scopeFuel = scopeFuel;
    }

    public int getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(int tankVolume) {
        this.tankVolume = tankVolume;
    }
}