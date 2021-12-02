import java.io.Serializable;

public class Quote extends Serializable {

    private long id;
    private String content;
    private String author;


    public Quote() {}

    public void setId(long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
