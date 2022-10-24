package expressions24;

public class ByteShortIntLong
{

	public static void main(String[] args)
	{
		 int myValue = 10000;
		 int myMinIntValue = Integer.MIN_VALUE;
		 int myMaxIntValue = Integer.MAX_VALUE;
		 System.out.println("In Minimum Value = "+myMinIntValue);
		 System.out.println("In Maximum Value = "+myMaxIntValue);
		 System.out.println("Busted MAX Value = "+(myMaxIntValue+1));//Overflow
		 System.out.println("Busted MIN Value = "+(myMinIntValue-1));//Underflow
		 
		 int myMaxIntTest = 2_147_483_647;
		 
		 byte minByteValue = Byte.MIN_VALUE;
		 byte maxByteValue = Byte.MAX_VALUE;
		 System.out.println("Byte Minimun Value = "+ minByteValue);
		 System.out.println("Byte Maximun Value = "+ maxByteValue);
		 
		 short minShortValue = Short.MIN_VALUE;
		 short maxShortValue = Short.MAX_VALUE;
		 System.out.println("Short Minimun Value = "+ minShortValue);
		 System.out.println("Short Maximun Value = "+ maxShortValue);

		 
		 long LongValue = 100L;//without L doesn't give error as java converts int to long coz int fits in long
		 long minLongValue = Long.MIN_VALUE;
		 long maxLongValue = Long.MAX_VALUE;
		 System.out.println("Long Minimun Value = "+ minLongValue);
		 System.out.println("Long Maximun Value = "+ maxLongValue);
		 
		 long bigLongLiteralValue = 2_147_483_647_234L;
		 System.out.println(bigLongLiteralValue);
		 
		 short bigShortLiteralValue = 32767;
		 
		 int myTotal = (myMinIntValue/2);
		 byte myNewByteValue = (byte)(minByteValue/2);//mentioned byte coz by default (minByteValue/2)inside parenthesis is treated as int by computer 
		 short myShoetNewValue = (short)(minShortValue/2);
		 
		 
		 
		  
	}

}
