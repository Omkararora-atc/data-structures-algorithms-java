public class Factorial_Loop {
    public void factorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }
    public static void main(String[] args) {
        Factorial_Loop obj = new Factorial_Loop();
        obj.factorial(5);
    }
}
