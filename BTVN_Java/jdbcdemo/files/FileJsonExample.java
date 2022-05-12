package BTVN_Java.jdbcdemo.files;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FileJsonExample {
    public static void main(String[] args) throws IOException {
        writeJson();
        writeJsonObject();
        writeJsonObjects();
        readJsonObjects();
        readjsonObject();
    }
    public  static void writeJson() throws IOException {
        HashMap<String,Object> map = new HashMap<>();

        map.put("name","khoi");
        map.put("address",new String[]{"ton TT","HBT","Minh Khai"});
        map.put("email","khoi@fpt.edu.vn");
        map.put("active",true);

        Writer writer = new FileWriter("data.json");


        Gson gson = new Gson();
        gson.toJson(map,writer);

        writer.close();
        System.out.println("ghi file json thanh cong");

    }
    public static void writeJsonObject() throws IOException {
        //Create account object
        Account account = new Account(1,"minh",new String[]{"Trung Kính","Tôn TT"},"Minh@fpt.edu.vn",true);


        //file name
        String file = "data1.json";
        //duong dan file
        Path path = Paths.get("data1.json");
        Writer writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonElement tree = gson.toJsonTree(account);
        gson.toJson(tree,writer);

        writer.close();
        System.out.println("Ghi file gson thanh cong");

    }
    public  static void writeJsonObjects() throws IOException {
        List<Account> accounts = Arrays.asList(
                new Account(1,"đức",
                        new String[]{"Ngọc hà","ba đình"},"duc@fpt.edu.vn", true),
                new Account(1,"Khôi",
                        new String[]{"Ngọc hà","ba đình"},"duc@fpt.edu.vn", true),
                new Account(1,"minh",
                        new String[]{"Ngọc hà","ba đình"},"duc@fpt.edu.vn", true),
                new Account(1,"việt anh",
                        new String[]{"Ngọc hà","ba đình"},"duc@fpt.edu.vn", true),
                new Account(1,"việt",
                        new String[]{"Ngọc hà","ba đình"},"duc@fpt.edu.vn", true),
                new Account(1,"nam",
                        new String[]{"Ngọc hà","ba đình"},"duc@fpt.edu.vn", true)

        );

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Writer writer = Files.newBufferedWriter(Paths.get("data2.json"),StandardCharsets.UTF_8);
        gson.toJson(accounts,writer);
        writer.close();

        System.out.println("Ghi file data thanh cong");
    }
    public  static void readJsonObjects () throws  IOException {
        Gson gson = new Gson();
        Reader reader = Files.newBufferedReader(Paths.get("data2.json"));
        List<Account> accounts = new Gson().fromJson(reader,new TypeToken<List<Account>>(){}.getType());
        accounts.forEach(System.out::println);
        reader.close();
    }
    public static void readjsonObject() throws  IOException{
        Gson gson = new Gson();
        Reader reader = Files.newBufferedReader(Paths.get("data1.json"));
        Account account = gson.fromJson(reader,Account.class);
        System.out.println(account);
        reader.close();


    }
}
