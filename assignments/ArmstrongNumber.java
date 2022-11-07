package assignments;

public class ArmstrongNumber {
    public static void main(String args[]){
        int number=153,remainder,result=0,OrginalNumber;
        OrginalNumber=number;
        while (OrginalNumber !=0) {
            remainder = OrginalNumber % 10;
            result = (int) (result + Math.pow(remainder, 3));
            OrginalNumber = OrginalNumber / 10;
        }
        if(result == number){
            System.out.println(result + " Is a armstrong number");
        }else{
            System.out.println(result + " Is not a armstrong number");
        }

    }
}
