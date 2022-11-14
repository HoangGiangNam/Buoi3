package BTBuoi3.BT1;

public class Person {
    private String name;
    private String designation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void learn(){

    }
    public void walk(){

    }
    public void eat(){

    }

    @Override
    public String toString() {
        return name+" "+designation;
    }
}
