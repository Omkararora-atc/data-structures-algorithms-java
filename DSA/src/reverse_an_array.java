public class reverse_an_array {
    public int[] reverse(int[] nums){
        int n=nums.length;
        int start=0;
        int end=n-1;
        while (start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
        return nums;
    }
    public static void main(String[] args) {
        reverse_an_array obj=new reverse_an_array();
        int [] arr={1,2,3,4,5,6,7,8,9};
        int [] reversedArr=obj.reverse(arr);
        System.out.print("Reversed array: ");
        for (int j : reversedArr) {
            System.out.print(j + " ");
        }
    }
}
