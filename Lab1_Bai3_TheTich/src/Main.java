import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap canh cua khoi lap phuong:");
        int a = scanner.nextInt();

        System.out.println("The tich:" + (int)Math.pow(a,3));
        scanner.close();
    }
}