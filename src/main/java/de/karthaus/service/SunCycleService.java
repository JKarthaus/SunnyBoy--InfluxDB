package de.karthaus.service;

import com.luckycatlabs.sunrisesunset.SunriseSunsetCalculator;
import com.luckycatlabs.sunrisesunset.dto.Location;
import de.karthaus.config.appConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Singleton;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.TimeZone;

@Singleton
public class SunCycleService {

    private static final Logger log = LoggerFactory.getLogger(SunCycleService.class);


    private Location location;

    private SunriseSunsetCalculator calculator;

    private Calendar sunrise;
    private Calendar sunset;

    /**
     * @param smaDataLoggerConfig
     */
    public SunCycleService(appConfig smaDataLoggerConfig) {
        location = new Location(smaDataLoggerConfig.getLatitude(), smaDataLoggerConfig.getLongitude());
        calculator = new SunriseSunsetCalculator(location, TimeZone.getDefault());
    }

    /**
     *
     */
    private void calculateCycle() {
        sunrise = calculator.getOfficialSunriseCalendarForDate(Calendar.getInstance());
        sunset = calculator.getOfficialSunsetCalendarForDate(Calendar.getInstance());
        log.info("Calculated sunrise to : {} sunset to {}", DateFormat.getTimeInstance().format(sunrise.getTime()),
                DateFormat.getTimeInstance().format(sunset.getTime()));
    }

    /**
     * @return
     */
    public boolean isSunUp() {
        calculateCycle();
        if (Calendar.getInstance().after(sunrise) && Calendar.getInstance().before(sunset)) {
            log.debug("Sun is up");
            return true;
        }
        log.debug("Sun is down");
        return false;
    }


}
