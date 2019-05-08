package weather;
import java.util.Scanner;
public class Weather {


    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
 
        //The highest and lowest zip codes are the range of the area
        
        System.out.println("Enter the lowest first zip code:"); 
        int zipmin = input.nextInt();
        System.out.println("Enter the highest first zip code:");
        int zipmax = input.nextInt();
      
        
        //Enter the high and low for each day
        
        System.out.println("Please enter Monday's high tempurature for area " +  zipmin + " - " + zipmax + ":");
        int monHigh = input.nextInt();
        System.out.println("Please enter Monday's low tempurature for area " +  zipmin + " - " + zipmax + ":");
        int monLow = input.nextInt();        
  
        System.out.println("Please enter Tuesday's high tempurature for area " +  zipmin + " - " + zipmax + ":");
        int tueHigh = input.nextInt();
        System.out.println("Please enter Tuesday's low tempurature for area " +  zipmin + " - " + zipmax + ":");
        int tueLow = input.nextInt(); 
        
        System.out.println("Please enter Wednesday's high tempurature for area " +  zipmin + " - " + zipmax + ":");
        int wedHigh = input.nextInt();
        System.out.println("Please enter Wednesday's low tempurature for area " +  zipmin + " - " + zipmax + ":");
        int wedLow = input.nextInt();        
        
        System.out.println("Please enter Thurday's high tempurature for area " +  zipmin + " - " + zipmax + ":");
        int thuHigh = input.nextInt();
        System.out.println("Please enter Thursday's low tempurature for area " +  zipmin + " - " + zipmax + ":");
        int thuLow = input.nextInt(); 

        System.out.println("Please enter Friday's high tempurature for area " +  zipmin + " - " + zipmax + ":");
        int friHigh = input.nextInt();
        System.out.println("Please enter Friday's low tempurature for area " +  zipmin + " - " + zipmax + ":");
        int friLow = input.nextInt(); 
        
        //The average of all highs and all lows
        
        float highAvg = (float)((monHigh +  tueHigh +  wedHigh +  thuHigh +  friHigh)) / 5;
        float lowAvg = (float) ((monLow +  tueLow +   wedLow +   thuLow +  friLow)) / 5;
        
        //Enter your zip code
        
        System.out.print("Please enter your zipcode:");
        int zipcode = input.nextInt();

        /*This code  will only be executed if the zipcode you entered exists  
        within the range*/
        
        if (zipcode >= zipmin &&  zipcode <= zipmax)
        {
           System.out.println("This area cannot be found.");
           System.out.println("Mondays high is " + (monHigh));
           System.out.println("Mondays low is " + (monLow));
           System.out.println("Mondays high is " + (tueHigh));
           System.out.println("Mondays low is " + (tueLow));
           System.out.println("Mondays high is " + (wedHigh));
           System.out.println("Mondays low is " + (wedLow));
           System.out.println("Mondays high is " + (thuHigh));
           System.out.println("Mondays low is " + (thuLow));
           System.out.println("Mondays high is " + (friHigh));
           System.out.println("Mondays low is " + (friLow));
           System.out.println("The high average tempurature is " + (highAvg));
           System.out.println("The high average tempurature is " + (lowAvg));
        }
    
        else
        {
          System.out.println("Error");
                          
        }
    }
    
}
