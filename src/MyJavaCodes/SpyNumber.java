package MyJavaCodes;
/*
 * What is a Spy Number?
 * Example: => 123 is a spy number
 * 			   1+2+3 = 1*2*3 => 6 = 6 
 */
public class SpyNumber {

	public static void main(String[] args) {
		int i = 0, rem, sum, mul, num;
		while(i<1000) {
			num=i;
			rem=0;
			sum=0;
			mul=1;
			while(num>0) {
			rem = num%10;
			sum = sum+rem;
			mul = mul*rem;
			num = num/10;
			}
			if(sum==mul) {
				System.out.println("This is spy number: " + i);
			}
			i++;
		}


	}

}
