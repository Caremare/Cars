
package person;

public class Person {
    
    private String name;
    private String surname;
    private String jmbg;
    
    
    public Person() {
        this.name = "Ime";
        this.surname = "Prezime";
        this.jmbg = "1232453656546";
    }
    
    public Person(String name, String surname, String jmbg) {
        this.name = name;
        this.surname = surname;
        this.jmbg = jmbg;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String newName) {
        this.name = newName;
    }
    
    public String getSurname() {
        return this.surname;
    }
    
    public void setSurname(String newSurname) {
        this.surname = newSurname;
    }
    
    public String getJmbg() {
        return this.jmbg;
    }
    
    public void setJmbg(String newJmbg) {
        this.name = newJmbg;
    }
    
    public void showData() {
        System.out.println("Person name is " + getName());
        System.out.println("Person surname is " + getSurname());
        System.out.println("Person jmbg is " + getJmbg());
    }
    
}
