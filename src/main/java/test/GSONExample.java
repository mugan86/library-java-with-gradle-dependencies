package test;

import com.google.gson.Gson;
import models.Person;

/**********************************************************************************
 * Created by anartzmugika on 28/11/16.
 *********************************************************************************/
public class GSONExample {

    public String getReturnObjectPersonToJSON(Person person)
    {
        if (person == null) person = new Person("Anartz", "Mugika");
        return new Gson().toJson(person);
    }

    public Person getReturnPersonFromJSON(String json_)
    {
        if (json_.equals(""))
        {
            final String json = "{\"name\":\"Anartz\",\"lastname\":\"Mugika\"}";
            return new Gson().fromJson(json, Person.class);

        }
        return new Gson().fromJson(json_, Person.class);
    }
}
