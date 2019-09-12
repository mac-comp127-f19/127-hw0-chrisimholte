package edu.macalester.comp127.hw0;

/**
 * @author Shilad Sen
 * @author Chris Imholte
 *
 */

public class Area {
    /**
     * Calculates the area of a square.
     * @param sideLength The length of the side of a square
     * @return The area
     */
    public static double getSquareArea(double sideLength) {
        //replaced with the correct formula
        return sideLength * sideLength;
    }

    /**
     * Calculates the area of a circle.
     * @param radius The radius of the circle
     * @return The area
     */
    public static double getCircleArea(double radius) {
        // replaced with the correct formula, including a five digit double for applicable test case.
        return ((radius * radius) * 3.1415);
    }

}
