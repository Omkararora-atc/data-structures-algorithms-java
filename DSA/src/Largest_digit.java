public class Largest_digit {
    public void largest(int n){
        int largest=0;
        while(n>0){
            int digit = n % 10;
            if(digit > largest){
                largest = digit;
            }
            n = n / 10;
        }
        System.out.println("largest Digit : "+largest);
    }
    public static void main(String[] args) {
        Largest_digit obj = new Largest_digit();
        obj.largest(123459425);
    }
}
