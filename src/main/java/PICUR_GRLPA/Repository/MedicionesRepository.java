package PICUR_GRLPA.Repository;

import PICUR_GRLPA.Model.Medicion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MedicionesRepository extends JpaRepository<Medicion,Long>{
    Optional<Medicion> findById(@Param("id") Long id);
}
