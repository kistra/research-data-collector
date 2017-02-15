package researchDataCollector.variable;

import org.springframework.stereotype.Component;

@Component
public class VariableMapper {

    public Variable toVariable(VariableEntity variableEntity) {

        Variable variable = new Variable();
        variable.setId(variableEntity.getId());
        variable.setResearchId(variableEntity.getResearchId());
        variable.setName(variableEntity.getName());
        variable.setType(variableEntity.getType());
        return variable;
    }
}
