package researchDataCollector.testController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import researchDataCollector.research.ResearchEntity;
import researchDataCollector.research.ResearchRepository;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private ResearchRepository researchRepository;

    @RequestMapping("/test")
    public List<ResearchEntity> index() {

        for (int i = 1; i < 5; i++) {
            researchRepository.save(new ResearchEntity("Author" + i, "Research paper #" + i * i));
        }

        return researchRepository.findAll();
    }
}
