package workshop;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;


public class OtherWorkShopCarServiceTest {

    @Test
    public void analyzeOtherWorkshopCars_basicCase_success() {

        //given
        List<CarDetails> carDetails = new ArrayList<>();
        CarService carService = mockCarService();
        CarDetailsConverter converter = mockConverter(carDetails);
        OtherWorkShopCarService service = new OtherWorkShopCarService(carService, converter);

        //when
        service.analyzeOtherWorkshopCars();

        //then
        Mockito.verify(carService).analyzeCars(carDetails);
    }

    private CarService mockCarService() {

        CarService carService = Mockito.mock(CarService.class);
        return carService;
    }

    private CarDetailsConverter mockConverter(List<CarDetails> carDetails) {

        CarDetailsConverter converter = Mockito.mock(CarDetailsConverter.class);
        Mockito.when(converter.convertAll()).thenReturn(carDetails);
        return converter;
    }

}

