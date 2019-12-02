package collections.friendslist;

public class Driver {
    public static void main(String[] args) {
        User u1 = new User("Rick");
        User u2 = new User("Dan");
        User u3 = new User("Douglas");
        User u4 = new User("Bianca");
        User u5 = new User("Wenda");
        User u6 = new User("Anzu");
        User u7 = new User("Yusuke");
        User u8 = new User("Yuka");
        User u9 = new User("Tae");
        User u10 = new User("Diego");

        if (u10.follow(u9)) {
            System.out.println(u10 + " successfully followed " + u9);
        } else {
            System.out.println(u10 + " is already following " + u9);
        }

        if (u10.follow(u9)) {
            System.out.println("Successfully followed.");
        } else {
            System.out.println("You are already following this user.");
        }



    }
}
