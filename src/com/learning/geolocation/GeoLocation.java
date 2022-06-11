package com.learning.geolocation;

import java.util.ArrayList;
import java.util.List;

public class GeoLocation {

    private static final double r2d = 180.0D / 3.141592653589793D;
    private static final double d2r = 3.141592653589793D / 180.0D;
    private static final double d2km = 111189.57696D * r2d;

    public static void main(String[] args) {


        double dist = org.apache.lucene.util.SloppyMath.haversinMeters(28.6129507,77.2257013, 17.3615815,78.4735916);
         System.out.println(dist / 1000);
    }
}






/*


System.out.println(distance(20.1102351, 77.1271155, 20.1098401, 77.1270973, 'K'));
        System.out.println(distance(32.9697, -96.80322, 29.46786, -98.53506, 'K'));
        System.out.println(distance(12.915700, 77.632046, 11.665154, 78.145657, 'K'));


        System.out.println("############################################");
        System.out.println(org.apache.lucene.util.SloppyMath.haversinKilometers(20.1102351, 77.1271155, 20.1098401, 77.1270973));
        System.out.println(org.apache.lucene.util.SloppyMath.haversinKilometers(32.9697, -96.80322, 29.46786, -98.53506));
        System.out.println(org.apache.lucene.util.SloppyMath.haversinKilometers(12.915700, 77.632046, 11.665154, 78.145657));


        System.out.println("##########################################################");
        System.out.println(distance2(20.1102351, 77.1271155, 20.1098401, 77.1270973) / 1000);
        System.out.println(distance2(32.9697, -96.80322, 29.46786, -98.53506) / 1000);
        System.out.println(distance2(12.915700, 77.632046, 11.665154, 78.145657) / 1000);*/






    /*Trucks

            RoleBased A



            Mongodb
            S3
            Ec2 Deployment



            Pricing Service
                 Mrp





  LB         applicationservers1  ehcache    Mysql

                                Haazlalecast/inventrymanagement
*/
























