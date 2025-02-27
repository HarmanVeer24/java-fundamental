import java.util.Scanner;
class AverageOfThreeNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int FirstNumber = sc.nextInt();
		int SecondNumber = sc.nextInt();
		int ThirdNumber = sc.nextInt();
		int Average = (FirstNumber+SecondNumber+ThirdNumber)/3;
		System.out.println(Average);
		}
	}
