package assignments;
public class Search {
    public static void main(String[] args){
        int arr[]={5,12,14,6,78,19,123,26,35,37,7,52,86,47};
        Boolean flag=false;
        int findnum=19;
        for(int n:arr){
            if(n==findnum){
                flag=true;
                break;
            }
        }
        if (flag){
            System.out.println("Found a number");
        }
        else{
            System.out.println("Not found");
        }
    }
}
