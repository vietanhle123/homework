package BTVN_Java.JPII_Lab_docx_thread.Part1;

public class Race {

    public static void main(String[] args){
        RaceCar[] cars = new RaceCar [5];
        cars[0] = new RaceCar(10,"Mario");
        cars[1] = new RaceCar(10,"Songoku");
        cars[2] = new RaceCar(10,"Herman");
        cars[3] = new RaceCar(10,"Doremon");
        cars[4] = new RaceCar(10,"Hoang Phi Hong");

        for(int i = 0; i< 5;i++){
            cars[i].start();
        }
    }
    
}
