package oops;
class Pair<k,v > {
    k key;
    v value;
    Pair(k key , v value)
    {
        this.key=key;
        this.value=value;

    }

    public void setkey(k key)
    {
        this.key=key;
    }
    public void setvalue(v value)
    {
        this.value=value;
    }
    public k getkey()
    {
        return key ;
    }
    public v getvalue()
    {
        return value;
    }

}public class Paib {




    public static void main(String[] args)
    {

        Pair <String ,java.util.Date> myobj=new Pair<String , java.util.Date>("Today is",new java.util.Date());

        myobj.setkey("Today is" );
        myobj.setvalue(new java.util.Date());

        System.out.println("key :"+ myobj.getkey());
        System.out.println("value :"+myobj.getvalue());



    }
}