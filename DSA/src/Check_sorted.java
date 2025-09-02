public class Check_sorted {
    public boolean check(int [] arr){
        if (arr.length==0){
            System.out.println("Array is empty");
            return true;
        }
        for (int i=1;i<arr.length-1;i++){
            if(arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Check_sorted obj=new Check_sorted();
        int [] arr={1,2,3,4,5,6,7,8,9};
        System.out.println("Is array sorted: "+obj.check(arr));
    }
}
