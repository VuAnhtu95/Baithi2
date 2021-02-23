package Menu;

import Manage.User;
import Methods.MethodsUser;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("----CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ----");
            System.out.println("Chọn chức năng theo số (để tiếp tục)");
            System.out.println("1: Xem danh sách");
            System.out.println("2: Thêm mới ");
            System.out.println("3: Cập nhật ");
            System.out.println("4: Xóa ");
            System.out.println("5: Tìm kiếm ");
            System.out.println("6: Đọc vào file ");
            System.out.println("7: Ghi vào file ");
            System.out.println("8: Thoát ");
            System.out.println("Chọn chức năng ");
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1->{
                        MethodsUser.show();
                        break;
                    }
                    case 2->{
                        User user = MeThodGet.getInfoUser();
                        MethodsUser.add(user);
                        break;
                    }
                    case 3->{
                        MethodsUser.update(MeThodGet.getNumberPhoneUpdate());
                        break;
                    }
                    case 4->{
                        MethodsUser.delete();
                        break;
                    }
                    case 5->{
                        User user = MethodsUser.searchByName(MeThodGet.getNameSearch());
                        System.out.println(user);
                        break;
                    }
                    case 6->{}
                    case 7->{}
                    case 8->{
                        System.exit(0);
                    }
                    default -> System.out.println("Chỉ được nhập từ 1 đến 8 ");
                }
            }catch (Exception e){
                System.err.println("chỉ được nhập số ");
            }
        }while (true);
    }
}
