import java.util.Scanner;
class CelsiusToFahrenheit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int TempratureInCelsius = sc.nextInt();
		int TempratureInFahrenheit = (TempratureInCelsius * 9/5) + 32;
		System.out.println(TempratureInFahrenheit);
		}
	}
