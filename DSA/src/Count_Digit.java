public class Count_Digit {
    public void count(int n){
        int count = 0;
        while(n>0){
            n = n/10;
            count++;
        }
        System.out.println("Number of digits: " + count);
    }
    public static void main(String[] args) {
        Count_Digit obj = new Count_Digit();
        obj.count(12345);
    }
}
