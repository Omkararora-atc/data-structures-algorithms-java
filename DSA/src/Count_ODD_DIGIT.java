public class Count_ODD_DIGIT {
    public void countOdd(int n){
        int count = 0;
        while(n>0){
            int digit = n % 10;
            if(digit % 2 != 0){
                count++;
            }
            n = n / 10;
        }
        System.out.println("Number of odd digits: " + count);
    }
    public static void main(String[] args) {
        Count_ODD_DIGIT obj = new Count_ODD_DIGIT();
        obj.countOdd(123456789);
    }
}
