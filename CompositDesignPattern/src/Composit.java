import java.util.ArrayList;
import java.util.List;

public class Composit implements Component{
    String name;

    public Composit(String name) {
        this.name = name;
    }

    List<Component> componentList=new ArrayList<>();

    public void addComponent(Component comp){
        componentList.add(comp);
    }

    @Override
    public void showPrice() {
        System.out.println(name);
        for (Component c:componentList){
            c.showPrice();
        }

    }
}
