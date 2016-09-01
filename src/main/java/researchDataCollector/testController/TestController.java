package researchDataCollector.testController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import researchDataCollector.research.ResearchEntity;
import researchDataCollector.research.ResearchRepository;
import researchDataCollector.variable.VariableEntity;
import researchDataCollector.variable.VariableRepository;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private ResearchRepository researchRepository;

    @Autowired
    private VariableRepository variableRepository;

    @RequestMapping("/test")
    public List<ResearchEntity> index() {

        for (int i = 1; i < 5; i++) {
            researchRepository.save(new ResearchEntity("Author" + i, "Research paper #" + i * i));
        }

        ResearchEntity research = researchRepository.findAll().stream().findFirst().get();

        VariableEntity v1 = new VariableEntity(research.getId(), "height", "numeric");
        VariableEntity v2 = new VariableEntity(research.getId(), "weight", "numeric");
        VariableEntity v3 = new VariableEntity(research.getId(), "gender", "text");

        variableRepository.save(v1);
        variableRepository.save(v2);
        variableRepository.save(v3);

        return researchRepository.findAll();
    }
}
