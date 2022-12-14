package example;

public class OperatorsDemo {
	public static void main(String[] args) {
		byte byteValue1 = 127;
		byte byteValue2 = -128;
		System.out.println("Byte Value1: "+byteValue1);
		System.out.println("Byte Value2: "+byteValue2);
		
		int intValue1 = 889900112;
		long longValue1 = 8899001129L;
		
		System.out.println("IntValue1: "+intValue1);
		System.out.println("LongValue1: "+longValue1);
		
		int result = 2 % 3;  
		System.out.println("Result: "+result);
		int x = 15;
		int y = 20;
		
		result = x++; // 15 or 16 or 2
		System.out.println("Result = "+result); // 14
		
		int result2 = --y;
		System.out.println("Result = "+result2); // 19
	}
}
