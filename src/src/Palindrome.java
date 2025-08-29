public class Palindrome {
    public boolean palindrome(int n)
    {
        int rev=0;
        int copy=n;
        while (n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n/=10;
        }
        return rev==copy;
    }
    public static void main(String[] args){
        Palindrome obj1=new Palindrome();
        int n=12321;
        if (obj1.palindrome(n)){
            System.out.println(n+" is a palindrome");
        }
        else {
            System.out.println(n+" is not a palindrome");
        }
    }
}
