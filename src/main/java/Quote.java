import java.io.Serializable;

public class Quote implements Serializable {

    private long id;
    private String content;
    private String author;


    public Quote() {}

    protected void setId(long id) {
        this.id = id;
    }

    protected void setContent(String content) {
        this.content = content;
    }

    protected void setAuthor(String author) {
        this.author = author;
    }

    protected long getId() {
        return id;
    }

    protected String getContent() {
        return content;
    }

    protected String getAuthor() {
        return author;
    }

}
