package researchDataCollector.variable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
public class VariableController {

    private final VariableRepository variableRepository;
    private final VariableMapper variableMapper;

    @Autowired
    public VariableController(VariableRepository variableRepository, VariableMapper variableMapper) {
        this.variableRepository = variableRepository;
        this.variableMapper = variableMapper;
    }

    @RequestMapping(value = "/variable", method = RequestMethod.GET)
    public List<Variable> findAll() {
        return variableRepository.findAll()
                .stream()
                .map(variableMapper::toVariable)
                .collect(Collectors.toList());
    }

    @RequestMapping(value = "/research/{researchId}/variables", method = RequestMethod.GET)
    public List<Variable> findOne(@PathVariable Long researchId) {
        return variableRepository.findByResearchId(researchId)
                .stream()
                .map(variableMapper::toVariable)
                .collect(Collectors.toList());
    }
}
