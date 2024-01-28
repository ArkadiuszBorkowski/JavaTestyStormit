package other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OtherWorkshopCarDetailsService {
    public List<OtherWorkshopDetailsDTO> findCarDetailsToAnalyze() {

        //DB OPERATIONS
        return new ArrayList<>(dbContent());
    }

    private List<OtherWorkshopDetailsDTO> dbContent() {
        return Arrays.asList(create(1, 3, 5, 10000, "FIAT"),
        create(2,2,10,15000,"OPEL"));
    }

    private OtherWorkshopDetailsDTO create(Integer id, Integer treadThickness, Integer fuelUsage, Integer carMillage,
                                           String brand) {
        OtherWorkshopDetailsDTO result = new OtherWorkshopDetailsDTO();
        result.setId(id);
        result.setBrand(brand);
        result.setTreadThickness(treadThickness);
        result.setFuelUsage(fuelUsage);
        result.setCarMillage(carMillage);
        return result;
    }
}
