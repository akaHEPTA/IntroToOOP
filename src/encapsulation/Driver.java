package encapsulation;

public class Driver {
    public static void main(String[] args) {
        Book iBoy = new Book("iBoy", "Diego");
        System.out.println(iBoy.getAuthor());
        System.out.println(iBoy.getTitle());

        iBoy.setBorrowed(true);
        System.out.println(iBoy.isBorrowed());

        Person shochan = new Person("shochan123", "1928375");
        Person kamchan = new Person("kamchan123", "1848134");
        System.out.println(shochan.isSamePerson(kamchan));


    }

}
