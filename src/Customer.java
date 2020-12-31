public class Customer extends Person {
    private int stayingDay;
    private int price;
    private String roomType;

    public Customer(  int id,String name,String date, String address, int stayingDay, int price) {
        super(id, name, date, address);
        this.stayingDay = stayingDay;
        this.price = price;

    }

    public int getStayingDay() {
        return stayingDay;
    }

    public void setStayingDay(int stayingDay) {
        this.stayingDay = stayingDay;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
    public int total() {
        return stayingDay*price;
    }

    @Override
    public String toString() {
        return super.toString()+ "stayingDay: "+stayingDay + "," +"roomType: "+ roomType + "," +"price: "+ price;

    }
}
