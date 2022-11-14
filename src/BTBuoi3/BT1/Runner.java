package BTBuoi3.BT1;

public class Runner {
    public static void main(String[] args) {
      Person person=new Person();
      person.setName("Hoang");
      person.setDesignation("CCP");
        System.out.println(person);

        Programmer prs=new Programmer();
        prs.setName("Nhung");
        prs.setDesignation("PCC");
        prs.setCompanyName("HoangTVN");
        System.out.println(prs);
    }


}
