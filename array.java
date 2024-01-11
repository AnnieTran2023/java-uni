//calculate sum of each array and compare if they are equal

public class BiArray {

    private int[] array1;
    private int[] array2;

    public BiArray(int[] array1, int[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }
   
    public boolean areSumsEqual() {

        int sum1 = calculateSum(array1);
        int sum2 = calculateSum(array2);
        return sum1==sum2;
    }

    private int calculateSum(int[] array) {
        
          int sum = 0;
        for(int num : array) {
            sum += num;
        }
        return sum;
    }
}
