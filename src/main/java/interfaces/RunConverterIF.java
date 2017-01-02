package interfaces;

import java.util.ArrayList;

/**********************************************************
 * Created by anartzmugika on 29/11/16.
 **********************************************************/
public interface RunConverterIF {

    /**
     *
     * @param speed_km_h: Add value in kilometers / hour. For Example: 14.5
     * @return String, result example '14.5 km/h = 04:08 min/km'
     */
    String KilometersPerHourToPaceMinKm(double speed_km_h);

    /**
     *
     * @param min_pace int value (minutes)
     * @param sec_pace int value (seconds)
     * @return String, result example '04:17 min/km = 14.007782 km/h'
     */
    String PaceMinKmToKilometersPerHour(int min_pace, int sec_pace);

    /**
     * @param speed_m_min meters for min
     * @return String, result example '241.9 m/min = 14.514 km/h'
     */
    String MetersMinuteToKilometersPerHour(double speed_m_min);

    /**
     * @param speed_km_h Add value in kilometers / hour. For Example: 14.5
     * @return String, result example '241.9 m/min = 14.514 km/h'
     */
    String KilometersPerHourToMetersMinute(double speed_km_h);

    /**
     * @param speed_m_sec meters for second
     * @return String, result example '4.0316 m/sec = 14.514 km/h'
     */
    String MetersSecondToKilometersPerHour(double speed_m_sec);

    /**
     * @param speed_km_h Add value in kilometers / hour. For Example: 14.5
     * @return String, result example '4.0316 m/sec = 14.514 km/h'
     */
    String KilometersPerHourToMetersSecond(double speed_km_h);

    /**
     * @param time HH:MM:SS formatAdd value in kilometers / hour. For Example: 01:00:00
     * @param km double value to asign total kms to convert. For Example: 14.0
     * @return String with pace min/km, result example '01:00:00 / 15km = 04:00min/km'
     */
    String TimeAndKilometersToPacePerKm(String time, double km);

    /**
     * @param time HH:MM:SS formatAdd value in kilometers / hour. For Example: 01:00:00
     * @param pace_min_km MM:SS String value with pace per km. For Example: 04:00 min/km
     * @return String with pace min/km, result example '01:00:00 / 04:00min/km = 15km'
     */
    String TimeAndPacePerKmToTotalKilometers(String time, String  pace_min_km);

    /**
     * @param km double value to asign total kms to convert. For Example: 14.0
     * @param pace_min_km MM:SS String value with pace per km. For Example: 04:00 min/km
     * @return String with pace min/km, result example '15km / 04:00min/km = 01:00:00'
     */
    String TotalKilometersAndPacePerKmToTime(double km, String  pace_min_km);

    /**
     * @param time HH:MM:SS formatAdd value in kilometers / hour. For Example: 01:00:00
     * @param total_steps int value. For Example: 12304.
     * @return String with pace min/km, result example '15km / 04:00min/km = 01:00:00'
     */
    String StepsPerMinuteFromTotalStepsAndTime(String time, int total_steps);

    /**
     * @param km double value to asign total kms to convert. For Example: 14.0
     * @param total_steps int value. For Example: 12304.
     * @return String with pace min/km, result example '15km / 04:00min/km = 01:00:00'
     */
    String StepsPerKmFromTotalStepsAndDistanceKm(double km, int total_steps);

    /**
     * @param distance double value to asign total kms to convert. For Example: If value > 5 considerer input meters
     * @return String with vO2max, result example '3850 (metres)-> VO2 max = 74
     */
    String VO2MaxInCooperTest(double distance);

    /**
     * @param v02 double value to asign vO2max that use to calculate distance to complete to obtain this vO2 max.
     *            For Example: 74 (VO2max) = 3850 m in 12 minutes.
     * @param in_km To return value in kilometers instead of meters (default)
     * @return String with distance in meters or km (boolean specific)
     */
    String DistanceNeedToObtainSpecificVO2MaxWithCooperTest(double v02, boolean in_km);

    /**
     * @param percent: Percent to calculate FC range min value to FC zone (for example 50 = Z1)
     *               Z1: 50-60
     *               Z2: 60-70
     *               Z3: 70-80
     *               Z4: 80-90
     *               Z5: 90-100
     * @param low_fc min ppm
     * @param max_fc max ppm
     * @return
     */
    String ObtainFCZoneWithPercent(int percent, int low_fc, int max_fc);

    /**
     * @param low_fc min ppm
     * @param max_fc max ppm
     * @return
     */
    ArrayList<String> ObtainResumeOfFCZones(int low_fc, int max_fc);

}
