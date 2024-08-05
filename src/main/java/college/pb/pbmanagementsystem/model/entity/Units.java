package college.pb.pbmanagementsystem.model.entity;

import college.pb.pbmanagementsystem.enums.UserType;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
@Getter
@Setter
@Entity
@Table(name = "units")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Units {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Version
    private String adress;
    private String zipCode;
    private String city;
    @CreatedDate
    @Builder.Default
    private LocalDateTime createdAt = LocalDateTime.now();
    @LastModifiedDate
    @Builder.Default
    private LocalDateTime updatedAt = LocalDateTime.now();
}
