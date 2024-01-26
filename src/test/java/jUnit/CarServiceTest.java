package jUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarServiceTest {

    @Test
    public void analyzeCarByParams_millageNull_Should_throws_IllegalArgumentExceptions() {

        //given
        Integer treadThickness = 3;
        Integer fuelUsage = 4;
        Integer carMillage = null;
        CarService carService = new CarService();

        //when
        //carService.analyzeCarByParams(treadThickness, fuelUsage, carMillage);

        //then
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> carService.analyzeCarByParams(treadThickness, fuelUsage, carMillage));

    }

    @Test
    public void analyzeCarByParams_allValuesOk_should_result_true() {

        //given
        Integer treadThickness = 3;
        Integer fuelUsage = 5;
        Integer carMillage = 15000;
        CarService carService = new CarService();

        //when
        boolean result = carService.analyzeCarByParams(treadThickness, fuelUsage, carMillage);

        //then
        Assertions.assertTrue(result);
    }

    @Test
    public void analyzeCarByParams_carMillageNotOk_should_result_false() {

        //given
        Integer treadThickness = 3;
        Integer fuelUsage = 5;
        Integer carMillage = 299000;
        CarService carService = new CarService();

        //when
        boolean result = carService.analyzeCarByParams(treadThickness, fuelUsage, carMillage);

        //then
        Assertions.assertFalse(result);
    }

    @Test
    public void analyzeCarByParams_millagLessThanZero_Should_throws_IllegalArgumentExceptions() {

        //given
        Integer treadThickness = 3;
        Integer fuelUsage = 4;
        Integer carMillage = -1;
        CarService carService = new CarService();

        //when
        //carService.analyzeCarByParams(treadThickness, fuelUsage, carMillage);

        //then
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> carService.analyzeCarByParams(treadThickness, fuelUsage, carMillage));

    }





}