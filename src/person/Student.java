
package person;


public class Student extends Person {
    
    private String indexNumber;
    private int year;
    
    public Student(String name, String surname, String jmbg) {
        super(name, surname, jmbg);
    }
    
    public Student(String name, String surname, String jmbg, String indexNumber, int year) {
        super(name, surname, jmbg);
        this.indexNumber = indexNumber;
        this.year = year;
    }
    
    public String getIndexNumber() {
        return this.indexNumber;
    }
    
    public void setIndexNumber(String newIndexNumber) {
        this.indexNumber = newIndexNumber;
    }
    
    public int getYear() {
        return this.year;
    }
    
    public void setYear(int newYear) {
        this.year = newYear;
    }
    
    
    @Override
    public void showData() {
        super.showData();
        System.out.println("Student's index number: " + getIndexNumber());
        System.out.println("Student's study year: " + getYear());
        System.out.println();
    }
}
