package researchDataCollector.result;

import java.io.Serializable;

public class Result implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long researchId;

    private Long participantId;

    private Long variableId;

    private Double numericValue;

    private String textValue;

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

    @Override
    public String toString() {

        return "Result{" +
                "id=" + id +
                ", researchId=" + researchId +
                ", participantId=" + participantId +
                ", variableId=" + variableId +
                ", numericValue=" + numericValue +
                ", textValue='" + textValue + '\'' +
                '}';
    }
}
