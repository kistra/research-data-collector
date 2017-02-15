package researchDataCollector.participant;

import javax.persistence.*;

@Entity
@Table(name = "Participants")
public class ParticipantEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long researchId;

    private String name;

    public ParticipantEntity() {

    }

    public ParticipantEntity(Long researchId, String name) {

        this.researchId = researchId;
        this.name = name;
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
}
