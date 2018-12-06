package ua.littlehome.classcraft;

public class Person {

    private static String name;
    private static String surname;
    private static int age;

    //----------------------------------------------------------------------------------------------
    public Person(String myName, String mySurname, int myAge){

    name = myName;
    surname = mySurname;
    age = myAge;

}
    //----------------------------------------------------------------------------------------------
    public static String getName() { return name; }

    public static String getSurname() { return surname; }

    public static int getAge() { return age; }

}
