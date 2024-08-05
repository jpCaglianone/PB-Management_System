package college.pb.pbmanagementsystem.converter;

import college.pb.pbmanagementsystem.model.dto.UnitsDto;
import college.pb.pbmanagementsystem.model.entity.Units;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class UnitsToUnitsDtoConverter implements Converter<Units, UnitsDto> {

    @Override
    public UnitsDto convert(Units units) {
        return new UnitsDto(units.getId(),
                units.getAdress(),
                units.getZipCode(),
                units.getCity());
    }
}
