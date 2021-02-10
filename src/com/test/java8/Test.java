package com.test.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Arrays.deepToString(merge(new int[][]{{1,3},{2,6},{8,10},{15,18}})));
		
		/*MyArrayList<Integer> myDynamicArray = new MyArrayList<Integer>();
		myDynamicArray.put(10);
		myDynamicArray.print();
		System.out.println(myDynamicArray.getSize());
		myDynamicArray.put(12);
		myDynamicArray.print();
		System.out.println(myDynamicArray.getSize());
		myDynamicArray.remove(0);
		myDynamicArray.print();
		System.out.println(myDynamicArray.getSize());
		for(int i=10;i>=0;i--){
			myDynamicArray.put(i);
		    }
		
		myDynamicArray.print();
		System.out.println(myDynamicArray.getSize());
		
		
		int[] arr = {1,2,3,4,5};
		
		int j = findInt(arr, p -> p==4, p -> {return (p+1);});*/
		//find 
		//System.out.println(j);
		//reverse("Hello World!");
		//System.out.println(Arrays.toString(mergerSortedArray(new int[] {0,3,4,31}, new int[] {4,6,30})));
		
		

	}
	
	public static int[][] merge(int[][] intervals) {
        
        int[][] result = new int[intervals.length][2];
        int index=0;
        for(int i=0;i<intervals.length-1;i++){
            
            if(intervals[i+1][0]<=intervals[i][1]){
                int[] tmp = new int[2];
                tmp[0] = intervals[i][0];
                tmp[1] = intervals[i+1][1];
                result[index++] = tmp;
                i++;
            }else{
                result[index++] = intervals[i];
            }
        }
        
        return Arrays.copyOf(result, index);
    }
	
	public static void reverse(String str){
	    if(str==null||str.isEmpty()){
	      return;
	    }
	    System.out.println(str);
	    String res = "";
	    for(int i=str.length()-1;i>=0;i--){
	      res = res+str.charAt(i);
	    }
	    
	    
	   
	    

	  }
	
	public static int[] mergerSortedArray(int[] arr1, int[] arr2) {
		
		//create a result array of size (arr1.length + arr2.length)
		//create 3 counters one for result,one for arr1 and one for arr2 and set both to 0
		//loop until either counters run out, compare arr1 element vs arr2, and add the smaller to
		//the result array. Increase smaller counter and res counter.
		//at the end of the loop, if eirther counters are not 0, create another loop and add
		//remaining items to result array
		
		int[] result = new int[arr1.length + arr2.length];
		int resCounter=0, arr1Counter=0, arr2Counter=0;
		while((arr1Counter <= arr1.length-1) && (arr2Counter <= arr2.length-1)) {
			if(arr1[arr1Counter] < arr2[arr2Counter]) {
				result[resCounter] = arr1[arr1Counter];
				resCounter++;
				arr1Counter++;
				
			}else {
				
				result[resCounter] = arr2[arr2Counter];
				resCounter++;
				arr2Counter++;
				
			}
		}
		
		while(arr1Counter<=arr1.length-1) {
			result[resCounter] = arr1[arr1Counter];
			resCounter++;
			arr1Counter++;
		}
		
		while(arr2Counter<=arr2.length-1) {
			result[resCounter] = arr2[arr2Counter];
			resCounter++;
			arr2Counter++;
		}
		
		
		
		return result;
	}
	
	public static Integer findInt(int[] arr, Predicate<Integer> predicate, Function<Integer, Integer> consumer) {
		for(int i: arr) {
			if(predicate.test(i)) {
				return consumer.apply(i);
			}
		}
		return 0;
		//tersdt
		
	}
	
	public int[] twoSum(int[] nums, int target) {
        if(nums.length==2){
            return new int[] {0,1};
        }
        
        HashMap<Integer, Integer> resMap = new HashMap<Integer, Integer>();
        int j =0;
        for(int i : nums){
            resMap.put(i,j++);
        }
        
        Arrays.sort(nums);
        int left =0;
        int right = nums.length -1;
        while(left<right){
            if(nums[left] + nums[right]==target)
                return new int[]{resMap.get(nums[left]),resMap.get(nums[right])};
            else if(nums[left] + nums[right]>target){
                right--;
            }else{
                left++;
            }
        }
        //System.out.println(resMap);
        return null;
        
    }

}
