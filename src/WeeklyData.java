public class WeeklyData {

    
    double[] sleep;

    
    public WeeklyData(double[] input) {
        sleep = input;
        
    }


    
    public double getTotal() {
        double total = 0.0;
        for(int i=0; i < sleep.length; i++)
            total += sleep[i];
        return total; 
    }


    
    public double getAverage() {
        return (getTotal()/sleep.length); 
    }


  
    public double getMax() {
        double max = sleep[0];
        for(int i=1; i < sleep.length; i++){
            if(sleep[i] > max)
                max = sleep[i];
        }
        return max; 
    }


    
    public double getMin() {
       double min = sleep[0];
       for(int i=1; i < sleep.length; i++){
            if(sleep[i] < min)
                min = sleep[i];
       }
        return min; 
    }



     
    @Override
    public String toString() {
        String result = "\nWeekly Sleep Data:\n";
        for(int i=0; i < sleep.length; i++){
            result += ("Day " + (i+1) + ": " + sleep[i] + " hours\n");
        }
        return result;
    }
}
