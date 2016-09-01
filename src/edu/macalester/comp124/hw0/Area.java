package edu.macalester.comp124.hw0;

/**
 * @author Shilad Sen
 */
import java.lang.Math;
public class Area {
    /**
     * Calculates the area of a square.
     * @param sideLength The length of the side of a square
     * @return The area
     */
    public static double getSquareArea(double sideLength) {
        // Has been replaced by correct formula
        return sideLength * sideLength;
    }

    /**
     * Calculates the area of a circle.
     * @param radius The radius of the circle
     * @return The area
     */
    public static double getCircleArea(double radius) {
        // Replaced by correct value
        return radius * 2 * Math.PI;
    }

}
