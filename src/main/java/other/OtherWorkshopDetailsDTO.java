package other;

import java.util.Objects;

public class OtherWorkshopDetailsDTO {
    private Integer id;
    private Integer treadThickness;
    private Integer fuelUsage;
    private Integer carMillage;
    private String brand;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTreadThickness() {
        return treadThickness;
    }

    public void setTreadThickness(Integer treadThickness) {
        this.treadThickness = treadThickness;
    }

    public Integer getFuelUsage() {
        return fuelUsage;
    }

    public void setFuelUsage(Integer fuelUsage) {
        this.fuelUsage = fuelUsage;
    }

    public Integer getCarMillage() {
        return carMillage;
    }

    public void setCarMillage(Integer carMillage) {
        this.carMillage = carMillage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OtherWorkshopDetailsDTO)) return false;
        OtherWorkshopDetailsDTO that = (OtherWorkshopDetailsDTO) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(treadThickness, that.treadThickness) &&
                Objects.equals(fuelUsage, that.fuelUsage) &&
                Objects.equals(carMillage, that.carMillage) &&
                Objects.equals(brand, that.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, treadThickness, fuelUsage, carMillage, brand);
    }
}
