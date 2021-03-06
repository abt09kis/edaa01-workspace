package set;

public class ProblemD5 {
	
	private static MaxSet<Integer> set= new MaxSet<Integer>();
	
	public static int[] uniqueElements(int[] ints){
		for (int i : ints){
			set.add(i);
		}
		int[] result = new int[set.size()];
		
		int k = 0;
		
		for (Integer i : set){
			result[k] = i;
			k++;
		}
		for( int i = 0; i<result.length-1; i++){
			for(int j = i+1; j<result.length; j++){
				if (result[i] > result[j]){
					int temp = result[i];
					result[i] = result[j];
					result[j] = temp;
				}
				
			}
		}
		System.out.print("\n");
		for(int i : result){
			System.out.print(i + " ");
		}
		return result;
	}

	public static void main(String[]args){
		int[] array = {6,5,5,4,3,2,2,9,7,3}; //10 element i en vektor.
		
		System.out.println("array:");
		for(int i : array){
			System.out.print(i + " " );
		}
		uniqueElements(array);
		
		}
}
		

