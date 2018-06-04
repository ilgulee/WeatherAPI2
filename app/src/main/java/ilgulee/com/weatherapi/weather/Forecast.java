package ilgulee.com.weatherapi.weather;

public class Forecast {
    private Current mCurrent;
    private Hour[] mHourForecast;
    private Day[] mDailyForecast;

    public Current getCurrent() {
        return mCurrent;
    }

    public void setCurrent(Current current) {
        mCurrent = current;
    }

    public Hour[] getHourForecast() {
        return mHourForecast;
    }

    public void setHourForecast(Hour[] hourForecast) {
        mHourForecast = hourForecast;
    }

    public Day[] getDailyForecast() {
        return mDailyForecast;
    }

    public void setDailyForecast(Day[] dailyForecast) {
        mDailyForecast = dailyForecast;
    }
}
