package PICUR_GRLPA.Repository;

import PICUR_GRLPA.Model.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SensoresRepository extends JpaRepository<Sensor,Long> {
    Optional<Sensor> findById(@Param("id") Long id);
}
