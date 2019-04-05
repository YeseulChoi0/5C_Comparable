/**
  Represent a point, using Cartesian coordinates
 */
public class Point implements Comparable{
    public double xcor;
    public double ycor;

    /**
      @return  a negative integer, zero, or a positive integer
      depending on whether this Point is closer,
      equidistant, or farther than the Point referred to
      by the parameter.
     */
    public int compareTo( Object otherObj){
        /* Use the Pythagorean theorem.
           Double.compare helped me.
           If the math is a problem, use a simpler
           relationship, like "higher is bigger"
           and change the tests accordingly */
       Point other = (Point) otherObj;
       double distFromCenter0 = Math.pow(xcor * xcor + ycor * ycor, 0.5);
       double distFromCenter1 = Math.pow(other.xcor * other.xcor + other.ycor * other.ycor, 0.5);
       if (distFromCenter0 > distFromCenter1){
         return 1;
       }if (distFromCenter0 == distFromCenter1){
         return 0;
       }else{
         return -1;
       }
       // return (int)(distFromCenter0 - distFromCenter1);

    }

    // -------- previously-written code ----------
    // constructor
    public Point( double xcor, double ycor) {
        this.xcor = xcor;
        this.ycor = ycor;
    }

    /**
      @return a string representation of this instance
     */
    public String toString() {
        return "(" + xcor + "," + ycor + ")";
    }

}
