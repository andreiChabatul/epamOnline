package epam.javatutor.module4.task12;

public class Engine {
    private int scope;
    private String fuelGrade;
    private double fuelConsumption;

    public Engine(int scope, String fuelGrade, double fuelConsumption) {
        this.scope = scope;
        this.fuelGrade = fuelGrade;
        this.fuelConsumption = fuelConsumption;
    }

    public int getScope() {
        return scope;
    }

    public void setScope(int scope) {
        this.scope = scope;
    }

    public String getFuelGrade() {
        return fuelGrade;
    }

    public void setFuelGrade(String fuelGrade) {
        this.fuelGrade = fuelGrade;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}