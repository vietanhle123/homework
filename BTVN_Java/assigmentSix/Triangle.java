package BTVN_Java.assigmentSix;

public class Triangle {
    private  int base, height;

    public Triangle(int base, int height){
        this.base = base;
        this.height = height;
    }
    @Override
    public String toString(){
        return "Striangle[base=" + base + ",height=" + height + "]";
    }

    public double getArea(){
        return 0.5 * base * height;
    }
}

