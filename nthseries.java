public class NthSeries {
	
	public static String seriesSum(int n) {
		// Happy Coding ^_^		
    //declare variables
		double sum = 0.0;
    //use for loop to iterate over the series
		for (int i = 0; i < n; i++)
			sum += 1.0 / (1 + 3 * i);

		return String.format("%.2f", sum);
    
	}
  }
  
