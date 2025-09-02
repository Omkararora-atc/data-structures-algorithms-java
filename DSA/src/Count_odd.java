public class Count_odd {
    public void count(int [] arr){
        if (arr.length==0){
            System.out.println("Array is empty");
            return;
        }
        int count=0;
        for (int value : arr) {
            if(value%2!=0){
                count++;
            }
        }
        System.out.println("Count of odd numbers is: "+count);
    }
    public static void main(String[] args) {
        Count_odd obj=new Count_odd();
        int [] arr={1,2,3,4,5,6,7,8,9};
        obj.count(arr);
    }
}
