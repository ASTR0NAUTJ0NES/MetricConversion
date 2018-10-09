
/**
 * MetricConversion - Lab 2-2 - Program which prompts the user for a distance in meters
 * and prints out a formatted metric conversion to inches, feet, and miles.
 *
 * @author Andrew Albanese
 * @version 2016-01-26
 */
import java.util.Scanner;
public class MetricConversion
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Enter distance in meters: ");
        double meters = in.nextDouble();
        double miles = meters * .000623712;
        double feet = meters * 3.28084;
        double inches = meters * 39.3701;
        
        System.out.println("\ninches = " + inches);
        System.out.println("\nfeet = " + feet);
        System.out.println("\nmiles = " + miles);
    }
}