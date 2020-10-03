

package com.company;

public class Exercises {
    public static int digitSwapper(int input) {
        int x = input % 10;
        int y = (input / 10) % 10;
        int z = input/100;
        int swapped = z*100+x*10+y;

        return swapped;
        //returns the number with the last 2 digits swapped

    }

    public static int timeLeft(int currHour, int currMin, int depHour, int depMin) {
        int x = depHour - currHour;
        int y = depMin - currMin;
        System.out.println(x+" Hours and " +y+" minutes");

        return y;
        
        //PRINT the time left here in hours and minutes
    }

 /*  public static int dayOfWeek(int daysOfWeek1, int day) {

       // returns an integer corresponding to the day of the week
   }*/


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int input = 123;
        int output = digitSwapper(input);
        System.out.println(input + " " + output);
        timeLeft(1,34, 8, 20);
        timeLeft(1,15, 4, 36);
    }
}

     /*  input = 6;
       output = digitSwapper(input);
       System.out.println(input +" " + output);

       input = 381;
       output = digitSwapper(input);
       System.out.println(input +" " + output);
*/
/*
       timeLeft(1,34, 8, 20);
       timeLeft(1,15, 4, 36);
/*
       System.out.println(dayOfWeek(0,1));
       System.out.println(dayOfWeek(0,14));
       System.out.println(dayOfWeek(6, 22));
       System.out.println(dayOfWeek(5, 4));
       System.out.println(dayOfWeek(1,24));
       System.out.println(dayOfWeek(2,1));
*/








/*
*
* 370250 370205
6 60
381 318
0
6
6
1
3
2
6 Hours and 46 minutes.
3 Hours and 21 minutes.
*/

