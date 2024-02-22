import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseManager {
    private static final String URL = "jdbc:mysql://localhost/weatherapp";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";


    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
    public static List<City> getCity() throws SQLException {
        List<City> cityList = new ArrayList<>();
        String sql = "SELECT * FROM Student";
        Connection connection = getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            int cityId = resultSet.getInt("cityId");
            String cityName = resultSet.getString("cityName");
            int currentTemperature = resultSet.getInt("currentTemperature");
            int currentHumidity=resultSet.getInt("currenHumidity");

            cityList.add(new City(cityId,cityName,currentTemperature,currentHumidity));

        }
        connection.close();
        statement.close();
        resultSet.close();

        return cityList;
    }
    public static void addCity(City ville) throws SQLException {
        String sql = "INSERT INTO city (cityId, cityName, currentTemperature,currentHumidity) VALUES (?, ?, ?,?)";
        Connection connection = getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, ville.getCityId());
        statement.setString(2, ville.getCityName());
        statement.setInt(3, ville.getCurrentTemperature());
        statement.setInt(4,ville.getCurrentHumidity());
        statement.executeUpdate();
        connection.close();
        statement.close();
        System.out.println("City added successfully!");

    }
    public  static void updatecity(City city) throws SQLException{
        String sql="UPDATE City SET city SET  cityName = ? , currentTemperature = ?,currentHumidity =?WHERE cityId= ? ";
        Connection connection=getConnection();
        PreparedStatement statement=connection.prepareStatement(sql);
        statement.setString(1, city.getCityName());
        statement.setInt(2, city.getCurrentTemperature());
        statement.setInt(3, city.getCurrentHumidity());

        statement.setInt(4, city.getCityId());
        statement.executeUpdate();
        connection.close();
        statement.close();
        System.out.println("City Updated successfully!");
    }
    public static void deleteCity(int cityId) throws SQLException {
        String sql = "DELETE FROM city WHERE id = ?";
        Connection connection = getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, cityId);
        statement.executeUpdate();
        connection.close();
        statement.close();
        System.out.println("City deleted successfully!");
    }

}