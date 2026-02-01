import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double cannang = 0, chieucao = 0;
        boolean nhapso = false;
        while(!nhapso)
        {
            try
            {
                System.out.print("Nhap can nang (kg): ");
                cannang = scanner.nextDouble();

                System.out.print("Nhap chieu cao (m): ");
                chieucao = scanner.nextDouble();

                if (chieucao > 0 && cannang > 0) {
                    double bmi = cannang / Math.pow(chieucao, 2);
                    System.out.printf("BMI: %.2f\n", bmi);

                    if (bmi < 18.5)
                    {
                        System.out.println("Danh gia: Gay");
                    }
                    else if (bmi < 25)
                    {
                        System.out.println("Danh gia: Binh thuong");
                    }
                    else if (bmi < 30)
                    {
                        System.out.println("Danh gia: Thua can");
                    }
                    else
                    {
                        System.out.println("Danh gia: Beo phi");
                    }
                }
                else
                {
                    System.out.println("Du lieu nhap vao khong hop le (phai > 0)!");
                }
                nhapso = true;
            }
            catch(InputMismatchException e)
            {
                System.out.println("Vui long nhap so");
                scanner.nextLine();
            }

        }

        scanner.close();
    }
}