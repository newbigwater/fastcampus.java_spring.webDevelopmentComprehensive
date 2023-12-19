public class Member {
    public String   name;
    public int      age;
    public String   phonNumber;
    public String   emailAddress;
    public String   address;
    public float    weight;

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phonNumber='" + phonNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", address='" + address + '\'' +
                ", weight=" + weight + "kg" +
                '}';
    }
}