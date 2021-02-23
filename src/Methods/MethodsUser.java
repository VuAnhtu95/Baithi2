package Methods;

import Manage.User;
import Menu.MeThodGet;

import java.util.ArrayList;

public class MethodsUser {
    static ArrayList<User> users = new ArrayList<>();
    static final String PATH = "C:\\Users\\TTC\\Desktop\\BaiThi\\src\\User.dat";

    public MethodsUser(){
        users = (ArrayList<User>) ReadAndWrite.readFromFile(PATH);
    }
    public static void add(User user){
        users.add(user);
        ReadAndWrite.writeObjectToFile(users,PATH);
    }

    public static void show(){
        for (User user : users) {
            System.out.println(user.toString());
        }
    }

    public static void delete(){
        for (User user: users) {
            if (search(MeThodGet.getNumberPhoneDelete())){
                users.remove(user);
                break;
            }else {
                System.out.println("Không tìm được số điện thoại trên ");
                search(MeThodGet.getNumberPhoneDelete());
            }
        }
        ReadAndWrite.writeObjectToFile(users,PATH);
    }

    public static void update(String numberPhone){
        for (User user: users) {
            if (user.getNumberPhone().equals(numberPhone)){
                user = MeThodGet.update();
            }else {
                System.out.println("Không tìm được số điện thoại trên ");
                search(MeThodGet.getNumberPhoneUpdate());
            }
        }
        ReadAndWrite.writeObjectToFile(users,PATH);
    }
    public static boolean search(String numberPhone){
        boolean search = false;
        for (User user: users) {
            if (user.getNumberPhone().equals(numberPhone)){
                search = true;
            }
        }
        return search;
    }

    public static User searchByName(String name){
        User a = null;
        for (User user: users) {
            if (user.getName().equals(name)){
                a = user;
            }
        }
        return a;
    }
}
