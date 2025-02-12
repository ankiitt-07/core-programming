import java.util.*;

public class VolumeOfEarth {
    public static void main(String[] args) {
        
        double radiusOfEarthInKm = 6378;
        double radiusOfEarthInmiles = radiusOfEarthInKm * 0.621371;
        double volumeOfEarthInKm = (4.0 / 3) * Math.PI * Math.pow(radiusOfEarthInKm, 3);
        double volumeOfEarthInmiles = (4.0 / 3) * Math.PI * Math.pow(radiusOfEarthInKm, 3);
        System.out.println("The voulume of Earth in cubic Kilometers is " + volumeOfEarthInKm + " km"+" and the voulume of Earth in cubic miles is " + volumeOfEarthInmiles+" miles");


    }
}
