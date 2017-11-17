import java.lang.Comparable;
import java.lang.reflect.Array;
import java.util.Arrays;

class Persona{
    public String name;
    int time;

    public String getName() {return name;}
    public int getTime() {return time;}

}

public class Marathon {

    public static void main(String[] args) {
        String[] namesArray = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
        int[] timeArray = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};
        for (int i = 0; i < timeArray.length - 1; i++) {
            for (int j = i + 1; j < timeArray.length; j++) {
                if (timeArray[i] > timeArray[j]) {
                    int myIntBigger = timeArray[i];
                    int myIntSmaller = timeArray[j];
                    timeArray[i] = myIntSmaller;
                    timeArray[j] = myIntBigger;

                    String myStringBigger = namesArray[i];
                    String myStringSmaller = namesArray[j];
                    namesArray[i] = myStringSmaller;
                    namesArray[j] = myStringBigger;
                }
            }
            for (int x = 0; x < timeArray.length; x++) {
                System.out.println(timeArray[x] + " " + namesArray[x]);
            }
        }
    }
}
