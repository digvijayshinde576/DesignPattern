public class FactoryClass {
    public Plan getInstance(String plan){
        if(plan.equalsIgnoreCase(null)){
            return null;
        } else if (plan.equalsIgnoreCase("Commercial")) {
            return new Commercial();

        } else if (plan.equalsIgnoreCase("Domestic")) {
            return new Domestic();

        }else if (plan.equalsIgnoreCase("Institutional")){
            return new Institutional();
        }
        return null;
    }
}
