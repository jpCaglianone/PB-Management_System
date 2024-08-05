package college.pb.pbmanagementsystem.repository;

import college.pb.pbmanagementsystem.model.entity.Barber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarberRepository extends JpaRepository<Barber, Long> {

}
