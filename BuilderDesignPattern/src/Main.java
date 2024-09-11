/*Builder Design Pattern :
It is Creational Design Pattern
Here we can create object by passing non sequential parameters and also not necessary to
provide all parameters .We create Builder class and through setter and getObject method
we assign this builder object to a main object.
Builder Pattern says that "construct a complex object from simple objects using step-by-step approach*/
public class Main {
    public static void main(String[] args) {

        Phone phone=new PhoneBuilder().setBattery(3000).setCameraSize(48).getPhone();
        System.out.println(phone);

        String str= "Hello";
        String str1=str.concat("World");
       String s= str1.toLowerCase();
        System.out.println(s);
    }
}