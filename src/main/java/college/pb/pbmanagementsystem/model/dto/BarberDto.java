package college.pb.pbmanagementsystem.model.dto;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

import college.pb.pbmanagementsystem.enums.UserType;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.NoArgsConstructor;

@JsonInclude(NON_NULL)
public record BarberDto(@NotNull Long id, @NotNull String name, @NotNull String email, @NotNull UserType userType,
                        String password) implements Serializable {
    public BarberDto(Long id, @NotNull String name, @NotNull String email, @NotNull UserType userType) {
        this(id, name, email, userType, null);
    }

}