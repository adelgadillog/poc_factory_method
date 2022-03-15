package dto;

public class PayloadVersionTwoDTO extends PayloadVersionOneDTO{
    public PayloadVersionTwoDTO(String name, String lastName, String email,String address, String neighboorhood) {
        super(name,lastName,email);
        this.address = address;
        this.neighboorhood = neighboorhood;
    }

    private String address;
    private String neighboorhood;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNeighboorhood() {
        return neighboorhood;
    }

    public void setNeighboorhood(String neighboorhood) {
        this.neighboorhood = neighboorhood;
    }

    @Override
    public String toString(){

        return "Version dos " + this.getName() + this.getLastName() + this.getEmail() + this.address + this.neighboorhood;
    }
}
