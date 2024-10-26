package PICUR_GRLPA.Repository;

import PICUR_GRLPA.Model.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EducationRepository extends JpaRepository<Education,Long> {
    Optional<Education> findById(@Param("id") Long id);
}