package models;

/***********************************
 * Created by anartzmugika on 28/11/16.
 */
public class Person {

    public Person(String name, String lastname)
    {
        setName(name);
        setLastname(lastname);
    }
    private String name;

    private String lastname;

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
