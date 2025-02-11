package com.atos.deproj.sprint2145.design;

import java.util.Arrays;

public class ArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2, 3, 6, 8, 4, 5, 78, 1};
		int secondMinimum=Arrays.stream(arr).sorted().boxed().skip(1L).findFirst().orElse(0);
		System.out.println(" "+secondMinimum);
		int thirdMinimum=Arrays.stream(arr).sorted().boxed().skip(2L).findFirst().orElse(0);
		System.out.println(thirdMinimum);
		
		String s1="this is test string is this";
		
	}

}
