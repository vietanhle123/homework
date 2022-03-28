package BTVN_Java.T2108A.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import BTVN_Java.T2108A.model.Netflix1;
import BTVN_Java.T2108A.repository.NetflixRepository;
import BTVN_Java.T2108A.Application;

public class NetflixController {
    
    NetflixRepository netflixRepository = new NetflixRepository();

    //tim kiem theo ten film
    public void searchByName(List<Netflix1>List, String name){
        for(int i = 0; i < List.size(); i++){
            if(List.get(1).gettitle().contains(name)){
                System.out.println(List.get(i));
            }
        }
    }

   /* public static void arrayListVsList(){
        List<netflix> netflixList =  new ArrayList<>();//list objects

        ArrayList<netflix> netflixes = new ArrayList<>();


   }*/

   public void searchByCategory(List<Netflix1>list,String category){

    for (int i = 0; i< list.size(); i++){
        if( list.get(i).getcategory().contains(category)){
            System.out.println(list.get(i));
        }
    }

   }

   public void searchByLangguage(List<Netflix1>list,String language){

    for (int i = 0; i< list.size(); i++){
        if( list.get(i).getlanguage().contains(language)){
            System.out.println(list.get(i));
        }
    }
   }

   public void getAllMovieCategory(List<Netflix1>list){

       Map<String, Integer> countMovieByCategory = new HashMap<>();

       for (int  i = 0; i< list.size(); i++){
        String category = list.get(i).getcategory();
        String arrayCategory[] = category.split("/");// tach chuoi : hai/khoa hoc/gia  dinh

            for(int j = 0 ; j< arrayCategory.length; j++){
                Integer countMovie = countMovieByCategory.get(arrayCategory[j]);
                if(countMovie == null){
                    countMovieByCategory.put(arrayCategory[j],1);

                }else {
                    countMovieByCategory.put(arrayCategory[j], countMovie);
                }

            }

            for(Map<String, Integer> entry : countMovieByCategory.entrySet()){

                System.out.printf("%s : %d \n",entry.getKey(),entry.getValue());
            }

       }
       
   }

}
