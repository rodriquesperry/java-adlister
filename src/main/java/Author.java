import java.io.Serializable;

public class Author extends Serializable {

    private long id;
    private String firstName;
    private String lastName;

    public Author(){}

    protected void setId(long id) {
        this.id = id;
    }

    protected void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    protected void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
