import java.util.regex.Pattern;

/*Composit Design Pattern:
 It is a Structural Design Pattern
        Computer
            /  \
        Pery     cabinet(Composit)
         /\             /\
 Keyb Motr,mouse      cpu mb(Composit)
                           /\
                         ram  hd(Leaf)
        */
public class Main {
    public static void main(String[] args) {

        Component hd=new Leaf(3000,"HDD");
        Component ram=new Leaf(4000,"Ram");
        Component mouse=new Leaf(300,"Mouse");
        Component keyboard=new Leaf(400,"Keyboard");
        Component cpu=new Leaf(7000,"CPU");
        Component monitor=new Leaf(6000,"Monitor");


        Composit pery=new Composit("Phery");
        Composit cabinet=new Composit("Cabinet");
        Composit mb=new Composit("MotherBoard");
        Composit computer=new Composit("Computer");

        mb.addComponent(ram);
        mb.addComponent(hd);
        pery.addComponent(mouse);
        pery.addComponent(keyboard);
        pery.addComponent(monitor);
        cabinet.addComponent(cpu);
        cabinet.addComponent(mb);
        computer.addComponent(pery);
        computer.addComponent(cabinet);

      //  ram.showPrice();
        computer.showPrice();



    }
}