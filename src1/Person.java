public class Person {
    private String name;
    private String date;
    private int id;
    private String address;

    public Person(){};

    public Person(int id, String name, String date, String address) {
        this.name = name;
        this.date = date;
        this.id = id;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name: "+name+","+"id: "+id+","+"address: "+address+","+"date: "+date;
    }
}
