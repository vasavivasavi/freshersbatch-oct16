package oops;
class Pairs<k,v > {
    k key;
    v value;
    Pairs(k key , v value)
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

}





public class Pai
{



    public static void main(String[] args)
    {
        Pairs <String, String> myobj= new Pairs<String , String>("1","Vasavi") ;

        myobj.setkey("1");
        myobj.setvalue("Hello");

        System.out.println("key :"+ myobj.getkey());
        System.out.println("value :"+ myobj.getvalue());





    }
}



