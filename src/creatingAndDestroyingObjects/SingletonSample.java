package creatingAndDestroyingObjects;

/**
 * Created by GulsahCoskun on 17.02.2018.
 */
public class SingletonSample {

    private static final SingletonSample SINGLETON_INSTANCE = new SingletonSample();

    private SingletonSample(){}

    public static SingletonSample getInstance(){
        return SINGLETON_INSTANCE;
    }

}
