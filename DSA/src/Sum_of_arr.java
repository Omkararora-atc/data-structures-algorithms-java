public class Sum_of_arr {
    public void sum(int[] arr){
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty or null");
            return;
        }
        int sum = 0;

        for (int value : arr) {
            sum += value;
        }
        System.out.println("Sum of array elements: " + sum);
    }
    public static void main(String[] args) {
        Sum_of_arr obj = new Sum_of_arr();
        int[] arr = {1, 2, 3, 4, 5};
        obj.sum(arr);
    }
}
