public class Main {
    static void PrintArray(int arr[]){
        int n =arr.length;
        for (int i = 0; i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] ={12,11,13,5,6,7};
        System.out.println("Given Array : ");
        PrintArray(arr);

        MergeSorting MS = new MergeSorting();
        MS.Sorting(arr,0,arr.length-1);

        System.out.println("Sorted Array: ");
        PrintArray(arr);
    }
}
