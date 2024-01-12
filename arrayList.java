import java.util.ArrayList;
import java.util.List;

public class NumberMagic {
    /**
     * This method generates a list of multiples of a given number less than a specified limit.
     * 
     * @param number the number to find multiples of
     * @param limit the upper bound for the multiples
     * @return a List of multiples of the number less than the limit
     */
    public List<Integer> determineMultiples(int number, int limit) {
        ArrayList <Integer> result = new ArrayList <Integer> ();
        if(number <= 0 || limit <= 0 || number > limit) return result;
        int i = 1;
        while (number * i < limit){
            result.add(number*i);
            i++;
        }
        return result;
    }
}
