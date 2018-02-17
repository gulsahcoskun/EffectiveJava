package creatingAndDestroyingObjects;

/**
 * Created by GulsahCoskun on 17.02.2018.
 */
public class Main {

    public static void main(String[] args) {

        //Static Factories
        StaticFactorySample employee = StaticFactorySample.newEmployee();
        StaticFactorySample employer = StaticFactorySample.newEmployer();
        StaticFactorySample employer2 = StaticFactorySample.newEmployer();
        System.out.println(employer.equals(employer2));


    }

}
