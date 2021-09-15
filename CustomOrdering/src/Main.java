import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class Main 
{
    private List<Person> people;

    public static void main(String[] args)
    {
        Main main = new Main();
        main.go();
    }

    public void buildPeople()
    {
        Person tony = new Person("Tony", 40);
        Person steve = new Person("Steve", 24);
        Person jake = new Person("Jake", 30);
        Person bill = new Person("Bill", 15);

        people = new ArrayList<Person>();
        people.add(tony);
        people.add(steve);
        people.add(jake);
        people.add(bill);
    }

    public void go()
    {
        /* Expected output:
         *
         * [Tony (40), Steve (24), Jake (30), Bill (15)]
         * [Tony (40), Jake (30), Steve (24), Bill (15)]
         * [Tony (40), Steve (24), Jake (30), Bill (15)]
         * [Tony (40), Jake (30), Steve (24), Bill (15)]
         */
        buildPeople();
        System.out.println(people);
        sortByAgeWithAnonymousClass();
        System.out.println(people);

        buildPeople();
        System.out.println(people);
        sortByAgeWithLambda();
        System.out.println(people);
    }

    public void sortByAgeWithAnonymousClass()
    {
        Collections.sort(people,
            new Comparator<Person>()
            {
                @Override
                public int compare(Person personA, Person personB)
                {
                    if(personA.getAge() > personB.getAge())
                        return -1;
                    else if(personA.getAge() < personB.getAge())
                        return 1;
                    else
                        return 0;
                }
            }
        );
    }

    public void sortByAgeWithLambda()
    {
        Collections.sort(people,
            (Person personA, Person personB) ->
            {
                if(personA.getAge() > personB.getAge())
                    return -1;
                else if(personA.getAge() < personB.getAge())
                    return 1;
                else
                    return 0;
            }
        );
    }
}