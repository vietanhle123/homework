package BTVN_Java.T2108A.model;

public class Netflix1 {

    private long id;
    private String title;
    private String category;
    private String actor;
    private String language;
    private String publishingYeas;
    private String publishCompany;
    private int time;

    public Netflix1(long id, String title, String category, String actor, String language, String publishingYeas, String publishCompany, int time){
        this.id = id;
        this.title = title;
        this.category = category;
        this.actor = actor;
        this.language = language;
        this.publishingYeas = publishingYeas;
        this.publishCompany = publishCompany;
        this.time = time;

    }

    public long getid(){
        return id;
    }
    
    public void setid(long id){
        this.id = id;
    }

    public String gettitle(){
        return title;
    }

    public void settitle(String title){
        this.title = title;
    }
    
    public String getcategory(){
        return category;
    }

    public void setcategory(String category){
        this.category = category;
    }

    public String getactor(){
        return actor;
    }

    public void setactor(String actor){
        this.actor = actor;
    }    

    public String getlanguage(){
        return language;
    }

    public void setlanguage(String language){
        this.language = language;
    }

    public String getpublishingYear(){
        return publishingYeas;
    }

    public void setpublishingYear(String publishYear){
        this.publishingYeas = publishYear;
    }

    public String getpublishCompany(){
        return publishCompany;
    }

    public void setpublishCompany(String publishCompany){
        this.publishCompany = publishCompany;
    }

    public int gettime(){
        return time;
    }

    public void settime(int time){
        this.time = time;
    }

    @Override
    public String toString(){
        return id + " - " + title + " - " + time;
    }
}
