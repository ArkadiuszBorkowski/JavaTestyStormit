/*
package jUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestNGCarServiceTest {

    @Test
    public void test() {
        //given
        List<CarDetails> carsDetail = createCarDetailsFirstCase();
        CarService carService = new CarService();


        //when
        List<CarDiagnosticResult> results = carService.analyzeCars(carsDetail);

        //then
        List<CarDiagnosticResult> expectedResults = createExpectedResults();
        Assert.assertEquals(results, expectedResults);
    }

    private List<CarDiagnosticResult> createExpectedResults() {
        List<CarDiagnosticResult> results = new ArrayList<>();
        results.add(new CarDiagnosticResult("1", true ));
        results.add(new CarDiagnosticResult("2", false ));
        results.add(new CarDiagnosticResult("3", true ));
        return results;

    }

    private List<CarDiagnosticResult> createExpectedResultsFirstCase() {
        List<CarDiagnosticResult> results = new ArrayList<>();
        results.add(new CarDiagnosticResult("1", true ));
        results.add(new CarDiagnosticResult("2", false ));
        results.add(new CarDiagnosticResult("3", true ));
        return results;

    }

//    private List<CarDiagnosticResult> createExpectedResultsSecondCase() {
//        List<CarDiagnosticResult> results = new ArrayList<>();
//        results.add(new CarDiagnosticResult("1", false ));
//        results.add(new CarDiagnosticResult("2", false ));
//        results.add(new CarDiagnosticResult("3", false ));
//        results.add(new CarDiagnosticResult("4", false ));
//        results.add(new CarDiagnosticResult("5", false ));
//        results.add(new CarDiagnosticResult("6", false ));
//        return results;
//
//    }

//    private List<CarDetails> createCarDetailsFalseCase() {
//        List<CarDetails> carDetails = new ArrayList<>();
//        carDetails.add(createCarDetails("1", 3, 15, 3));
//        carDetails.add(createCarDetails("2", 3, 3, 25000));
//        carDetails.add(createCarDetails("3", 3, 16, 30000));
//        carDetails.add(createCarDetails("4", 4000000, 3, 3));
//        carDetails.add(createCarDetails("5", 3333333, 300000, 3));
//        carDetails.add(createCarDetails("6", 3, 32, 3));
//        return carDetails;
//    }

    private List<CarDetails> createCarDetailsFirstCase() {
        List<CarDetails> carDetails = new ArrayList<>();
        carDetails.add(createCarDetails("1", 3, 3, 3));
        carDetails.add(createCarDetails("2", 3, 300000, 3));
        carDetails.add(createCarDetails("3", 3, 3, 3));
        return carDetails;
    }

    private CarDetails createCarDetails(String id, Integer treadThickness, Integer fuelUsage, Integer carMillage) {

            CarDetails carDetails = new CarDetails();
            carDetails.setId(id);
            carDetails.setTreadThickness(treadThickness);
            carDetails.setFuelUsage(fuelUsage);
            carDetails.setCarMillage(carMillage);
            return carDetails;
    }

}
*/
