import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập Chiều rộng hình Chữ nhật");
        float width = input.nextFloat();
        System.out.println("Nhập Chiều cao hình Chữ nhật");
        float height = input.nextFloat();
        float area = width*height;
        System.out.printf("Hình chữ nhật có diện tích %f m2",area);

    }
}
