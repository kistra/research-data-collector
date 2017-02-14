package researchDataCollector.testController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import researchDataCollector.research.ResearchEntity;
import researchDataCollector.research.ResearchRepository;
import researchDataCollector.variable.VariableEntity;
import researchDataCollector.variable.VariableRepository;

import java.util.List;

import static java.util.Arrays.asList;

@CrossOrigin
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
        Long researchId = research.getId();

        VariableEntity v1 = new VariableEntity(researchId, "height", "numeric");
        VariableEntity v2 = new VariableEntity(researchId, "weight", "numeric");
        VariableEntity v3 = new VariableEntity(researchId, "gender", "text");

        variableRepository.save(asList(v1, v2, v3));

        return researchRepository.findAll();
    }
}
