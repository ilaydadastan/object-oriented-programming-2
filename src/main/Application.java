package main;

public class Application {
    String name;
    int id;

    public String applying(String firstName){

        return firstName + " applied to " + this.name;
    }

    public Application (String name){
        this.name=name;
        System.out.println("Application is done");

    }

    public Application (){
        System.out.println("Application is done");

    }
}
