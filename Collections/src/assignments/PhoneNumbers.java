package assignments;
import java.lang.*;
import java.util.*;
class PhoneNumbers
{
    Long number;
    PhoneNumbers(Long Number)
    {
        this.number=Number;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    //override
    public String toString() {
        return "PhoneNumbers{" +
                "number=" + number +
                '}';
    }
}
