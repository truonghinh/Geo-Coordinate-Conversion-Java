package com.berico.coords;

import gov.nasa.worldwind.geom.Angle;
import gov.nasa.worldwind.geom.coords.MGRSCoord;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    		Angle lat = Angle.fromDegrees(37.10);
    		Angle lon = Angle.fromDegrees(-112.12);
    		MGRSCoord coord = MGRSCoord.fromLatLon(lat, lon);
    		
    		System.out.println(coord);
    		
    		MGRSCoord coord2 = MGRSCoord.fromString("50RQT0532022012");
    		
    		System.out.println(
    			String.format("%s, %s", 
    					coord2.getLatitude().degrees, 
    					coord2.getLongitude().degrees));
    }
}
