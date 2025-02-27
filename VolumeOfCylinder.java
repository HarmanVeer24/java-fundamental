import java.util.Scanner;
class VolumeOfCircle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int Radius = sc.nextInt();
		int Height = sc.nextInt();
		double Volume = 3.14 * Radius * Radius * Height;
		System.out.println(Volume);
		}
	}

