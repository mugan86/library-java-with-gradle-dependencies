package test;

import models.Person;
import converter.Run;

import java.util.ArrayList;

/***************************************************
 * Created by anartzmugika on 28/11/16.
 */
public class Test {

    public static void main (String [] args)
    {
        Run converter = new Run();
        System.out.println("14 km/h = " + converter.KilometersPerHourToPaceMinKm(14.0)  + " min/km");
        System.out.println("4:17 min/km = " +converter.PaceMinKmToKilometersPerHour(4, 17) + "km/h");

        System.out.println("18.9 km/h = " + converter.KilometersPerHourToPaceMinKm(18.9)+ " min/km");
        System.out.println("3:17 min/km = " +  converter.PaceMinKmToKilometersPerHour(3, 17) + " km/h");
        System.out.println("241.9 m/min = " + converter.MetersMinuteToKilometersPerHour(241.9) + " km/h");
        System.out.println("14.514 km/h = " + converter.KilometersPerHourToMetersMinute(14.514) + " m/min");
        System.out.println("4.0316 m/sec = " + converter.MetersSecondToKilometersPerHour(4.0316) + " km/h");
        System.out.println("14.514 km/h = " +converter.KilometersPerHourToMetersSecond(14.514) + " m/second");
        System.out.println("01:20:00 in a 4:00min/km pace: " + converter.TimeAndPacePerKmToTotalKilometers("01:20:00", "04:30") + "km.");
        System.out.println("15km in a 4:00min/km pace: " + converter.TotalKilometersAndPacePerKmToTime(15, "04:00"));
        System.out.println("10km in a 4:00min/km pace: " + converter.TotalKilometersAndPacePerKmToTime(10, "04:00"));
        System.out.println("10km in a 3:31min/km pace: " + converter.TotalKilometersAndPacePerKmToTime(10, "03:31"));
        System.out.println("Run to 382:56:00 time and 6054kms in " + converter.TimeAndKilometersToPacePerKm("382:56:00", 6054) + "min/km.");

        //Steps
        System.out.println("14500 steps in 20kms: " + converter.StepsPerKmFromTotalStepsAndDistanceKm(20, 14500) + " steps/km");
        System.out.println("14500 steps in 1h18min00sg: " + converter.StepsPerMinuteFromTotalStepsAndTime("01:18:00", 14500) + " steps/min");


        //VO2 max
        System.out.println("3850 metres in 12 minutes (Test cooper): " + converter.VO2MaxInCooperTest(3850) + " ml/kg/min");
        System.out.println("With VO2max 74 you must run " + converter.DistanceNeedToObtainSpecificVO2MaxWithCooperTest(74, false) + " meters");
        System.out.println("With VO2max 74 you must run " + converter.DistanceNeedToObtainSpecificVO2MaxWithCooperTest(74, true) + " kms");


        //Karvonen
        System.out.println("Low 29ppm and max 174ppm in 70%: " + converter.ObtainFCZoneWithPercent(70, 29, 174));
        ArrayList<String> fc_data = converter.ObtainResumeOfFCZones(29,174);
        System.out.println("*****************************************");
        System.out.println("Low 29ppm and max 174ppm in all zones");
        System.out.println("*****************************************");
        for (int i = 0; i < fc_data.size(); i++)
        {
            System.out.println(fc_data.get(i));
        }

    }
}
