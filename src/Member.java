public class Member {

    // DEclaring variables to be used in the Member Class
    private String name, ID;
    private int PhNo, age, status, fine;

    // Class constructor
    public Member(String name, String ID, int PhNo, int age){
        this.name = name;
        this.ID = ID;
        this.PhNo = PhNo;
        this.age = age;
        this.status = 1;
        this.fine = 0;
    }

}
