package creatingAndDestroyingObjects;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by GulsahCoskun on 18.02.2018.
 */
public class AvoidCreatingObjects {

    private final Date graduateDate;

    public AvoidCreatingObjects(final Date graduateDate){
        this.graduateDate = graduateDate;
    }

    private static final Date BEGIN_DATE;
    private static final Date END_DATE;

    static{
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR,-2);
        BEGIN_DATE = new Date(calendar.getTimeInMillis());
        END_DATE = new Date();
    }

    public boolean isNewGraduated(){
        return graduateDate.after(BEGIN_DATE) && graduateDate.before(END_DATE);
    }

}
