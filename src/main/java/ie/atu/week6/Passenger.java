package ie.atu.week6;

public class Passenger {

    private String Title;
    private String Name;
    private long id;
    private long phoneNo;
    private int age;

    public Passenger(String title, String name, long id, long phoneNo, int age) {
        this.Title = title;
        this.Name = name;
        this.id = id;
        this.phoneNo = phoneNo;
        this.age = age;
    }

    public void setTitle(String title) {
        /*
        if(title.equals("Mr") || title.equals("Mrs") || title.equals("Miss")) {
            Title = title;
        }
        else {
            printf("Invalid entry");
        }

         */
        Title = title;
    }
    public String getTitle() {
        return Title;
    }
}
