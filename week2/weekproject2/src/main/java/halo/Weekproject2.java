package halo;



public class Weekproject2 {
    private double radius;
    private String color;
    
    public Weekproject2(){
        radius = 1.0;
        color   ="red";
    }
       
    public Weekproject2 (double r) {
        radius = r; 
        color="red";
    }
    public Weekproject2(double z,String a){
        radius = z;
        color=a;
    }
    public double getrad(){
        return radius;
    }
    public String getcolor(){
        return color;
    }
    public double getarea(){
        final double phi = 3.14;
        return radius*radius*phi;
    }
    public double getkeliling(){
        final double phi = 3.14;
        double hasil = 2*radius*phi;
        return hasil;
    }

}   