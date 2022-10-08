package main;

public class Main {
    public static void main(String[] args) {

        JobSeeker ilayda = new JobSeeker("ilayda", "dastan");

        Application javaEngineer = new Application("java engineer");
    System.out.println(javaEngineer.applying(ilayda));


    Application softwareEngineer = new Application();
    softwareEngineer.name= "Software Engineer";
    System.out.println(softwareEngineer.applying(new JobSeeker("ahmet", "can")));




    }
}
