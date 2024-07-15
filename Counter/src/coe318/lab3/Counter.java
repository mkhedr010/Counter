/**
 *
 * @author Mohamed Khedr 
 */
package coe318.lab3;
public class Counter {
    //Instance variables here
   private int base;
   private  Counter leftnigh;
   private int value;
    public Counter(int modulus, Counter left) {
        base = modulus;
        leftnigh = left;
        value = 0;
    }
    /**
     * @return the modulus
     */
    public int getModulus() {
        return base;
    }
    /**
     * Returns the Counter to the left attached to this
     * Counter.  Returns null if there is no Counter
     * to the left.
     * @return the left
     */
    public Counter getLeft() {
        return leftnigh;
    }

    /**
     * @return the digit
     */
    public int getDigit() {
     
        return value;
    }

    /**
     * @param digit the digit to set
     */
    public void setDigit(int digit) {
   value = digit%base;
 }
    /**
     * Increment this counter.  If it rolls over,
     * its left Counter is also incremented if it
     * exists.
     */
    public void increment() {
        value=value+1;
    if (value >= base){
    value = 0;
    if (leftnigh != null){
      leftnigh.increment();
    }
    }
    }

    /** Return the count of this Counter combined
     * with any Counter to its left.
     *
     * @return the count
     */
    public int getCount() {
        int temp;
        if (leftnigh == null)
        {    temp = value;}
        else{temp = value + leftnigh.getCount()*base;}
        return temp;
    }

    /** Returns a String representation of the Counter's
     * total count (including its left neighbour).
     * @return the String representation
     */
    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        return "" + getCount();
    }

}
