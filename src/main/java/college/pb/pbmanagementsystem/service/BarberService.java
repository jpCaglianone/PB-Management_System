package college.pb.pbmanagementsystem.service;

import college.pb.pbmanagementsystem.model.dto.BarberDto;
import college.pb.pbmanagementsystem.model.entity.Barber;

public interface BarberService {

    Barber createBarber(BarberDto barber);
    Barber getBarberById(Long id);
    Barber updateBarber(BarberDto barber);
    void deleteBarberById(Long id);

}
