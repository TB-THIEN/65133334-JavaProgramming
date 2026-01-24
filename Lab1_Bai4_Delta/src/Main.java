import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a b c cua phuong trinh bac 2:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double delta = Math.pow(b,2) - 4*a*c;
        System.out.println("Delta: " + delta);
        if (delta >= 0) {
            System.out.println("Can Delta: " + Math.sqrt(delta));
        }
        else
        {
            System.out.println("Delta am khong the tinh can Delta");
        }
    }
}