package encapsulation;

public class Person {
    private String username;
    private String sin;

    public Person(String username, String sin) {
        this.username = username;
        this.sin = sin;
    }

    public String getUsername() {
        return username;
    }

    public String generateId() {
        return sin + "!!" + username + "%%";
    }

    public boolean isSamePerson(Person other) {
        return this.generateId().equals(other.generateId());
    }

}
