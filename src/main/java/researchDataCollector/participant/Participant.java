package researchDataCollector.participant;

import java.io.Serializable;

public class Participant implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long researchId;

    private String name;

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
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

    @Override
    public String toString() {

        return "Participant{" +
                "id=" + id +
                ", researchId=" + researchId +
                ", name='" + name + '\'' +
                '}';
    }
}
