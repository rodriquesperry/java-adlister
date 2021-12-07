import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;

public class MYSQLAdsDao implements Ads {
    private Connection connection;


    public MYSQLAdsDao(Config config) throws SQLException {
        DriverManager.registerDriver(new Driver());
        this.connection = DriverManager.getConnection(
               config.getUrl(),
               config.getUsername(),
               config.getPassword()
        );
    };


    @Override
    public List<Ad> all() throws SQLException {
        Statement statement = null;
        String adQuery = "SELECT * FROM ads";
        ResultSet rs = null;

        statement = connection.createStatement();
        rs = statement.executeQuery(adQuery);

        List<Ad> ads = new ArrayList<>();

        while (rs.next()) {
            Ad currentAdd = new Ad(
                rs.getLong("id"),
                rs.getString("title"),
                rs.getString("description")
            );

            ads.add(currentAdd);
        }

        return ads;
    }

    @Override
    public long insert(Ad ad) throws SQLException {
        return 0;
    }


}
