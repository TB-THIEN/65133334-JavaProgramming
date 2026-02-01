import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a = 0, b = 0;
        boolean nhapso = false;
        while(!nhapso)
        {
            try
            {
                System.out.print("Nhap 2 canh cua hinh chu nhat:");
                a = scanner.nextInt();
                b = scanner.nextInt();

                if(a <= 0 || b <= 0)
                {
                    System.out.println("Vui long nhap so lon hon 0");
                }
                else
                {
                    System.out.println("Dien tich:"+ a*b);
                    System.out.println("Chu vi:"+ (a+b)*2);

                    System.out.println("Canh nho la:" + Math.min(a,b));
                    nhapso = true;
                }

            }
            catch (InputMismatchException e)
            {
                System.out.println("Vui long nhap so");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
