package creatingAndDestroyingObjects;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by GulsahCoskun on 17.02.2018.
 */
public class Main {

    public static void main(String[] args) {

        //Static Factories
        System.out.println("STATIC FACTORIES");
        StaticFactorySample employee = StaticFactorySample.newEmployee();
        StaticFactorySample employer = StaticFactorySample.newEmployer();
        StaticFactorySample employer2 = StaticFactorySample.newEmployer();
        System.out.println(employer.equals(employer2));
        System.out.println("-------------------");


        //Builder Pattern
        System.out.println("BUILDER PATTERN");
        BuilderSample person = new BuilderSample.Builder("Gülşah",1323).age(24).title("Uzman").build();
        System.out.println(person.toString());
        System.out.println("-------------------");


        //Singleton
        System.out.println("SINGLETON");
        SingletonSample singletonSample = SingletonSample.getInstance();
        SingletonSample singletonSample1 = SingletonSample.getInstance();
        System.out.println(singletonSample.equals(singletonSample1));
        System.out.println("-------------------");

        //Avoid creating objects
        System.out.println("AVOID CREATING OBJECTS");
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        Date graduateDate = null;
        try {
            graduateDate = format.parse("18-06-2014");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        AvoidCreatingObjects avoidCreatingObjects = new AvoidCreatingObjects(graduateDate);
        System.out.println(avoidCreatingObjects.isNewGraduated());
        System.out.println("-------------------");

    }

}
