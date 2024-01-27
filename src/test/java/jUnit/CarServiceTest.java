package jUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CarServiceTest {

    @ParameterizedTest
    @MethodSource("data")
    public void analyzeCarByParams_withDataFromMethod_resultFromData(Integer treadThickness, Integer fuelUsage,
                                                                     Integer carMillage, boolean expectedResult) {

        //given
        CarService carService = new CarService();

        //when
        boolean result = carService.analyzeCarByParams(treadThickness, fuelUsage, carMillage);

        //then
        Assertions.assertEquals(expectedResult, result);

    }

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
        //zamiast tej klasy użyjemy klasy sparametryzowanej
//    @Test
//    public void analyzeCarByParams_allValuesOk_should_result_true() {
//
//        //given
//        Integer treadThickness = 3;
//        Integer fuelUsage = 5;
//        Integer carMillage = 15000;
//        CarService carService = new CarService();
//
//        //when
//        boolean result = carService.analyzeCarByParams(treadThickness, fuelUsage, carMillage);
//
//        //then
//        Assertions.assertTrue(result);
//    }

//    @Test
//    public void analyzeCarByParams_carMillageNotOk_should_result_false() {
//
//        //given
//        Integer treadThickness = 3;
//        Integer fuelUsage = 5;
//        Integer carMillage = 21000;
//        CarService carService = new CarService();
//
//        //when
//        boolean result = carService.analyzeCarByParams(treadThickness, fuelUsage, carMillage);
//
//        //then
//        Assertions.assertFalse(result);
//    }

//    @Test
//    public void analyzeCarByParams_valuesEqualToMinOrMax_resultFalse() {
//        //given
//        int threadThickness = 2;
//        int fuelUsage = 14;
//        int carMillage = 0;
//        CarService carService = new CarService();
//
//        //when
//        boolean result = carService.analyzeCarByParams(threadThickness, fuelUsage, carMillage);
//
//        //then
//        Assertions.assertFalse(result);
//    }

    private static Stream<Arguments> data() {

        return Stream.of(
                Arguments.of(3,5,1500, true),
                Arguments.of(3,5,21000, false),
                Arguments.of(2,14,0, false)
                );
    }


    @Test
    public void analyzeCarByParams_millageLessThanZero_Should_throws_IllegalArgumentExceptions() {

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

    private void myAssertion(List<String> strings) {
        boolean isAnyEmpty = strings.stream().anyMatch(String::isEmpty);

        if (isAnyEmpty) {
            Assertions.fail("Collection contains empty string!");
        }

        Assertions.assertTrue(true);
    }

    @Test
    public void testMyAssertion() {
        List<String> strings = Arrays.asList("1", "2");
        myAssertion(strings);
    }


}