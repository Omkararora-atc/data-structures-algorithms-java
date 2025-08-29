
public class Count_Digit {
    public int count(int n) {
        int count=0;
        while (n>0){
            n/=10;
            count++;
        }
        return count;
    }
    public static void main(String[] args){
        Count_Digit obj1=new Count_Digit();
        int n=12345;
        System.out.println("Number of digits in "+n+" is: "+obj1.count(n));
    }
}

