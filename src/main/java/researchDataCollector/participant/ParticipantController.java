package researchDataCollector.participant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
public class ParticipantController {

    private final ParticipantRepository participantRepository;
    private final ParticipantMapper participantMapper;

    @Autowired
    public ParticipantController(ParticipantRepository participantRepository, ParticipantMapper participantMapper) {

        this.participantRepository = participantRepository;
        this.participantMapper = participantMapper;
    }

    @RequestMapping(value = "/participants", method = RequestMethod.GET)
    public List<Participant> findAll() {

        return participantRepository.findAll()
                                    .stream()
                                    .map(participantMapper::toParticipant)
                                    .collect(Collectors.toList());
    }

    @RequestMapping(value = "/participant/{id}", method = RequestMethod.GET)
    public Participant findOne(@PathVariable Long id) {

        return participantMapper.toParticipant(participantRepository.findOne(id));
    }

    @RequestMapping(value = "/participant", method = RequestMethod.POST)
    public Participant create(@RequestBody Participant participant) {

        ParticipantEntity participantEntity =
                participantRepository.save(participantMapper.toParticipantEntity(participant));
        return participantMapper.toParticipant(participantEntity);
    }
}
