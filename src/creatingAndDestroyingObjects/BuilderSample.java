package creatingAndDestroyingObjects;

/**
 * Created by GulsahCoskun on 17.02.2018.
 */
public class BuilderSample {

    private final String name;
    private final int id;
    private final int age;
    private final String department;
    private final String title;
    private final double salary;


    public static class Builder{
        //Required params
        private final String name;
        private final int id;

        //optional params
        private int age=0;
        private String department="";
        private String title="";
        private double salary=0;

        public Builder(String name,int id){
            this.name = name;
            this.id = id;
        }

        public Builder age(int value){
            age = value;
            return this;
        }

        public Builder department(String value){
            department = value;
            return this;
        }

        public Builder title(String value){
            title = value;
            return this;
        }

        public Builder age(double value){
            salary = value;
            return this;
        }

        public BuilderSample build(){
            return new BuilderSample(this);
        }

    }

    public BuilderSample(Builder builder){
        name = builder.name;
        id = builder.id;
        age = builder.age;
        department = builder.department;
        title = builder.title;
        salary = builder.salary;
    }


    @Override
    public String toString() {
        return "BuilderSample{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", title='" + title + '\'' +
                ", salary=" + salary +
                '}';
    }
}
