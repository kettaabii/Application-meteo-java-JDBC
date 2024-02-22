import java.sql.SQLException;
import java.util.Scanner;

public class City {
    private int cityId;
    private String cityName;
    private int currentTemperature;
    private int currentHumidity;
    //private Integer currentWindspeed;


    public City() {
    }

    public City(int cityId, String cityName, int currentTemperature, int currentHumidity) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.currentTemperature = currentTemperature;
        this.currentHumidity = currentHumidity;
    }

    public int getCityId() {
        return cityId;
    }

    public int getCurrentHumidity() {
        return currentHumidity;
    }

    public void setCurrentHumidity(int currentHumidity) {
        this.currentHumidity = currentHumidity;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        this.currentTemperature = currentTemperature;
    }
//    public Integer getCurrentWindspeed() {
//        return currentWindspeed;
//    }

//    public void setCurrentWindspeed(Integer currentWindspeed) {
//        this.currentWindspeed = currentWindspeed;
//    }

    public void enregistrementVille() throws SQLException {
        System.out.print("ID : ");
        cityId= (new Scanner(System.in)).nextInt();
        System.out.print("NAME : ");
        cityName = (new Scanner(System.in)).nextLine();
        System.out.print("Temperature: ");
        currentTemperature = (new Scanner(System.in)).nextInt();
        System.out.print("humidity: ");
        currentHumidity = (new Scanner(System.in)).nextInt();
        DatabaseManager.addCity(new City(cityId,cityName,currentTemperature,currentHumidity)) ;
    }
    void LectureVilles(){



    }
    public void MisdeAjours(){
        System.out.print("rnetrer l Id de la ville a mettre a jours: ");
        cityId= (new Scanner(System.in)).nextInt();
        System.out.print("Enter le nouveau nom : ");
        cityName = (new Scanner(System.in)).nextLine();
        System.out.print("Enter la nouvelle temperature: ");
        currentTemperature = (new Scanner(System.in)).nextInt();
        System.out.print("Enter la nouvelle humid: ");
        currentHumidity = (new Scanner(System.in)).nextInt();
        try {
            DatabaseManager.updatecity(new City(cityId,cityName,currentTemperature,currentTemperature));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public void supprimerEnregistrement(){
        System.out.print("Enter city ID to delete: ");
        cityId = (new Scanner(System.in)).nextInt();
        try {
            DatabaseManager.deleteCity(cityId);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}