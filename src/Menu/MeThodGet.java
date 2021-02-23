package Menu;

import Manage.User;
import Methods.MethodsUser;

import java.util.Scanner;

public class MeThodGet {
    static Scanner scanner = new Scanner(System.in);
    public static User getInfoUser(){
        User user = new User();
        System.out.println("Nhập vào số điện thoại của bạn ");
        String numberPhone = scanner.nextLine();
        user.setNumberPhone(numberPhone);
        System.out.println("Nhập vào tên của bạn ");
        String name = scanner.nextLine();
        user.setName(name);
        System.out.println("Nhập vào giới tính của bạn ");
        System.out.println("Chọn 1 nếu là Nam");
        System.out.println("Chọn 2 nếu là Nữ ");
        System.out.println("Chọn 3 nếu là Bê đê ");
        int choice = Integer.parseInt(scanner.nextLine());
        try {
            switch (choice){
                case 1-> user.setSex("Nam");
                case 2-> user.setSex("Nữ");
                case 3-> user.setSex("Bê Đê");
            }
        }catch (Exception e){
            System.err.println("Chỉ được nhập số ");
        }
        System.out.println("Nhập vào địa chỉ của bạn ");
        String address = scanner.nextLine();
        user.setAddress(address);
        System.out.println("Nhập vào ngày sinh của bạn ");
        String ngaySinh = scanner.nextLine();
        user.setNgaySinh(ngaySinh);
        System.out.println("Nhập vào email của bạn ");
        String email = scanner.nextLine();
        user.setEmail(email);
        return user;
    }
    public static String getNumberPhoneUpdate(){
        System.out.println("Nhập số điện thoại bạn cần sửa ");
        String numberPhone = scanner.nextLine();
        return numberPhone;
    }
    public static String getNumberPhoneDelete(){
        System.out.println("Nhập số điện thoại bạn cần xóa ");
        String numberPhone = scanner.nextLine();
        return numberPhone;
    }
    public static String getNameSearch(){
        System.out.println("Nhập tên bạn cần tìm ");
        String name = scanner.nextLine();
        return name;
    }
    public static User update(){
        User user = new User();
        System.out.println("Nhập vào tên mới ");
        String name = scanner.nextLine();
        user.setName(name);
        System.out.println("Nhập vào giới tính mới của bạn ");
        System.out.println("Chọn 1 nếu là Nam");
        System.out.println("Chọn 2 nếu là Nữ ");
        System.out.println("Chọn 3 nếu là Bê đê ");
        int choice = Integer.parseInt(scanner.nextLine());
        try {
            switch (choice){
                case 1-> user.setSex("Nam");
                case 2-> user.setSex("Nữ");
                case 3-> user.setSex("Bê Đê");
            }
        }catch (Exception e){
            System.err.println("Chỉ được nhập số ");
        }
        System.out.println("Nhập vào địa chỉ mới của bạn ");
        String address = scanner.nextLine();
        user.setAddress(address);
        System.out.println("Nhập vào ngày sinh của bạn ");
        String ngaySinh = scanner.nextLine();
        user.setNgaySinh(ngaySinh);
        System.out.println("Nhập vào email của bạn ");
        String email = scanner.nextLine();
        user.setEmail(email);
        return user;
    }
}
