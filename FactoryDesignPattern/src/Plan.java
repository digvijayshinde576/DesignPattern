 abstract class Plan {
   int rate;
    public abstract void getPlan();

    public  void calculateBill(){
        System.out.println(100*rate);
    }


}
