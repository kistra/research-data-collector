package researchDataCollector.variable;

import java.io.Serializable;

public class Variable implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long researchId;

    private String name;

    private String type;

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

    public String getType() {

        return type;
    }

    public void setType(String type) {

        this.type = type;
    }

    @Override
    public String toString() {

        return "Variable{" +
                "id=" + id +
                ", researchId=" + researchId +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
