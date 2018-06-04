
import loops.Loops;
import person.Person;
import person.Student;


public class Main {
    
    public static void main(String[] args) {
        
//        Car myCar = new Car(); //kreiramo objeat myCar
//        //myCar.printAttributes();
//        myCar.changeLicence("efg123"); //nad objektom myCar pozivamo metodu changeLicence
//        myCar.changWeight(1500.00);
//        double distance = myCar.maxDistance();
//        myCar.printAttributes();
        
//        Car audi = new Car ("Audi", 50, 2);
//        audi.printAttributes();
//        audi.changeLicence("zcv345");
//        audi.changWeight(1450.00);
//        audi.printAttributes();
        
//        Car noviAuto = new Car ("Novi Auto", 100, 3, 4, 1);
//        noviAuto.printAttributes();
//        
//        noviAuto.getIn();
//        noviAuto.getIn();
//        noviAuto.getIn();
//        noviAuto.getIn();
//        noviAuto.getIn();
//        
//        noviAuto.printAttributes();
//        
//        noviAuto.getOut();
//        noviAuto.getOut();
//        noviAuto.getOut();
//        noviAuto.getOut();
//        noviAuto.getOut();
//        noviAuto.getOut();
//        
//        noviAuto.printAttributes();
        
//        audi.fuelUp();
//        audi.printAttributes();
//        audi.travel(20);
//        audi.printAttributes();
//        audi.travel(30);
//        audi.printAttributes();
        
//        noviAuto.getIn(3);
//        noviAuto.getIn(4);        
//        noviAuto.printAttributes();
//        
//        noviAuto.getOut(7);
//        noviAuto.printAttributes();
        
//        int x = 5;
//        while (x>0) {
//            System.out.println(x);
//            x --;
//        }

//        do {
//           System.out.println(x);
//            x --; 
//        } while (x > 0);

//        for (int i = 0; i<10; i++) {
//            System.out.println(i);
//        }
        
//        Loops.testWhileLoop();
//        Loops.testForLoop();
//        Loops.testDoubleForLoop();
//        Loops.printTable();
//        Loops.printMatrix();

        Person osoba = new Person();
        osoba.showData();
        
        osoba.setName("Milomir");
        osoba.setSurname("Dragovic");
        
        osoba.showData();
        
        Student studentPetar = new Student("Petar", "Petrovic", "324324");
        studentPetar.showData();
        
        Student studentMarko = new Student("Marko", "Markovic", "636434", "OAS-123", 2);
        studentMarko.showData();
        
    }
}
