package customds;

import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilderCustom sb1 = new StringBuilderCustom();
		sb1.append("0123456");
		System.out.println(sb1.toString());
		sb1.delete(5, 6);
		System.out.println(sb1.toString());
		sb1.append(" My name is John");
		System.out.println(sb1.toString());
		showDifference();
		
		String s ="541,Tim,Part Time,Accountant";
		String[] arr = s.split(",",2);
		System.out.println(Integer.parseInt(arr[0]));
		System.out.println(arr[1]);
		
		

	}
	
	public static void showDifference() {
		long NANOSECOND_IN_MILLISECOND = 1000000;

        long startTime = System.nanoTime();
        StringBuilderCustom sb = new StringBuilderCustom();
        for (int i = 0; i < 10000; i++) {
            sb.append(String.valueOf(i));
        }
        String test = sb.toString();

        System.out.println("StringBuilder Test ------------------------------------");
        System.out.println("Time elapsed: " + (System.nanoTime() - startTime) / NANOSECOND_IN_MILLISECOND + " milliseconds");

        startTime = System.nanoTime();

        String test2 = "";
        for (int i = 0; i < 10000; i++) {
            test2 += i;
        }

        System.out.println("StringBuilder Test ------------------------------------");
        System.out.println("Time elapsed: " + (System.nanoTime() - startTime) / NANOSECOND_IN_MILLISECOND + " milliseconds");
		
	}

}
