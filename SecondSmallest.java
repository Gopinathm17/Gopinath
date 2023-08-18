package assignment;

import java.util.Arrays;

public class SecondSmallest {

	public static void main(String[] args) {
		int [] arr={23,45,67,32,89,22 };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length;i++) {
			System.out.println(arr[1]);
			break;
		}

	}

}
