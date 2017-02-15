package researchDataCollector.testController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import researchDataCollector.participant.ParticipantEntity;
import researchDataCollector.participant.ParticipantRepository;
import researchDataCollector.research.ResearchEntity;
import researchDataCollector.research.ResearchRepository;
import researchDataCollector.result.ResultEntity;
import researchDataCollector.result.ResultRepository;
import researchDataCollector.variable.VariableEntity;
import researchDataCollector.variable.VariableRepository;

import java.util.List;

@CrossOrigin
@RestController
public class TestController {

    @Autowired
    private ResearchRepository researchRepository;

    @Autowired
    private VariableRepository variableRepository;

    @Autowired
    private ParticipantRepository participantRepository;

    @Autowired
    private ResultRepository resultRepository;

    @RequestMapping("/test")
    public List<ResearchEntity> index() {

        for (int i = 1; i < 5; i++) {
            researchRepository.save(new ResearchEntity("Author" + i, "Research paper #" + i * i));
        }

        ResearchEntity r1 = researchRepository.findAll().stream().findFirst().get();

        VariableEntity v1 = variableRepository.save(new VariableEntity(r1.getId(), "height", "numeric"));
        VariableEntity v2 = variableRepository.save(new VariableEntity(r1.getId(), "weight", "numeric"));
        VariableEntity v3 = variableRepository.save(new VariableEntity(r1.getId(), "gender", "text"));

        ParticipantEntity p1 = participantRepository.save(new ParticipantEntity(r1.getId(), "Testo Testni"));

        ResultEntity rs1 = resultRepository.save(new ResultEntity(r1.getId(), p1.getId(), v1.getId(), 181., null));
        ResultEntity rs2 = resultRepository.save(new ResultEntity(r1.getId(), p1.getId(), v2.getId(), 81.6, null));
        ResultEntity rs3 = resultRepository.save(new ResultEntity(r1.getId(), p1.getId(), v3.getId(), null, "M"));

        return researchRepository.findAll();
    }
}
