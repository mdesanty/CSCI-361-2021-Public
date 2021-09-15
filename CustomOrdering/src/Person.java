public class Person 
{    
    private String name;
    private int age;

    public Person(String name, int age)
    {
        setName(name);
        setAge(age);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }

    public void getOlder()
    {
        age++;
    }

    @Override
    public String toString()
    {
        return String.format("%s (%s)", getName(), getAge());
    }
}