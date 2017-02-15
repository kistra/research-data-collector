package researchDataCollector.result;

import javax.persistence.*;

@Entity
@Table(name = "Results")
public class ResultEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long researchId;

    private Long participantId;

    private Long variableId;

    private Double numericValue;

    private String textValue;

    public ResultEntity() {
    }

    public ResultEntity(Long researchId,
                        Long participantId,
                        Long variableId,
                        Double numericValue,
                        String textValue) {

        this.researchId = researchId;
        this.participantId = participantId;
        this.variableId = variableId;
        this.numericValue = numericValue;
        this.textValue = textValue;
    }

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

    public Long getParticipantId() {

        return participantId;
    }

    public void setParticipantId(Long participantId) {

        this.participantId = participantId;
    }

    public Long getVariableId() {

        return variableId;
    }

    public void setVariableId(Long variableId) {

        this.variableId = variableId;
    }

    public Double getNumericValue() {

        return numericValue;
    }

    public void setNumericValue(Double numericValue) {

        this.numericValue = numericValue;
    }

    public String getTextValue() {

        return textValue;
    }

    public void setTextValue(String textValue) {

        this.textValue = textValue;
    }
}
