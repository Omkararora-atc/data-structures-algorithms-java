public class Reverse_Number {
    public void reverse(int n){
        int rev = 0;
        while(n>0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        System.out.println("Reversed number: " + rev);
    }
    public static void main(String[] args) {
        Reverse_Number obj = new Reverse_Number();
        obj.reverse(12345);
    }
}
