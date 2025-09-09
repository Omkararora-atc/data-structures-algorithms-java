import java.util.*;

public class merge_sort {
    public int[] solution(int[] nums){
        int n=nums.length;
        helper(nums,0,n-1);
        return nums;
    }
    public void helper(int []nums,int low,int high){
        if (low<high){
            int mid=(low+high)/2;
            helper(nums,low,mid);
            helper(nums,mid+1,high);
            merge(nums,low,mid,high);
        }
    }
    public void merge(int []nums,int low,int mid,int high){
        ArrayList<Integer> temp=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while (left<=mid && right<=high){
            if (nums[left]<=nums[right]){
                temp.add(nums[left]);
                left++;
            }
            else{
                temp.add(nums[right]);
                right++;
            }
        }
        while (left<=mid){
            temp.add(nums[left]);
            left++;
        }
        while (right<=high){
            temp.add(nums[right]);
            right++;
        }
        for (int i=low;i<=high;i++){
            nums[i]=temp.get(i-low);
        }

    }
    public static void main(String[] args) {
        merge_sort sorter = new merge_sort();
        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Original array: " + Arrays.toString(arr));
        sorter.solution(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
