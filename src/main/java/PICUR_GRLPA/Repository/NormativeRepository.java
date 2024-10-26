package PICUR_GRLPA.Repository;

import PICUR_GRLPA.Model.Normative;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NormativeRepository extends JpaRepository<Normative,Long>{
    Optional<Normative> findById(@Param("id") Long id);
}


