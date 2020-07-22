package com.himadri.hacker.vijaylaxmi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HackerTest1 {

	public static void main(String[] args) {
		Integer[] array = {10, 20, 7};
		List<Integer> list = new ArrayList<>(Arrays.asList(array));
		/*
		 * list.add(10); list.add(20); list.add(7);
		 */
//		list.remove(0);
		
		System.out.println(list);
		int k = 4;
		
		int sum = minSum(list, k);
		System.out.println(sum);
		
	}
	
	public static int minSum(List<Integer> num, int k) {
		Collections.sort(num);
        System.out.println(num);
        int count = 0;
        for(int index =0; index < k; index++) {
        	
        	
        	float smallestNumber = num.get(count);
			/*
			 * if(smallestNumber <= 1) { continue; }
			 */        	
        	int value = (int) Math.ceil(smallestNumber/2);
        	System.out.println("value" + value);
        	num.remove(count);
        	num.add(count, value);  
        	count+=1;
        	
			
			  if(count == num.size()) {
				  count = 0;
//				  Collections.sort(num);
			  }
			 
        }
        
        System.out.println(num);
        int sum = 0;
        for(int value : num) {
        	sum+=value;
        }

        return sum;

    }

}
