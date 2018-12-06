package ua.littlehome.classcraft;

import java.util.ArrayList;

public class Pocket {

    private static int threeToOne;
    private static ArrayList<String> aboutPeople = new ArrayList<String>();

//--------------------------------------------------------------------------------------------------
    public Pocket(){

        aboutPeople.add( Person.getName()) ;
        aboutPeople.add( Person.getSurname() );
        aboutPeople.add( ""+Person.getAge() );

        threeToOne = aboutPeople.size();

    }
//--------------------------------------------------------------------------------------------------
    public static int getSize() { return threeToOne; }

    public static ArrayList<String> getStringList() { return aboutPeople; }

}
