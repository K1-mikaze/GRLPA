package PICUR_GRLPA.Repository;

import PICUR_GRLPA.Model.Evaluacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EvaluacionRepository extends JpaRepository<Evaluacion,Long> {
    Optional<Evaluacion> findById(@Param("id") Long id);
}
