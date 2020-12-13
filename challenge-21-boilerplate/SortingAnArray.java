public class SortingAnArray{
    public static void main(String[] args){
        int[] arr = {2, 7, 6, 4, 8};
        sort(arr); 
    }

    public static void sort(int[] arr){
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr.length;j++) {
                if(arr[i]<arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int num: arr) {
            System.out.print(num+ " ");
        }
    }
}