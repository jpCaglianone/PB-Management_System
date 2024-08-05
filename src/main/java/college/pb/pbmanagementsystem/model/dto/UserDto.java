package college.pb.pbmanagementsystem.model.dto;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

import college.pb.pbmanagementsystem.enums.UserType;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;

@JsonInclude(NON_NULL)
public record UserDto(@NotNull Long id, @NotNull String name, @NotNull String email, String password, @NotNull UserType userType) implements Serializable {

    public UserDto(Long id, @NotNull String name, @NotNull String email, @NotNull UserType userType) {
        this(id, name, email, null, userType);
    }

}