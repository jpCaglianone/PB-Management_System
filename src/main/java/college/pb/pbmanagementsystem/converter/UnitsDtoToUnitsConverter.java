package college.pb.pbmanagementsystem.converter;

import college.pb.pbmanagementsystem.model.dto.BarberDto;
import college.pb.pbmanagementsystem.model.dto.UnitsDto;
import college.pb.pbmanagementsystem.model.entity.Barber;
import college.pb.pbmanagementsystem.model.entity.Units;
import jakarta.annotation.Nonnull;
import org.springframework.beans.BeanUtils;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class UnitsDtoToUnitsConverter implements Converter<UnitsDto, Units>{

    @Override
    public Units convert(@Nonnull UnitsDto unitsDto) {
        var units = new Units();
        BeanUtils.copyProperties(unitsDto, units);
        return units;
    }
}
