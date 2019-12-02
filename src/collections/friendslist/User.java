package collections.friendslist;

import java.util.*;

// we MUST override hashCode(), equals() methods
// friends -> # of mutual friends, address -> distance
public class User {
    private UUID id;
    private String name;
    private Set<User> followings;
    /* optional */
    private PriorityQueue<User> recommendedUsers;

    public User(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.followings = new HashSet<>();
    }

    public boolean follow(User friend) {
        return followings.add(friend);
    }

    public boolean unfollow(User friend) {
        return followings.remove(friend);
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<User> getFollowings() {
        return followings;
    }

    public int size() {
        return followings.size();
    }

    @Override
    public String toString() {
        return "User{name: " + name + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
