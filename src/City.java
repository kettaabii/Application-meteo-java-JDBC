public class City {
    private Integer cityId;
    private String cityName;
    private Float currentTemperature;
    private Integer currentHumidity;
    private Integer currentWindspeed;

    public City(Integer cityId, String cityName, Float currentTemperature, Integer currentHumidity, Integer currentWindspeed) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.currentTemperature = currentTemperature;
        this.currentHumidity = currentHumidity;
        this.currentWindspeed = currentWindspeed;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Float getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(Float currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public Integer getCurrentHumidity() {
        return currentHumidity;
    }

    public void setCurrentHumidity(Integer currentHumidity) {
        this.currentHumidity = currentHumidity;
    }

    public Integer getCurrentWindspeed() {
        return currentWindspeed;
    }

    public void setCurrentWindspeed(Integer currentWindspeed) {
        this.currentWindspeed = currentWindspeed;
    }

    void enregistrementVille (){

    }
    void LectureVilles(){}
    void MisdeAjours(){}
    void supprimerEnregistrement(){}


}
