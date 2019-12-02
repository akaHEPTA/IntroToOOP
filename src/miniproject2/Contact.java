package miniproject2;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class Contact {
    private static final AtomicInteger ID = new AtomicInteger(0);
    private int id;
    private String name;
    private String city;
    private String mobile;
    private String work;
    private String home;

    public Contact(String name, String city, String mobile, String work, String home) {
        this.id = ID.getAndIncrement();
        this.name = name;
        this.city = city;
        this.mobile = mobile;
        this.work = work;
        this.home = home;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getMobile() {
        return mobile;
    }

    public String getWork() {
        return work;
    }

    public String getHome() {
        return home;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) &&
                Objects.equals(mobile, contact.mobile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mobile);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("<" + name + "> (mobile=" + mobile);
        if (!work.isEmpty()) {
            builder.append(", work=").append(work);
        }
        if (!home.isEmpty()) {
            builder.append(", home=").append(home);
        }
        if (!city.isEmpty()) {
            builder.append(", city=").append(city);
        }
        builder.append(")");
        return builder.toString();
    }

}
