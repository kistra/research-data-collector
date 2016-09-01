package researchDataCollector.variable;

import javax.persistence.*;

@Entity
@Table(name = "Variables")
public class VariableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "research_id")
    private Long researchId;

    private String name;

    private String type;

    public VariableEntity() {}

    public VariableEntity(Long researchId, String name, String type) {
        this.researchId = researchId;
        this.name = name;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public Long getResearchId() {
        return researchId;
    }

    public void setResearchId(Long researchId) {
        this.researchId = researchId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
