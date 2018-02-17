package creatingAndDestroyingObjects;

/**
 * Created by GulsahCoskun on 17.02.2018.
 */
public class StaticFactorySample {

    private Person person;
    private static StaticFactorySample singletonEmployer = new StaticFactorySample(Person.EMPLOYER);

    private StaticFactorySample(Person person){
        this.person = person;
    }

    public static StaticFactorySample newEmployee(){
        return new StaticFactorySample(Person.EMPLOYEE);
    }

    public static StaticFactorySample newEmployer(){
        return singletonEmployer;
    }

    enum Person{
        EMPLOYEE("Employee"),
        EMPLOYER("Employer");

        String value;

        Person(String value){
            this.value = value;
        }
    }
}
