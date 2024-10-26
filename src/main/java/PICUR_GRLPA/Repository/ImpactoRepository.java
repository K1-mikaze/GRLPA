package PICUR_GRLPA.Repository;

import PICUR_GRLPA.Model.Impacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ImpactoRepository extends JpaRepository<Impacto,Long> {
    Optional<Impacto> findById(@Param("id") Long id);
}
