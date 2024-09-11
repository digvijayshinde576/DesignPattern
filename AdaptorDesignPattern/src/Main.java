//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pen pp=new PenAdaptor();
    AssignmentWok wok=new AssignmentWok();
    wok.setP(pp);
    wok.writeAssignment("I am writting");

    }
}