import java.util.LinkedList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Customer> customerList = new LinkedList<>();
        Hotel hotel = new Hotel();
        int num;
        do

        {
            System.out.println("Menu");
            System.out.println("1. Nhap khach tro");
            System.out.println("2. Xóa khách trọ");
            System.out.println("3. Hiển thị khách trọ");
            num = Integer.parseInt(sc.nextLine());
            switch (num) {
                case 1:
                    hotel.addCustomer(customerList);
                    break;
                case 2:
                    hotel.removeCustomer(customerList);
                    break;
                case 3:
                    hotel.showCustomer(customerList);
                    break;
                case 0:
                    System.exit(0);
            }

        } while(true);

    }
}
