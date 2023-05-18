package hw7;

public class Subscriber {
    private int id;
    private String firstName;
    private String lastName;
    private String city;
    private String phoneNumber;
    private int contractNumber;
    private double balance;
    private double cityCallDuration;
    private double interCityCallDuration;
    private double internetTraffic;

    public Subscriber(int id, String firstName, String lastName, String city, String phoneNumber, int contactNumber, double balance, double cityCallDuration, double interCityCallDuration, double internetTraffic) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.contractNumber = contactNumber;
        this.balance = balance;
        this.cityCallDuration = cityCallDuration;
        this.interCityCallDuration = interCityCallDuration;
        this.internetTraffic = internetTraffic;
    }

    public Subscriber(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(int contactNumber) {
        this.contractNumber = contactNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCityCallDuration() {
        return cityCallDuration;
    }

    public void setCityCallDuration(double cityCallDuration) {
        this.cityCallDuration = cityCallDuration;
    }

    public double getInterCityCallDuration() {
        return interCityCallDuration;
    }

    public void setInterCityCallDuration(double interCityCallDuration) {
        this.interCityCallDuration = interCityCallDuration;
    }

    public double getInternetTraffic() {
        return internetTraffic;
    }

    public void setInternetTraffic(double internetTraffic) {
        this.internetTraffic = internetTraffic;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", contractNumber='" + contractNumber + '\'' +
                ", balance=" + balance +
                ", cityCallDuration=" + cityCallDuration +
                ", interCityCallDuration=" + interCityCallDuration +
                ", internetTraffic=" + internetTraffic +
                '}';
    }
}
