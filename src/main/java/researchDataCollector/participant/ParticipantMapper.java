package researchDataCollector.participant;

import org.springframework.stereotype.Component;

@Component
public class ParticipantMapper {

    public Participant toParticipant(ParticipantEntity participantEntity) {
        Participant participant = new Participant();
        participant.setId(participantEntity.getId());
        participant.setResearchId(participantEntity.getResearchId());
        participant.setName(participantEntity.getName());
        return participant;
    }

    public ParticipantEntity toParticipantEntity(Participant participant) {
        ParticipantEntity participantEntity = new ParticipantEntity();
        participantEntity.setResearchId(participant.getResearchId());
        participantEntity.setName(participant.getName());
        return participantEntity;
    }
}
