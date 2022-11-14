package BTBuoi3.BT1;

public class Programmer extends Person
{


    private String companyName;

//    @Override
//    public void setName(String name) {
//        super.setName(name);
//    }
//
//    @Override
//    public String getName() {
//        return super.getName();
//    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void coding(){

    }

    @Override
    public String toString() {
        return getName()+","+getDesignation()+","+companyName;
    }
}
