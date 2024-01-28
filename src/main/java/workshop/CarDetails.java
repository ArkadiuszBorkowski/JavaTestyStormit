package workshop;

public class CarDetails {
    private String id;
    private int treadThickness;
    private int fuelUsage;
    private int carMillage;

    public CarDetails() {
    }

    public CarDetails(String id, int treadThickness, int fuelUsage, int carMillage) {
        this.id = id;
        this.treadThickness = treadThickness;
        this.fuelUsage = fuelUsage;
        this.carMillage = carMillage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTreadThickness() {
        return treadThickness;
    }

    public void setTreadThickness(int treadThickness) {
        this.treadThickness = treadThickness;
    }

    public int getFuelUsage() {
        return fuelUsage;
    }

    public void setFuelUsage(int fuelUsage) {
        this.fuelUsage = fuelUsage;
    }

    public int getCarMillage() {
        return carMillage;
    }

    public void setCarMillage(int carMillage) {
        this.carMillage = carMillage;
    }
}
