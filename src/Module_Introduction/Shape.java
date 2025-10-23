package Module_Introduction;

/**
 * Shape class. Designed to act as an abstract base class to other shapes.
 * Shows good use of Javadoc comments, annotations, visibility scope, modifiers and class heirarchies.
 * class marked as 'abstract' since it is not intended to be instantiated directly.
 * @author mdixon
 */

 abstract class Shape {

    /**
     * The number of sides within the shape.
     * Uses 'private' visibility modifier. Could use 'protected' so it can be accessed by sub-classes.
     */
    private int sides;
    /**
     * Gets the number of sides within the shape
     * @return the number of sides
     */
    public int getSides() {
        return sides;
    }
    /**
     * Sets the number of sides within the shape
     * @param sides the number of sides witin hte shape.
     */
    public void setSides(int sides) {
        this.sides = sides; // use this.sides to distinguish between parameter and attribute
    }
    /** 
     * @param sides
     * @return double
     */
    /**
     * Gets the size of the shapes area
     * @return the size of the shapes area
     */
    abstract public double getArea();
    /**
     * Constructor.
     * @param sides the number of sides within the shape
     */
    Shape(int sides) {
        this.sides = sides;
    }
}