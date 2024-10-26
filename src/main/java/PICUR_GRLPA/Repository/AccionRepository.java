package PICUR_GRLPA.Repository;

import PICUR_GRLPA.Model.Accion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccionRepository extends JpaRepository<Accion,Long> {
    Optional<Accion> findById(@Param("id") Long id);
}
