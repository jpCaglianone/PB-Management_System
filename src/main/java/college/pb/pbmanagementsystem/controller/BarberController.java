package college.pb.pbmanagementsystem.controller;

import college.pb.pbmanagementsystem.model.dto.BarberDto;
import college.pb.pbmanagementsystem.service.BarberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.ConversionService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/barber")
@Slf4j
@RequiredArgsConstructor
public class BarberController {

    private final BarberService barberService;
    private final ConversionService conversionService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BarberDto createBarber(@RequestBody BarberDto barber) {
        log.info("Creating barber: {}", barber);
        return conversionService.convert(barberService.createBarber(barber), BarberDto.class);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public BarberDto getBarberById(@RequestParam Long id) {
        return conversionService.convert(barberService.getBarberById(id), BarberDto.class);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public BarberDto updateBarber(@RequestBody BarberDto barber) {
        return conversionService.convert(barberService.updateBarber(barber), BarberDto.class);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBarberById(@RequestParam Long id) {
        barberService.deleteBarberById(id);
    }

}
