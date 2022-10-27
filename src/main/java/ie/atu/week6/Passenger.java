package ie.atu.week6;

public class Passenger {
    private String Title;
    private String Name;
    private int id;
    private int phoneNo;
    private int age;

    public Passenger(String title, String name, int id, int phoneNo, int age) {
        Title = title;
        Name = name;
        this.id = id;
        this.phoneNo = phoneNo;
        this.age = age;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
