package researchDataCollector.research;

import org.springframework.stereotype.Component;

@Component
public class ResearchMapper {

    public Research toResearch(ResearchEntity researchEntity) {
        Research research = new Research();
        research.setId(researchEntity.getId());
        research.setName(researchEntity.getName());
        research.setAuthor(researchEntity.getAuthor());
        return research;
    }

    public ResearchEntity toResearchEntity(Research research) {
        ResearchEntity researchEntity = new ResearchEntity();
        research.setAuthor(research.getAuthor());
        research.setName(research.getName());
        return researchEntity;
    }
}
