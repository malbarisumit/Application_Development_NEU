/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;


public class PersonDirectory {
    private ArrayList<Person> listOfPerson;
    
    public PersonDirectory(){
        listOfPerson = new ArrayList<Person>();
}
    
    public ArrayList<Person> getListOfPerson() {
        return listOfPerson;
    }

    public void setListOfPerson(ArrayList<Person> listOfPerson) {
        this.listOfPerson = listOfPerson;
    }
    
     public Person addPerson()
    {
        Person person=new Person();
        listOfPerson.add(person);
        return person;
    }
    
}
