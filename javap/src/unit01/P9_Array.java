package unit01;

import java.util.Scanner;
/* Tasks given below:
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array); 
		obj.removeElementInArray(array);//(Optional)
 */

public class P9_Array {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 4, 6, 2, 3 };

		QuestionsOnArray obj = new QuestionsOnArray();
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array);
		obj.removeElementInArray(array); // (Optional)

	}

}

class QuestionsOnArray {

	void sortAnArray(int[] arr) {
		for(int i=0; i<(arr.length)-1;i++) {
			for(int j=i;j<(arr.length)-2;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}

	}

	void findTheDuplicateElements(int[] arr) {
	    System.out.println("Duplicate elements are");
		for(int i=0;i<9;i++) {
			for(int j=1;j<9;j++) {
			if(arr[j] == arr[j+1]) {
				System.out.println(arr[j]+" ");
				
			}
			
		}

	}
	
	}
	void findSecondLargestAndSecondSmallestElement(int[] arr) {
		for(int i=0; i<(arr.length)-1;i++) {
			for(int j=i;j<(arr.length)-2;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("Second smallest element is"+arr[1]);
		System.out.println("Secong largest element is"+arr[(arr.length)-2]);

	}

	void leftRotationInAnArray(int[] arr) {
		System.out.println("\n");
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the Number of times of left rotation to be done: ");
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		{
			int j,first=0;
			first=arr[0];
			
			for(j=0;j<(arr.length-1);j++)
			{
				arr[j]=arr[j+1];
			}
			arr[j]=first;
		}
        System.out.println("Array After left Rotation");
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");

	}

	void removeElementInArray(int[] arr) {
		System.out.println("\n");
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the Position whose Element is to be delete: ");
		int n=in.nextInt();
		System.out.println("Deleted Element is: "+arr[n]);
		for(int i=n;i<(arr.length-1);i++)
		{
          arr[i]=arr[i+1];
		}
	    n=arr.length-1;
	    for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
	}

}
