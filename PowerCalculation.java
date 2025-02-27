import java.util.*;
class PowerCalculation{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int Base = sc.nextInt();
	int Exponent = sc.nextInt();
	int result = (int)Math.pow(Base,Exponent);
	System.out.println(result);
	}
}
