package college.pb.pbmanagementsystem.repository;

import college.pb.pbmanagementsystem.model.entity.Units;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitsRepository extends JpaRepository<Units,Long> {
}
