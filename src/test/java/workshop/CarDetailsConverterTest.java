package workshop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import other.OtherWorkshopCarDetailsService;
import other.OtherWorkshopDetailsDTO;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarDetailsConverterTest {

    private CarDetailsConverter toTest;


    @Test
    public void convertAll_simpleCase_convertSuccess() {

        //given
        OtherWorkshopCarDetailsService service = createServiceMock();
        toTest = new CarDetailsConverter(service);

        //then
        List<CarDetails> result = toTest.convertAll();

        //then
        assertEquals(result.size(), 2);
    }


    private OtherWorkshopCarDetailsService createServiceMock() {

        OtherWorkshopCarDetailsService service = Mockito.mock(OtherWorkshopCarDetailsService.class);
        List<OtherWorkshopDetailsDTO> content = dbContent();
        Mockito.when(service.findCarDetailsToAnalyze()).thenReturn(content);
        return service;
    }


    private List<OtherWorkshopDetailsDTO> dbContent() {
        return Arrays.asList(createMock(1, 3, 5, 10000),
                createMock(2,2,10,15000));
    }



        @Test
    public void convert_simpleCase_convertSuccess() {

        //given
        toTest = new CarDetailsConverter(null);
        OtherWorkshopDetailsDTO itemToTest = createMock(1, 10, 6, 3);
        //when
        CarDetails details = toTest.convert(itemToTest);

        //then
        Assertions.assertEquals(details.getId(), "1");
        Assertions.assertEquals(details.getCarMillage(), 3);
        Assertions.assertEquals(details.getFuelUsage(), 6);
        Assertions.assertEquals(details.getTreadThickness(), 10);

    }

    private OtherWorkshopDetailsDTO createMock(Integer id, Integer treadThickness, Integer fuelUsage, Integer carMillage) {
        OtherWorkshopDetailsDTO mock = Mockito.mock(OtherWorkshopDetailsDTO.class);
        Mockito.when(mock.getId()).thenReturn(id);
        Mockito.when(mock.getCarMillage()).thenReturn(carMillage);
        Mockito.when(mock.getFuelUsage()).thenReturn(fuelUsage);
        Mockito.when(mock.getTreadThickness()).thenReturn(treadThickness);
        return mock;
    }

}