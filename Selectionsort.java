import java.util.*;

class Selectionsort{
    
    static void SelectionSort(int arr[],int n){
        
        for(int i=0;i<=n-2;i++){
            int mini=i;
            
            for(int j=i;j<=n-1;j++){
                if(arr[j]<arr[mini]){
                    mini=j;
                }
            }
            int temp = arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;
        }
    }
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        SelectionSort(arr,n);
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j] +" ");
        }
    }
}