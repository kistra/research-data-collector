package researchDataCollector.research;

import javax.persistence.*;

@Entity
@Table(name = "Research")
public class ResearchEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String author;

    public ResearchEntity() {

    }

    public ResearchEntity(String name, String author) {

        this.name = name;
        this.author = author;
    }

    public Long getId() {

        return id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getAuthor() {

        return author;
    }

    public void setAuthor(String author) {

        this.author = author;
    }
}
