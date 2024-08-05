package college.pb.pbmanagementsystem.controller;

import college.pb.pbmanagementsystem.model.dto.UserDto;
import college.pb.pbmanagementsystem.service.UserService;
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
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/v1/user")
public class UserController {

    private final UserService userService;
    private final ConversionService conversionService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserDto createUser(@RequestBody UserDto user) {
        log.info("Creating user: {}", user);
        return conversionService.convert(userService.createUser(user), UserDto.class);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public UserDto getUserById(@RequestParam Long id) {
        return conversionService.convert(userService.getUserById(id), UserDto.class);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public UserDto updateUser(@RequestBody UserDto user) {
        return conversionService.convert(userService.updateUser(user), UserDto.class);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUserById(@RequestParam Long id) {
        userService.deleteUserById(id);
    }


}
