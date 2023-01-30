// creatinga house class
public class House {
    private String houseNo;
    private String streetName;
    private String city;

    public House(String houseNo, String streetName, String city) {
        this.houseNo = houseNo;
        this.streetName = streetName;
        this.city = city;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getcity() {
        return city;
    }
}