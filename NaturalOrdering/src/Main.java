import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main
{
    private List<Person> people;

    public static void main(String[] args)
    {
        Main main = new Main();
        main.testPerson();
        main.testPersonSorting();
    }

    private void testPerson()
    {
        /**
         * Expected output:
         *
         * Bill
         * 22
         * Bill (22)
         * Bill (23)
         * William (55)
         */

        Person bill = new Person("Bill", 22);
        System.out.println(bill.getName());
        System.out.println(bill.getAge());
        System.out.println(bill);

        bill.getOlder();
        System.out.println(bill);

        bill.setName("William");
        bill.setAge(55);
        System.out.println(bill);
    }

    private void testPersonSorting()
    {
        /**
         * Expected output:
         * [Bill (15), Jake (30), Steve (24), Tony (40)]
         */

        Person tony = new Person("Tony", 40);
        Person steve = new Person("Steve", 24);
        Person jake = new Person("Jake", 30);
        Person bill = new Person("Bill", 15);

        List<Person> people = new ArrayList<Person>();
        people.add(tony);
        people.add(steve);
        people.add(jake);
        people.add(bill);

        Collections.sort(people);
        System.out.println(people);
    }
}