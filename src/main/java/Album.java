import java.io.Serializable;
import java.util.Date;

public class Album implements Serializable {
    private long id;
    private String artist;
    private String name;
    private Date releaseDate;
    private double sales;
    private String genre;


    public Album() {}

    protected void setId(long id) {
        this.id = id;
    }

    protected void setArtist(String artist) {
        this.artist = artist;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    protected void setSales(double sales) {
        this.sales = sales;
    }

    protected void setGenre(String genre) {
        this.genre = genre;
    }
}
