package researchDataCollector.research;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

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
}
