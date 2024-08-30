import java.lang.System;

public class inheritance {
    String name;
    int id;

    void work() {
        System.out.println("name + " is working");
    } }
class Owner extends inheritance {
        String dept;

    void manage() {
    System.out.println(name + "is manage the " + dept + "departmemnt");
    } }

    public static void main(String[] args){
    Owner own = new Owner();
    own.name = "sam";
    own.id = 31;
    own.dept= "production";

    own.work();
    own.manage();
    }
}
