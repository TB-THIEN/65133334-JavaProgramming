import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap 2 canh cua hinh chu nhat:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Dien tich:"+ a*b);
        System.out.println("Chu vi:"+ (a+b)*2);

        System.out.println("Canh nho la:" + Math.min(a,b));
        scanner.close();

    }
}
