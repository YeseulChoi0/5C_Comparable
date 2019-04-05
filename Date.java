/**
  Represent a date
 */
public class Date implements Comparable{
    private int y,m,d;


    // -------- previously-written code --------
    // constructor
    public Date( int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    /**
      @return a string representation of this instance
     */
    public String toString() {
        // ISO 8601 rules!
        return String.format("%4d-%02d-%02d",y, m, d);
    }

    public int compareTo(Object otherObj){
      if (otherObj instanceof Date){
        Date other = (Date) otherObj;
        int totalDays0 = ((y * 12) + m) * 30 + d;
        int totalDays1 = ((other.y * 12) + other.m) * 30 + other.d;
        if (totalDays0 > totalDays1){
          return 1;
        }if (totalDays0 == totalDays1){
          return 0;
        }else{
          return -1;
        }
      }
      return 0;
    }


}
