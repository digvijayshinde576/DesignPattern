public class Singleton implements Cloneable{
    private static Singleton singleton;

    private Singleton(){

    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    return singleton = new Singleton();
                }
            }
        }

    return singleton;
    }

  //  Clone method overided from Object Class returns Object
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
