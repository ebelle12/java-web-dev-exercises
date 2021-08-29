package org.launchcode.java.studios.areaofacircle;

// ask for radius
// calculate area
// print result


import java.util.Scanner;

public class Area {

    public static void main(String [] args) {
        Area area = new Area();
        area.calculateArea();
    }

    //declare variable


    // create constructor
    public Area() {

    }
    // create methods
    public void calculateArea() {
        // ask for radius
        Scanner input = new Scanner(System.in);
            try {
                boolean keepOnLooping = true;
                while(keepOnLooping) {
                    Double myUsersRadius = input.nextDouble();

                    // checks to see if it is a negative number
                    if (myUsersRadius < 0) {
                        System.out.println("You can not enter a negative number");
                        // re-prompt user
                    } else {
                        // calculate radius
                        // A = pi * r * r
                        Double area = Circle.getArea(myUsersRadius);

                        // print result
                        System.out.println(area);

                        // Tell the while loop to exit
                        keepOnLooping = false;
                    }
                }
            } catch(Exception error) {
                System.out.println("You must provide a numeric input");
            }



                // close scanner
                input.close();
    }
}
