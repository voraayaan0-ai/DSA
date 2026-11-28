class Solution {
    static void merge(int arr[] , int s , int e , int mid){
        int ll = mid - s + 1;
        int rl = e - mid;
        int lr[] = new int[ll];
        int rr[] = new int[rl];
        int k = s;
        for(int i = 0; i < ll; i++){
            lr[i] = arr[k];
            k++;
            
        }
        k = mid + 1;
         for(int j = 0; j < rl; j++){
            rr[j] = arr[k];
            k++;
            
        }
        int i = 0;
        int j = 0;
        k = s;
        while(i < ll && j < rl){
            if(lr[i] < rr[j]){
                arr[k] = lr[i];
                i++;
                k++;
            }
            else{
                arr[k] = rr[j];
                j++;
                k++;
            }
        }
        while( j < rl){
              arr[k] = rr[j];
                j++;
                k++;
        }
        while( i < ll){
             arr[k] = lr[i];
                i++;
                k++;
        }
    }
    public void mergeSort(int arr[], int l, int r) {
        // code here
        //base case 
        int s = l;
        int e = r;
        if( s >= e ){
            return;
        }
        int mid = (s + e)/2;
        mergeSort(arr , s , mid);
        mergeSort(arr , mid + 1 , e);
        merge(arr , s , e , mid);
        
    }
}
