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
}
