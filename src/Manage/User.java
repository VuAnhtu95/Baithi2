package Manage;

import java.io.Serializable;

public class User implements Serializable {
    private String numberPhone;
    private String name;
    private String sex;
    private String address;
    private String ngaySinh;
    private String email;

    public User(){}

    public User(String numberPhone, String name, String sex, String address, String ngaySinh, String email) {
        this.numberPhone = numberPhone;
        this.name = name;
        this.sex = sex;
        this.address = address;
        this.ngaySinh = ngaySinh;
        this.email = email;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString(){
        return "Tên người dùng " + name +"\n" +
                "Giới tính " + sex + "\n" +
                "Địa chỉ " + address + "\n" +
                "Số điện thoại " + numberPhone + "\n" +
                "Ngày sinh " + ngaySinh + "\n" +
                "Email " + email;
    }
}
