import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double a = 0, b = 0, c = 0;
        boolean nhapso = false;
        while(!nhapso)
        {
            try
            {
                System.out.print("Nhap a b c cua phuong trinh bac 2:");
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                nhapso = true;
            }
            catch(InputMismatchException e)
            {
                System.out.println("Vui long nhap so");
                scanner.nextLine();
            }
        }

        double delta = Math.pow(b,2) - 4*a*c;
        System.out.println("Delta: " + delta);
        if (delta >= 0) {
            System.out.println("Can Delta: " + Math.sqrt(delta));
        }
        else
        {
            System.out.println("Delta am khong the tinh can Delta");
        }
        scanner.close();
    }
}