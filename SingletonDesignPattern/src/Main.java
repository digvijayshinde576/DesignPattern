import javax.management.ReflectionException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


/*Singleton Designe Pattern

created By 1)Eagrly
           2)Lazily

Singleton Break By 1)Reflection
                   2)Serialization And Deserilaization
                   3)Cloning
                   4)Class Loader Manipulation */


class SingletonEager {
    private static SingletonEager singletonEager = new SingletonEager();

    private SingletonEager() {
    }

    public  static SingletonEager getInstance(){
        return singletonEager;
    }
}


class SingletonLazy{
    private static SingletonLazy singletonLazy;

    private SingletonLazy(){

    }

    //This method synchronises all method so one thread at atime can access this method results low efficiency
//    public static  synchronized SingletonLazy getSingletonLazy() {
//       if (singletonLazy==null){
//           return  singletonLazy=new SingletonLazy();
//       }
//       return singletonLazy;
//
//    }


//So use this synchronise block only instasnce is null that time only synchronise will call other time it will
    //work normal which improves performance
    public static SingletonLazy getSingletonLazy(){
        if(singletonLazy==null){
            synchronized (SingletonLazy.class){
                if(singletonLazy==null){
                    return singletonLazy=new SingletonLazy();
                }
            }
        }
        return  singletonLazy;
    }
}
public class Main {
    public static void main(String[] args) throws Exception {

    //Created Singleton Object Eagrly
        SingletonEager instance = SingletonEager.getInstance();
        SingletonEager instance1 = SingletonEager.getInstance();
        //System.out.println(instance1==instance);


    //Breaking Singleton Object Using Reflection
        Constructor<SingletonEager> constructor=SingletonEager.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonEager copy = constructor.newInstance();
        //System.out.println(copy==instance);

    //Created Singleton Object Lazily
        SingletonLazy instanceLazy=SingletonLazy.getSingletonLazy();
        SingletonLazy instanceLazy1=SingletonLazy.getSingletonLazy();
        //System.out.println(instanceLazy==instanceLazy1);

    //Breaking Singleton Object
        Constructor<SingletonLazy> constructor1=SingletonLazy.class.getDeclaredConstructor();
        constructor1.setAccessible(true);
        SingletonLazy copyLazy = constructor1.newInstance();
        //System.out.println(copyLazy==instanceLazy);


        Singleton singletonClone = Singleton.getSingleton();
        Singleton singletonClone1 = Singleton.getSingleton();
        System.out.println(singletonClone1==singletonClone);

        Singleton cloned = (Singleton) singletonClone.clone();//Cloned Method returns Object typeCast to Singleton
        System.out.println(singletonClone==cloned);


    }
    }
