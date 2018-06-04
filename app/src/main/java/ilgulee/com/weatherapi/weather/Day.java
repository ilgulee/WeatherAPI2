package ilgulee.com.weatherapi.weather;

public class Day {
    private long mTime;
    private String mSummary;
    private double mTemperatureHigh;
    private double mTemperatureLow;
    private String mIcon;
    private String mTimezone;

    public double getTemperatureHigh() {
        return mTemperatureHigh;
    }

    public void setTemperatureHigh(double temperatureHigh) {
        mTemperatureHigh = temperatureHigh;
    }

    public double getTemperatureLow() {
        return mTemperatureLow;
    }

    public void setTemperatureLow(double temperatureLow) {
        mTemperatureLow = temperatureLow;
    }

    public long getTime() {
        return mTime;
    }

    public void setTime(long time) {
        mTime = time;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }

//    public double getTemperature() {
//        return mTemperatureHigh;
//    }
//
//    public void setTemperature(double temperature) {
//        mTemperatureHigh = temperature;
//    }

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public String getTimezone() {
        return mTimezone;
    }

    public void setTimezone(String timezone) {
        mTimezone = timezone;
    }
}
