
public class Car {

    String model;
    int maxSpeed;
    int minSpeed;
    double weight;

    String licence;
    int maxFuel;
    int currentFuel;
    int consumption; //consumption per distance unit (km)
    int mileage = 0;
    
    int maxPassengers;
    int currentPassengers;

    public Car() {
        this.model = "default";
        this.maxFuel = 100;
        this.consumption = 5;
        this.mileage = 1000;
        this.maxPassengers = 5;
        this.currentPassengers = 1;
    }

    public Car(String customModel, int customMaxFuel, int customConsumption) {
        this.model = customModel;
        this.maxFuel = customMaxFuel;
        this.consumption = customConsumption;
    }
    
    public Car(String customModel, int customMaxFuel, int customConsumption, int maxPass, int currPass) {
        this.model = customModel;
        this.maxFuel = customMaxFuel;
        this.consumption = customConsumption;
        this.currentPassengers = currPass;
        this.maxPassengers = maxPass;
    }

    public void printAttributes() {
        System.out.println("Model: " + this.model);
        System.out.println("Kapacitet rezervoara: " + this.maxFuel);
        System.out.println("Potrosnja: " + this.consumption);
        System.out.println("Registracija: " + this.licence);
        System.out.println("Trenutno stanje rezervoara: " + this.currentFuel);
        System.out.println("Tezina: " + this.weight);
        System.out.println("Ukupna predjena distanca: " + this.mileage);
        System.out.println("Trenutni broj putnika je " + this.currentPassengers + " od maksimalnih " + this.maxPassengers);
        System.out.println();
    }

    public void changeLicence(String customLicence) {
        this.licence = customLicence;
    }

    public void changWeight(Double newWeight) {
        this.weight = newWeight;
    }

    public double maxDistance() {
        double dist = this.maxFuel / this.consumption;
        return dist;

        //return this.maxFuel/this.consumption;
    }

    public void fuelUp() {
        this.currentFuel = this.maxFuel;
    }

    public void getIn() {
        if (this.currentPassengers < this.maxPassengers) {
            this.currentPassengers ++;
            System.out.println ("Someone got in. Current number of passengers: " + this.currentPassengers);
        } else { 
            System.out.println ("The car is full, there is no space.");
        }
    }
    
    public void getIn(int numberOfPassengers) {
        if (this.currentPassengers <= numberOfPassengers) {
            this.currentPassengers = this.currentPassengers + numberOfPassengers;
            System.out.println ("Someone got in. Current number of passengers: " + this.currentPassengers);
        } else { 
            System.out.println ("There is no space for " + numberOfPassengers + "passengers.\n");
        }
    }
    
    public void getOut() {
        if (this.currentPassengers > 0){
            this.currentPassengers --;
            System.out.println ("Someone got out. Current number of passengers: " + this.currentPassengers);
        } else {
            System.out.println ("There are no more passengers.");
        }
    }
    
    public void getOut(int numberOfPassengers) {
        if (this.currentPassengers >= numberOfPassengers){
            this.currentPassengers = this.currentPassengers - numberOfPassengers;
            System.out.println ("Someone got out. Current number of passengers: " + this.currentPassengers);
        } else {
            System.out.println ("There are no " + numberOfPassengers + "in the car.");
        }
    }
    
    public void travel(int distance) {

        //ako ima dovoljno goriva za put onda putuj (povecaj mileage, smanji trenutno gorivo)
        //ako nema dovoljno goriva onda ispisi poruku da nema dovoljno goriva
        if (this.currentFuel >= distance * this.consumption) {
            this.mileage = this.mileage + distance;
            this.currentFuel = this.currentFuel - distance * this.consumption;
        } else {
            System.out.println("Nema dovoljno goriva za taj put.");
            System.out.println();
        }
    }

}
