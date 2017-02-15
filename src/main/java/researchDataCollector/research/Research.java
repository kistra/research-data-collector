package researchDataCollector.research;

import java.io.Serializable;

public class Research implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private String author;

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
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

    @Override
    public String toString() {

        return "Research{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
