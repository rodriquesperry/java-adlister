import java.sql.SQLException;

public class DaoFactory {
    private static Ads adsDao;

    public static Ads getAdsDao() throws SQLException {
        try {
            if (adsDao == null) {
                adsDao = new MYSQLAdsDao(new Config());
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return adsDao;
    }
}
