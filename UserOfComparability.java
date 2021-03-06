/**
  exercise Comparable types
 */

public class UserOfComparability {

    public static void main(String[] commandLine) {
      //hello
        System.out.println( System.lineSeparator()
                          + "Point comparisons");

        // Point vs. itself
        Point p0 = new Point( 3., 4.);
        reportRelationship( "Point vs. itself", p0, p0, "0");

        // Point vs. its reflection about y = x
        reportRelationship( "Point vs. its reflection about y = x"
                          , p0, new Point( 4., 3.), "0");

        // Point vs. point closer to origin
        reportRelationship( "Point vs. point closer to origin", p0
                          , new Point( 1., 2.), "positive int");

        // Point vs. distant point
        reportRelationship( "Point vs. distant point", p0
                          , new Point( 100., 2.), "negative int");
        System.out.println( "---- end of Point comparisons ----");

        System.out.println( System.lineSeparator()
                          + "Date comparisons");

        Date d0 = new Date(2018, 4, 4);
        reportRelationship("Date vs. itself", d0, d0, "0");
        reportRelationship("Date vs. further date in terms of years", new Date(2019, 1, 1), d0, "positive int");
        reportRelationship("Date vs. past date in terms of years", new Date(200, 1, 3), d0, "negative int");
        reportRelationship("Date vs. further date in terms of months", new Date(2018, 5, 12), d0, "positive int");
        reportRelationship("Date vs. past date in terms of months", new Date(2018, 2, 24), d0, "negative int");
        reportRelationship("Date vs. further date in terms of days", new Date(2018, 4, 15), d0, "positive int");
        reportRelationship("Date vs. past date in terms of days", new Date(2018, 4, 1), d0,  "negative int");

        // System.out.println(System.lineSeparator() + "Dog comparison");
        // reportRelationship("Comparing two dogs", new IncomparableDog(), new IncomparableDog(), "error!");
        // error: incompatible types: IncomparableDog cannot be converted to Comparable
        // reportRelationship("Comparing two dogs", new IncomparableDog(), new IncomparableDog(), "error!");

        System.out.println("Comparing a Point and a Date");
        reportRelationship("Point vs. Date", d0, p0, "ERROR");
    }


    /**
      Print the results of comparing two entities.
     */
    private static void reportRelationship
    ( String description
      , Comparable a
      , Comparable b
      , String expect
      ) {
        System.out.println( description);

        // check
        System.out.println(
            a + " compareTo " + b + ": "
          + a.compareTo( b)
            /* eventually expecting a compiler warning:
              warning: [unchecked] unchecked call to compareTo(T) as a member of the raw type Comparable
              where T is a type-variable:
                T extends Object declared in interface Comparable
             */

          + " ...expecting " + expect
          + System.lineSeparator());
     }
}
