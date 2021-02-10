package customds;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilderCustom sb1 = new StringBuilderCustom();
		sb1.append("World is my playground");
		System.out.println(sb1.toString());
		sb1.delete(4, 60);
		System.out.println(sb1.toString());
		sb1.append(" My name is John");
		System.out.println(sb1.toString());
		
		long NANOSECOND_IN_MILLISECOND = 1000000;
        int ONE_MILLION = 1000000;

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
