package Methods;

import Manage.User;
import Menu.MeThodGet;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MethodsUser {
    static final String PATH = "C:\\Users\\TTC\\Desktop\\BaiThi\\src\\User.csv";
    static ArrayList<User> users = (ArrayList<User>) ReadWriteFile.readCSV(PATH);

    public static void add(User user){
        users.add(user);
        ReadWriteFile.writeToFileCsv(users,PATH);
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
        ReadWriteFile.writeToFileCsv(users,PATH);
    }

    public static void update(String numberPhone){
        for (User user: users) {
            if (user.getNumberPhone().equals(numberPhone)){
                user.setName(MeThodGet.getNameUpdate());
                user.setEmail(MeThodGet.getEmailUpdate());
                user.setNgaySinh(MeThodGet.getDatelUpdate());
            }else {
                System.out.println("Không tìm được số điện thoại trên ");
                search(MeThodGet.getNumberPhoneUpdate());
            }
        }
        ReadWriteFile.writeToFileCsv(users,PATH);
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

    public static boolean checkEmail(String email){
        Pattern pattern = Pattern.compile("([A-Za-z0-9-_.]+@[A-Za-z0-9-_]+(?:\\.[A-Za-z0-9]+)+)");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public static boolean checkPhoneNumber(String phoneNumber){
        Pattern pattern = Pattern.compile("^\\d{2}-[0]\\d{9}");
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}
