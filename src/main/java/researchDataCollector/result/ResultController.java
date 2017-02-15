package researchDataCollector.result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
public class ResultController {

    private final ResultRepository resultRepository;
    private final ResultMapper resultMapper;

    @Autowired
    public ResultController(ResultRepository resultRepository, ResultMapper resultMapper) {

        this.resultRepository = resultRepository;
        this.resultMapper = resultMapper;
    }

    @RequestMapping(value = "/results", method = RequestMethod.GET)
    public List<Result> findAll() {

        return resultRepository.findAll()
                               .stream()
                               .map(resultMapper::toResult)
                               .collect(Collectors.toList());
    }

    @RequestMapping(value = "/result", method = RequestMethod.POST)
    public Result create(@RequestBody Result result) {

        ResultEntity resultEntity = resultRepository.save(resultMapper.toResultEntity(result));
        return resultMapper.toResult(resultEntity);
    }

    @RequestMapping(value = "/results", method = RequestMethod.POST)
    public List<Result> create(@RequestBody List<Result> results) {

        return results.stream()
                      .map(result -> resultMapper.toResult(resultRepository.save(resultMapper.toResultEntity(result))))
                      .collect(Collectors.toList());
    }
}
