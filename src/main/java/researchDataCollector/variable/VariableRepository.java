package researchDataCollector.variable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VariableRepository extends JpaRepository<VariableEntity, Long> {

    @Query(
        value =
            "SELECT * " +
            "FROM variables " +
            "WHERE researchId = :researchId",
        nativeQuery = true)
    List<VariableEntity> findByResearchId(@Param("researchId") long researchId);
}
