public class Count_odd {
    public int count(int n) {
        int count = 0;
        while (n>0){
            int digit = n % 10;
            if (digit % 2 != 0) {
                count++;
            }
            n /= 10;
        }
        return count;
    }
    public static void main(String[] args){
        Count_odd obj1=new Count_odd();
        int n=123456789;
        System.out.println("Number of odd digits in "+n+" is: "+obj1.count(n));
    }
}
