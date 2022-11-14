package BTBuoi3.BT5;

public class Staff extends PerSon {
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return String.format("Staff[Person[name=%s,address=%s],school=%s,pay=%f",getName(),getAddress(),school,pay);

    }
}