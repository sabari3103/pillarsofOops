// this program is object creation based
public class Oops {
    String color;
    String model;
    
    void drive(){
        System.out,println("the car is driving");
 
    }
     void stop(){
        System.out,println("the car is stoped");
   
    }
    public static void main(String[] args){
        Oops obj = new Oops();
        obj.color = "red";
        obj.model = "tata";
       

        obj.drive();
        obj.stop();
       

        System.out.println("car model is" +obj.model);
        System.out.println("car color is" + obj.color);
    }
        
    
}
