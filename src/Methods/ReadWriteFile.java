package Methods;


import Manage.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FILE_HEADER = "Name,NumberPhone,Address,Email,NgaySinh,GioiTinh";
    public static void writeToFileCsv(List<User> users, String pathFile) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(pathFile);
            fileWriter.append(FILE_HEADER);
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (User c : users) {
                fileWriter.append(String.valueOf(c.getName()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(c.getNumberPhone()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(c.getAddress());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(c.getEmail());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(c.getNgaySinh());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(c.getSex());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
            System.out.println("Done!!!");
        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {
            try {
                assert fileWriter != null;
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }
    }

    public static void readFromFileCsv(String pathFile) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(pathFile));
            String line;
            while ((line = br.readLine()) != null) {
                String[] cols = line.split(",");
                if (cols[0].equals("Name")) {
                    System.out.println("User : ");
                } else System.out.println("Name: " + cols[0] + ", Phone Number : " + cols[1] +
                        ", Address: " + cols[2] + ", Email: " + cols[3] + ", NgaySinh: " +
                        cols[4] + ", Giới Tính : " + cols[5]);
            }
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }

    public static List<User> readCSV(String pathFile){
        try {
            BufferedReader br = new BufferedReader(new FileReader(pathFile));
            String line;
            ArrayList<User> contacts = new ArrayList<>();
            while ((line = br.readLine()) != null) {
                String[] cols = line.split(",");
                if (cols[0].equals("Name")){
                }else {
                    User c = new User();
                    c.setName(cols[0]);
                    c.setNumberPhone(cols[1]);
                    c.setAddress(cols[2]);
                    c.setEmail(cols[3]);
                    c.setNgaySinh(cols[4]);
                    c.setSex(cols[5]);
                    contacts.add(c);
                }
            }
            return contacts;
        }catch (IOException io){
            io.printStackTrace();
        }
        return null;
    }

    //read and write object
    public static void writeObjectToFile(Object serObj, String filepath) {
        try {
            FileOutputStream fileOut = new FileOutputStream(filepath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(serObj);
            objectOut.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static Object readFromFile(String filepath) {
        try {
            FileInputStream fileIn = new FileInputStream(filepath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            Object obj = objectIn.readObject();
            objectIn.close();
            return obj;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}