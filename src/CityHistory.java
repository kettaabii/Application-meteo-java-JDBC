import java.util.Date;

public class CityHistory {
    private Integer historicalDataId;
    private Integer cityId;
    private Date eventDate;
    private Integer temperature;

    public CityHistory(Integer historicalDataId, Integer cityId, Date eventDate, Integer temperature) {
        this.historicalDataId = historicalDataId;
        this.cityId = cityId;
        this.eventDate = eventDate;
        this.temperature = temperature;
    }

    public Integer getHistoricalDataId() {
        return historicalDataId;
    }

    public void setHistoricalDataId(Integer historicalDataId) {
        this.historicalDataId = historicalDataId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }
    void saveHistorique(){}
    void showHistorique(){}
    void updateHistorique(){}
    void deleteHistorique(){}

}
