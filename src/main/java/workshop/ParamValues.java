package workshop;

public enum ParamValues {
    CAR_MILLAGE(0, 20000),
    FUEL_USAGE(0, 14),
    TREAD_THICKNESS(2, 1000);

    private Integer minValue;
    private Integer maxValue;

    ParamValues(Integer minValue, Integer maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public Integer getMinValue() {
        return minValue;
    }

    public Integer getMaxValue() {
        return maxValue;
    }
}
