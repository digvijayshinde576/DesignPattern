import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Enter Plan Name");
        Scanner sc=new Scanner(System.in);
        String plan = sc.nextLine();

        FactoryClass factoryClass=new FactoryClass();
       Plan plantype= factoryClass.getInstance(plan);

       try {
           plantype.getPlan();
       }
       catch (NullPointerException e){
           System.out.println("exception....."+e.getMessage());
       }

       plantype.calculateBill();



    }
}