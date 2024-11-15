public class TimeCalc {
    public static void main(String[] args) {
        //taking the inputs
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int addedMinutes = Integer.parseInt(args[1]);
        
        //calculation of new total minutes
        int totalMinutes = (hours * 60) + minutes + addedMinutes;
        //taking out the hours
        int totalHours = totalMinutes / 60;
        int newHours = totalHours % 24;
        //calculate the remain minutes
        int newMinutes = totalMinutes - (totalHours * 60);

        String newStringNumnber="";

        if (newHours < 10)
        {
            newStringNumnber = newStringNumnber + "0" + newHours;
        }
        else
        {
            newStringNumnber = Integer.toString(newHours);
        }

        newStringNumnber = newStringNumnber + ":";

        if (newMinutes < 10)
        {
            newStringNumnber = newStringNumnber + "0" + newMinutes;   
        }
        else
        {
            newStringNumnber = newStringNumnber + Integer.toString(newMinutes);
        }

        
        System.out.println(newStringNumnber);
    }
}
