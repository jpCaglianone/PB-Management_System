package college.pb.pbmanagementsystem.controller;

import college.pb.pbmanagementsystem.model.dto.UnitsDto;
import college.pb.pbmanagementsystem.service.UnitsService;
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
@RequestMapping("/v1/units")
@Slf4j
@RequiredArgsConstructor
public class UnitsController {

    private final UnitsService unitsService;
    private final ConversionService conversionService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UnitsDto createUnits(@RequestBody UnitsDto units) {
        log.info("Creating units: {}", units);
        return conversionService.convert(unitsService.createUnits(units), UnitsDto.class);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public UnitsDto getUnitsById(@RequestParam Long id) {
        return conversionService.convert(unitsService.getUnitsById(id), UnitsDto.class);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public UnitsDto updateUnits(@RequestBody UnitsDto units) {
        return conversionService.convert(unitsService.updateUnits(units), UnitsDto.class);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBarberById(@RequestParam Long id) {
        unitsService.deleteUnitsById(id);
    }

}
