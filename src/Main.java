
public class Main {
    
    public static void main(String[] args) {
        Car myCar = new Car();
//        //myCar.printAttributes();
//        myCar.changeLicence("efg123");
//        myCar.changWeight(1500.00);
//        double distance = myCar.maxDistance();
//        myCar.printAttributes();
        
        Car audi = new Car ("Audi", 50, 2);
        audi.printAttributes();
//        audi.changeLicence("zcv345");
//        audi.changWeight(1450.00);
//        audi.printAttributes();
        
        
        audi.fuelUp();
        audi.printAttributes();
        audi.travel(20);
        audi.printAttributes();
        audi.travel(30);
        audi.printAttributes();
    }
}
