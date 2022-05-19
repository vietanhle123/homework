package BTVN_Java.jdbcdemo.accuweather;

public class WeatherRoot {
    private String dataTime;
    private Integer epochDateTime;
    private Integer weatherIcon;
    private String iconPhrase;
    private Boolean hasPrecipitation;
    private Boolean isDaylight;
    private Temperature temperature;
    private Integer precipitationProbability;
    private String mobileLink;
    private String link;
    private String precipitationType;
    private String precipitationIntensity;

    public WeatherRoot(String dataTime, Integer epochDateTime, Integer weatherIcon, String iconPhrase, Boolean hasPrecipitation, Boolean isDaylight, Temperature temperature, Integer precipitationProbability, String mobileLink, String link, String precipitationType, String precipitationIntensity) {
        this.dataTime = dataTime;
        this.epochDateTime = epochDateTime;
        this.weatherIcon = weatherIcon;
        this.iconPhrase = iconPhrase;
        this.hasPrecipitation = hasPrecipitation;
        this.isDaylight = isDaylight;
        this.temperature = temperature;
        this.precipitationProbability = precipitationProbability;
        this.mobileLink = mobileLink;
        this.link = link;
        this.precipitationType = precipitationType;
        this.precipitationIntensity = precipitationIntensity;
    }

    public String getDataTime() {
        return dataTime;
    }

    public Integer getEpochDateTime() {
        return epochDateTime;
    }

    public Integer getWeatherIcon() {
        return weatherIcon;
    }

    public String getIconPhrase() {
        return iconPhrase;
    }

    public Boolean getHasPrecipitation() {
        return hasPrecipitation;
    }

    public Boolean getDaylight() {
        return isDaylight;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public Integer getPrecipitationProbability() {
        return precipitationProbability;
    }

    public String getMobileLink() {
        return mobileLink;
    }

    public String getLink() {
        return link;
    }

    public String getPrecipitationType() {
        return precipitationType;
    }

    public String getPrecipitationIntensity() {
        return precipitationIntensity;
    }

    public void setDataTime(String dataTime) {
        this.dataTime = dataTime;
    }

    public void setEpochDateTime(Integer epochDateTime) {
        this.epochDateTime = epochDateTime;
    }

    public void setWeatherIcon(Integer weatherIcon) {
        this.weatherIcon = weatherIcon;
    }

    public void setIconPhrase(String iconPhrase) {
        this.iconPhrase = iconPhrase;
    }

    public void setHasPrecipitation(Boolean hasPrecipitation) {
        this.hasPrecipitation = hasPrecipitation;
    }

    public void setDaylight(Boolean daylight) {
        isDaylight = daylight;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public void setPrecipitationProbability(Integer precipitationProbability) {
        this.precipitationProbability = precipitationProbability;
    }

    public void setMobileLink(String mobileLink) {
        this.mobileLink = mobileLink;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setPrecipitationType(String precipitationType) {
        this.precipitationType = precipitationType;
    }

    public void setPrecipitationIntensity(String precipitationIntensity) {
        this.precipitationIntensity = precipitationIntensity;
    }
}
