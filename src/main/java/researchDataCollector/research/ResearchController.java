package researchDataCollector.research;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
public class ResearchController {

    private final ResearchRepository researchRepository;
    private final ResearchMapper researchMapper;

    @Autowired
    public ResearchController(ResearchRepository researchRepository, ResearchMapper researchMapper) {
        this.researchRepository = researchRepository;
        this.researchMapper = researchMapper;
    }

    @RequestMapping(value = "/research", method = RequestMethod.GET)
    public List<Research> findAll() {
        return researchRepository.findAll()
                .stream()
                .map(researchMapper::toResearch)
                .collect(Collectors.toList());
    }

    @RequestMapping(value = "/research/{id}", method = RequestMethod.GET)
    public Research findOne(@PathVariable Long id) {
        return researchMapper.toResearch(researchRepository.findOne(id));
    }

    @RequestMapping(value = "/research", method = RequestMethod.POST)
    public Research create(@RequestBody Research research) {
        ResearchEntity researchEntity = researchRepository.save(researchMapper.toResearchEntity(research));
        return researchMapper.toResearch(researchEntity);
    }
}
