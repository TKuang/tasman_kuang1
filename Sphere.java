public class Sphere extends ThreeDShape{
    private double radius;
  
    public Sphere(double radius){
        this.radius = radius;
        super(calcVolume(), calcSA());
    }
  
    public double calcVolume(){
        double volume = 4/3 * (Math.PI * radius * radius * radius);
        return round2(volume);
    }
    
    public double calcSA(){
        double area = 4 * Math.PI * radius * radius;
        return round2(area);
    }
}
