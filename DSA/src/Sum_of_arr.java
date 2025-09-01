public class Sum_of_arr {
    public void sum(int[] arr){
        int sum = 0;
        for (int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Sum of array elements: " + sum);
    }
    public static void main(String[] args) {
        Sum_of_arr obj = new Sum_of_arr();
        int[] arr = {1, 2, 3, 4, 5};
        obj.sum(arr);
    }
}
