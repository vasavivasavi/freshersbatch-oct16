package assignments;
import java.lang.*;
import java.util.*;
class Date
{  Integer date;
    Integer Month;
    Integer year;
    public Date(Integer d,Integer Month,Integer year)
    {
        this.date=d;
        this.Month=Month;
        this.year=year;
    }

    @Override
    public String toString() {
        return date+"-"+Month+"-"+year;
    }
}
