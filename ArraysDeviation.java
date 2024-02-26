import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class ArraysLibrary {
	
	public int min (ArrayList<Integer> numbers) {
		return Collections.min(numbers);
	}
	
	public int max (ArrayList<Integer> numbers) {
		return Collections.max(numbers);
	}
	
	public double mean (ArrayList<Integer> numbers) {
		double sum = 0;
		
		for(int num : numbers) {
			sum += num;
		}
		return sum / numbers.size();
	}
	
	public double median(ArrayList<Integer> numbers) {
        ArrayList<Integer> sortedList = new ArrayList<>(numbers);
        Collections.sort(sortedList);
        int size = sortedList.size();

        if (size % 2 != 0) {
            return sortedList.get(size / 2);
        } else {
           
            int index = size / 2;
            return (double) (sortedList.get(index) + sortedList.get(index - 1)) / 2.0;
        }
    }
	
	public double standardDeviation (ArrayList<Integer> numbers) {
		
		double sampleMean = mean(numbers); 
        double sumSquaredDiff = 0;
        
        for (int num : numbers) {
            double diff = num - sampleMean;
            sumSquaredDiff += diff * diff; 
        }
        
        double variance = sumSquaredDiff / (numbers.size() - 1);
        return Math.sqrt(variance);
	}
	
	public String toString(ArrayList<Integer> numbers) {
        StringBuilder display = new StringBuilder(); 

        for (int num : numbers) {
            display.append(num).append(" ");
        }
        return display.toString();
    }
}

public class ArraysDeviation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of values: ");
		int number = Integer.parseInt(input.nextLine());

		ArrayList<Integer> data = new ArrayList<>();

		if (number < 4) {
			System.out.println("Sorry, at least 4 values required");
		} else {
			for (int i = 0; i < number; i++) {
				System.out.print("Enter an integer: ");
				int num = Integer.parseInt(input.nextLine());
				data.add(num);
			}
			ArraysLibrary arraysLibrary = new ArraysLibrary();

			System.out.println(String.format("\nn = %d", number));
			System.out.println(String.format("Min: %d", arraysLibrary.min(data)));
			System.out.println(String.format("Max: %d", arraysLibrary.max(data)));
			System.out.println(String.format("Mean: %.1f", arraysLibrary.mean(data)));
			System.out.println(String.format("Median: %.1f", arraysLibrary.median(data)));
			System.out.println(String.format("Sample standard deviation: %.1f", arraysLibrary.standardDeviation(data)));
			System.out.println(String.format("Sample data: %s", arraysLibrary.toString(data)));
		}

	}
}
