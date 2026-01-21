import java.util.Scanner;

/**
 * Instructions:
 * - Complete the WeeklyData.java class first.
 * - Use this App class to collect user input and test your WeeklyData methods.
 * - Follow all TODOs carefully.
 * - Do NOT hard-code values — use loops and method calls.
 */
public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // -------------------------------------------------------------
        // TODO 1: Create a Scanner for user input
        // -------------------------------------------------------------
        introduction();
        inputBlocker(input);
        WeeklyData sleepData = new WeeklyData(createSleepData(input));
        inputBlocker(input);
        System.out.println();
        displayInsights(sleepData);
        inputBlocker(input);
        System.out.println(sleepData);
        
    
        // -------------------------------------------------------------
        // TODO 2: Give information about your program
        //         Ask the user about their goals (if applicable)
        // -------------------------------------------------------------


        // -------------------------------------------------------------
        // TODO 3: Create an array to hold 7 days of data
        //         Use an appropriate data type (int or double)
        //         Name the array weekData
        // -------------------------------------------------------------


        // -------------------------------------------------------------
        // TODO 4: Use a for loop to collect data for each day of the week
        //         Prompt example:
        //         "Enter <data type> for day X: "
        //
        //         Include input validation:
        //         - Use a while loop to prevent negative values
        //         - Re-prompt if the value is invalid
        // -------------------------------------------------------------


        // -------------------------------------------------------------
        // TODO 5: Create a WeeklyData object
        //         Pass the weekData array into the constructor
        // -------------------------------------------------------------


        // -------------------------------------------------------------
        // TODO 6: Display the results of the analysis
        //         Call methods from WeeklyData to display:
        //         - Total
        //         - Average
        //         - Minimum
        //         - Maximum
        //
        //         Use clear labels and formatted output if needed
        // -------------------------------------------------------------


        // -------------------------------------------------------------
        // TODO 7: Display the full week of data
        //         Use the toString() method from WeeklyData
        // -------------------------------------------------------------


        // -------------------------------------------------------------
        // TODO 8: Give the user insights about their week
        //         --> "You need to drink more water next week!"
        //         --> "You were very hydrated this week!"
        //         --> etc.
        // -------------------------------------------------------------


    }
    public static void introduction()
    {
        System.out.println("This program collects and analyzes your weekly data of sleep.");
        System.out.println("You will be prompted to enter the number of hours you sleep each day for a week");
        System.out.println("We take that data and analyze it in order to give you insights of your sleep");
        System.out.println("Click any enter to continute throughout the program!");
    }

    public static double[] createSleepData(Scanner input)
    {
        double[] sleepData = new double[7];
        for (int i = 0; i < 7; i++)
        {
            try{
                System.out.println("Enter the number of hours you slept for day " + (i + 1) + ": ");
                double hours = input.nextDouble();
                sleepData[i] = hours;
            }
            catch(Exception e)
            {
                System.out.println("Invalid input. Please enter a valid number.");
                input.next(); 
                i--; 
            }
            
        }
        return sleepData;
    }

    public static void displayInsights(WeeklyData data)
    {
        double averageSleep = data.getAverage();
        System.out.printf("Your average sleep this week was: %.2f hours\n", averageSleep);
        if (averageSleep < 8)
        {
            System.out.println("You need to get more sleep next week!");
        }
        else if (averageSleep >= 8 && averageSleep <= 10)
        {
            System.out.println("You had a healthy amount of sleep this week!");
        }
        else
        {
            System.out.println("You slept a lot this week! Make sure it's quality sleep.");
        }
        System.out.println();
        System.out.printf("Your maximum sleep this week was: %.2f hours\n", data.getMax());
        double maxSleep = data.getMax();
        if (maxSleep > 10)
        {
            System.out.println("You had a day with excessive sleep! Try to maintain a consistent sleep schedule.");
        }
        else if(maxSleep >= 8 && maxSleep <= 10)
        {
            System.out.println("Your maximum sleep was within a healthy range. Get more of these!");
        }
        else
        {
            System.out.println("Consider getting more sleep on your busiest days.");
        }
        System.out.println();
        System.out.println("Your minimum sleep this week was: " + data.getMin() + " hours");
        double minimumSleep = data.getMin();
            if (minimumSleep < 6)
            {
                System.out.println("You had a day with very little sleep! Try to avoid this consitency matters!");
            }
            else
            {
                System.out.println("Your minimum sleep was decent. Keep it up!");
        }
        System.out.println();
        System.out.println("Your total sleep this week was: " + data.getTotal() + " hours");
        double totalSleep = data.getTotal();
        if (totalSleep < 56){
            System.out.println("You need to increase your total sleep hours next week!");
        }
        else{
            System.out.println("Great job on getting enough sleep this week!");
        }

    }

    public static void inputBlocker(Scanner input){
        input.nextLine();
    }
}

