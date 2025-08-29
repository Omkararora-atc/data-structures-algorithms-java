public class Reverse_Number {
    public int reverse(int n){
        int rev=0;
        while (n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n/=10;
        }
        return rev;
    }
    public static void main(String[] args){
        Reverse_Number obj1=new Reverse_Number();
        int n=12345;
        System.out.println("Reverse of "+n+" is: "+obj1.reverse(n));
    }
}
