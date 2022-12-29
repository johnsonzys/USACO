import java.util.*;

class Main
{
	public static void main (String[] args)
	{
		int arr[] = {5, 1, 3, 2, 4};
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " "); //1 2 3 4 

    ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(5); arr.add(1); arr.add(3); arr.add(2); arr.add(4);
		Collections.sort(arr);
		for (int i : arr)
			System.out.print(i + " "); //1 2 3 4 5
	}
}