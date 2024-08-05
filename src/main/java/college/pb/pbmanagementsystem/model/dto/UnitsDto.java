package college.pb.pbmanagementsystem.model.dto;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;

@JsonInclude(NON_NULL)
public record UnitsDto(
        @NotNull Long id,
        @NotBlank String address,
        @NotBlank String zipCode,
        @NotBlank String city
) implements Serializable {

    public UnitsDto {
        if (id == null) {
            throw new IllegalArgumentException("id cannot be null");
        }
        if (address == null || address.isBlank()) {
            throw new IllegalArgumentException("address cannot be null or blank");
        }
        if (zipCode == null || zipCode.isBlank()) {
            throw new IllegalArgumentException("zipCode cannot be null or blank");
        }
        if (city == null || city.isBlank()) {
            throw new IllegalArgumentException("city cannot be null or blank");
        }
    }
}
