package BTVN_Java.T2108A;

import java.util.List;
import java.util.Scanner;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import BTVN_Java.T2108A.controller.NetflixController;
import BTVN_Java.T2108A.model.Netflix1;
import BTVN_Java.T2108A.repository.NetflixRepository;




public class Application {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        NetflixRepository netflixRepository = new NetflixRepository();
        NetflixController netflixController = new NetflixController();

        netflixRepository.getData();
        System.out.println("====================================================================");
        List<Netflix1> netflixList = netflixRepository.netflixList;

        while(true){
            menu();
            int ch = sc.nextInt();
            sc.nextLine();
            switch (ch){
                case 1://sap xep film
                    Collections.sort(netflixList, new Comparator<Netflix1>() {
                       @Override
                       public int compare(Netflix1 o1, Netflix1 o2){
                            return o1.gettitle().compareTo(o2.gettitle());
                       } 

                    });
                    printList(netflixList);

                    break;
                case 2://tim film
                    System.out.println("Nhập tên phim cần  tìm:");
                    String name = sc.nextLine();
                    System.out.println("Danh sách phim"  + name +" :");    
                    netflixController.searchByName(netflixList, name);//trả  về kết  quả  tìm kiếm trên model
                    break;
                case 3:
                    System.out.println("Nhập tên loại phim cần  tìm:");
                    String genres = sc.nextLine();
                    System.out.println("Danh mục phim"  + genres +" :");    
                    netflixController.searchByCategory(netflixList, genres);
                    break;
                case 4:
                    System.out.println("Nhập ngôn ngữ phim cần  tìm:");
                    String language = sc.nextLine();
                    System.out.println("Danh sách phim"  + language +" :");    
                    netflixController.searchByLangguage(netflixList, language);
                    break;
                case 5:
                    netflixController.getAllMovieCategory(netflixList);
                    break;
                case 6:
                    System.exit(1);
                    break;
                default:break;
                
            }
        }

    }

    public static void printList(List<Netflix1>List) {
        for (Netflix1 netflix: List){
            System.out.println(netflix);
        }

    }

    public static void menu(){
        System.out.println("các tùy chọn của  bạn với film trên Netflix");
        System.out.println("1. Sắp xếp têm phim");
        System.out.println("2. Tìm film theo tên");
        System.out.println("3. tìm film theo thể loại");
        System.out.println("4. Tìm theo ngôn ngữ");
        System.out.println("5. Liệt kê các bộ film theo thể loại");
        System.out.println("6. Kết thúc chương trình");
    }
}
