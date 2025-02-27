import java.util.Scanner;
class PerimeterOfRectangle{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Length = sc.nextInt();
        int Width = sc.nextInt();
        int Perimeter = 2*(Length+Width);
        System.out.println(Perimeter);
        }
}

