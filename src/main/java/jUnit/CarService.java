package jUnit;

import java.util.List;

public class CarService {
    public boolean analyzeCarByParams(Integer treadThickness, Integer fuelUsage, Integer carMillage) {


        boolean millageNull = (null == carMillage);
        boolean fuelUsageNull = (null == fuelUsage);
        boolean treadThicknessNull = (null == treadThickness);

        if (millageNull ||fuelUsageNull || treadThicknessNull) {
            throw new IllegalArgumentException("Car details can not be null");

        }

        boolean isMillageCorrect = isCorret(carMillage, ParamValues.CAR_MILLAGE);
        boolean isFuelUsageCorrect = isCorret(fuelUsage, ParamValues.FUEL_USAGE);
        boolean isTreadThicknessCorrect = isCorret(treadThickness, ParamValues.TREAD_THICKNESS);

        if (isMillageCorrect && isFuelUsageCorrect & isTreadThicknessCorrect)
            return true;

        return false;
    }

    private boolean isCorret(Integer value, ParamValues validValues) {
        if (value < 0) {
            throw new IllegalArgumentException("Incorrect value");
        }

        Integer maxValue = validValues.getMaxValue();
        Integer minValue = validValues.getMinValue();

        if (value > minValue && value < maxValue) {
            return true;
        }

        return false;
    }

    private void myAssetion(List<String> strings) {
        boolean isAnyEmpty = strings.stream().anyMatch(String::isEmpty);

        if (isAnyEmpty) {
            Assertions.fail("Collection contains empty string!");
        }

        Assertions.assertTrue(true);
    }
}
