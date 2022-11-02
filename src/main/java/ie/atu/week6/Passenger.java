package ie.atu.week6;

public class Passenger {
    private String Title;
    private String Name;
    private long id;
    private long phoneNo;
    private int age;

    public Passenger(String title, String name, long id, long phoneNo, int age) {
        setTitle(title);
        this.Name = name;
        this.id = id;
        this.phoneNo = phoneNo;
        this.age = age;
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
    public String getTitle() {
        return Title;
    }

    public String getName() {
        return Name;
    }
}
