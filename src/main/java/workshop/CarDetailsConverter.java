package workshop;

import other.OtherWorkshopCarDetailsService;
import other.OtherWorkshopDetailsDTO;

import java.util.List;
import java.util.stream.Collectors;

public class CarDetailsConverter {

    private final OtherWorkshopCarDetailsService otherWorkshopCarDetailsService;

    public CarDetailsConverter(OtherWorkshopCarDetailsService otherWorkshopCarDetailsService) {
        this.otherWorkshopCarDetailsService = otherWorkshopCarDetailsService;
    }

    public List<CarDetails> convertAll() {
        List<OtherWorkshopDetailsDTO> toConvert = otherWorkshopCarDetailsService.findCarDetailsToAnalyze();
        return toConvert.stream()
                .map(this::convert)
                .collect(Collectors.toList());
    }

    public CarDetails convert (OtherWorkshopDetailsDTO dto) {
        CarDetails details =   new CarDetails();
        details.setId(String.valueOf(dto.getId()));
        details.setCarMillage(dto.getCarMillage());
        details.setFuelUsage(dto.getFuelUsage());
        details.setTreadThickness(dto.getTreadThickness());
        return details;

    }
}


