import java.util.LinkedList;
import java.util.Scanner;

public class Hotel {
    Scanner sc = new Scanner(System.in);


    public void addCustomer(LinkedList<Customer> customersList) {
        System.out.println("Type Customer Name");
        String name = sc.nextLine();

        System.out.println("Type Customer ID");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Type Customer's Birthday");
        String date = sc.nextLine();
        System.out.println("Type Customer's address");
        String address = sc.nextLine();
        System.out.println("Type Customer stayingDay");
        int stayingDay = sc.nextInt();
        System.out.println("Type Customer's Price");
        int price = sc.nextInt();

//        System.out.println("Type Customer's roomType");
//        System.out.println();
////        int prices = sc.nextInt();
//        String roomTypes = sc.nextLine();

        Customer customers = new Customer(id, name, date, address, stayingDay, price);
        customersList.add(customers);
    }

    public void removeCustomer(LinkedList<Customer> customerList) {
        System.out.println("Nhap id khach hang muon xoa");
        int id = sc.nextInt();
        customerList.removeIf(customer -> customer.getId() == id);
    }

    public void showCustomer(LinkedList<Customer> customerList) {
        System.out.println("Nhap id khach hang xem thong tin");
        int id = sc.nextInt();
        Customer temp = null;
        for (Customer customer1 : customerList) {
            if (customer1.getId() == id) {
                temp = customer1;
            }
        }
        if (temp == null) {
            return;
        }
        System.out.println(temp);


    }

}
