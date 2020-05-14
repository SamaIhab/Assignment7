package assignment7;
import java.util.*;

public class Problem1 {
	
	public static void main(String[] args) {
		
		int size=50;
		int students[]= new int[size];
		List<Integer> studentsList= new LinkedList<Integer>();
		List<Integer> list1= new LinkedList<Integer>();
		List<Integer> list2= new LinkedList<Integer>();
		List<Integer> list3= new LinkedList<Integer>();
		List<Integer> list4= new LinkedList<Integer>();
		
		
		
		//create array with random 2 digits
		students= createArray(size);
		System.out.println("The array: ");
		printArray(students);
		
		//sort array
	    sortArray(students, size-1);
	    System.out.println("\nThe sorted array Ascending order: ");
	    printArray(students);
	    
	    //create linked list
		studentsList= arrayToLinkedList(students);
		System.out.println("\nThe linked list:");
		printList(studentsList);
		
		//split the list
		list1= studentsList.subList(0, 15);
		list2=studentsList.subList(15, 30);
		list3=studentsList.subList(30, 45);
		list4=studentsList.subList(45, 50);
		System.out.println("\nList 1:");
		printList(list1);
		System.out.println("\nList 2:");
		printList(list2);
		System.out.println("\nList 3:");
		printList(list3);
		System.out.println("\nList 4:");
		printList(list4);
		
		
		
	}
	
	private static void printArray(int [] arr) {
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	private static void printList(List<Integer> list) {
		//System.out.println();
		for(int x: list) {
			System.out.printf("%d ",x);
		}
	}
	
	
	private static int[] createArray(int size) {
		
		int arr[]=new int[size];
		Random random=new Random();
		
		for(int i=0; i<size; i++) {
			arr[i]=random.nextInt((99 -10 ) + 1) + 10;
			//System.out.print(arr[i]+" ");
		}
		
		
		
		return arr;
	}
	
	private static int getMaxIndex(int [] arr, int startIndex, int endIndex) {
		if (arr.length == 0 || startIndex > endIndex)
			return -1;
		
		int max = arr[startIndex];
		int maxIndex = startIndex;
		for (int i=startIndex +1 ; i <= endIndex; i++) {
			if (arr[i]>max) {
				max = arr[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	
	private static void sortArray(int[] arr, int endIndex) {

		if(arr.length==1 || endIndex <= 1)
			return;
		/*int max= arr[0];
		int maxPos=0;
		int temp;
		
		for(int i=1;i<size;i++) {
			if(arr[i]> max) {
				//max=
				
			}
		}*/
		
		int maxPos = getMaxIndex(arr, 0, endIndex);
		
		//Swap max with endIndex
		int temp = arr[maxPos];
		arr[maxPos]= arr[endIndex];
		arr[endIndex] = temp;
		
		sortArray(arr, endIndex -1);
		
		
		
	}
	
	
	private static List<Integer> arrayToLinkedList(int[] arr){
		List<Integer> studentsList= new LinkedList<Integer>();
		
		for(int x: arr) {
			studentsList.add(x);
		}
		
		return studentsList;
	}
}
