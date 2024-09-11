import digvijay.PilotPen;

public class PenAdaptor implements Pen{

    private PilotPen pilotPen=new PilotPen();
    @Override
    public void write(String str) {
        pilotPen.mark(str);

    }
}
