public class Largest_Digit {
    public int Largest(int n){
        int largest=0;
        while (n>0){
            int digit=n%10;
            if (digit>largest){
                largest=digit;
            }
            n/=10;
        }
        return largest;
    }
    public static void main(String[] args){
        Largest_Digit obj1=new Largest_Digit();
        int n=3794215;
        System.out.println("Largest digit in "+n+" is: "+obj1.Largest(n));
    }
}
