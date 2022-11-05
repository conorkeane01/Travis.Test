package ie.atu.week6;

public class Passenger {
    private String Title;
    private String Name;
    private long ID;
    private long PhoneNo;
    private int Age;

    public Passenger(String title, String name, long id, long phoneNo, int age) {
        setTitle(title);
        setName(name);
        setID(id);
        setPhoneNo(phoneNo);
        //this.age = age;
    }

    public void setTitle(String title) {

        if(("Mr").equalsIgnoreCase(title) || ("Mrs").equalsIgnoreCase(title) || ("Ms").equalsIgnoreCase(title)) {
            Title = title;
        }
        else {
            throw new IllegalArgumentException("Please enter Mr, Mrs or Ms");
        }

    }

    public void setName(String name) {
        int count = name.length();
        if (count >= 3) {
            Name = name;
        }
        else {
            throw new IllegalArgumentException("Name must be greater than 3 characters long");
        }

    }

    public void setID(long id) {
        if (id >= 10) {
            ID = id;
        }
        else {
            throw new IllegalArgumentException("ID must be greater than 10 characters long");
        }

    }

    public void setPhoneNo(long phoneNo) {
        if (phoneNo >= 7) {
            PhoneNo = phoneNo;
        }
        else {
            throw new IllegalArgumentException("Phone number must be greater than 6 characters long");
        }

    }
    public String getTitle() {
        return Title;
    }

    public String getName() {
        return Name;
    }

    public long getID() {
        return ID;
    }

    public long getPhoneNo() {
        return PhoneNo;
    }
}
