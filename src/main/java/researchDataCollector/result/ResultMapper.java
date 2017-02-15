package researchDataCollector.result;

import org.springframework.stereotype.Component;

@Component
public class ResultMapper {

    public Result toResult(ResultEntity resultEntity) {
        Result result = new Result();
        result.setId(resultEntity.getId());
        result.setResearchId(resultEntity.getResearchId());
        result.setParticipantId(resultEntity.getParticipantId());
        result.setVariableId(resultEntity.getVariableId());
        result.setNumericValue(resultEntity.getNumericValue());
        result.setTextValue(resultEntity.getTextValue());
        return result;
    }

    public ResultEntity toResultEntity(Result result) {
        ResultEntity resultEntity = new ResultEntity();
        resultEntity.setId(result.getId());
        resultEntity.setResearchId(result.getResearchId());
        resultEntity.setParticipantId(result.getParticipantId());
        resultEntity.setVariableId(result.getVariableId());
        resultEntity.setNumericValue(result.getNumericValue());
        resultEntity.setTextValue(result.getTextValue());
        return resultEntity;
    }
}
