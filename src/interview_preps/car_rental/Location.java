package interview_preps.car_rental;

public class Location {

    private int buildingNo;
    private String area;
    private String city;
    private String state;
    private String country;
    private int pincode;

    private Location() {

    }

    public Location(int pincode, String country, String state, String city, String area, int buildingNo) {
        this.pincode = pincode;
        this.country = country;
        this.state = state;
        this.city = city;
        this.area = area;
        this.buildingNo = buildingNo;
    }

    public int getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(int buildingNo) {
        this.buildingNo = buildingNo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
}
