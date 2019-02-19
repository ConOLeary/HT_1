// -------------------------------------------------------------------------

/**
 *  This class contains static methods that implementing sorting of an array of numbers
 *  using different sort algorithms.
 *
 *  @author
 *  @version HT 2019
 */

 class SortComparison {

    /**
     * Sorts an array of doubles using InsertionSort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order.
     *
     */
    static double [] insertionSort (double a[]){
    	   int i, key, j; 
    	   for (i = 1; i < a.length; i++) 
    	   { 
    	       key = arr[i]; 
    	       j = i-1; 
    	       while (j >= 0 && arr[j] > key) 
    	       { 
    	           arr[j+1] = arr[j]; 
    	           j = j-1; 
    	       } 
    	       arr[j+1] = key; 
    	   }
    }//end insertionsort

    /**
     * Sorts an array of doubles using Quick Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    static double [] quickSort (double a[])
    	partition(a, 0, a.lenght - 1);
    	int partition(double arr[], int low, int high) 
        { 
            int pivot = arr[high];  
            int i = (low-1); 
            for (int j=low; j<high; j++) 
            { 
                if (arr[j] <= pivot) 
                { 
                    i++; 
                    int temp = arr[i]; 
                    arr[i] = arr[j]; 
                    arr[j] = temp; 
                } 
            } 
            int temp = arr[i+1]; 
            arr[i+1] = arr[high]; 
            arr[high] = temp; 
      
            return i+1; 
        } 
        void sort(int arr[], int low, int high) 
        { 
            if (low < high) 
            { 
                int pi = partition(arr, low, high); 
                sort(arr, low, pi-1); 
                sort(arr, pi+1, high); 
            } 
        }
        return a;
    }//end quicksort

    /**
     * Sorts an array of doubles using Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    /**
     * Sorts an array of doubles using iterative implementation of Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     *
     * @param a: An unsorted array of doubles.
     * @return after the method returns, the array must be in ascending sorted order.
     */

    static double[] mergeSortIterative (double a[]) {
        int n = a.length;
        int curr_size;  
        int left_start; 
        for (curr_size = 1; curr_size <= n-1;  
                      curr_size = 2*curr_size) 
        { 
            for (left_start = 0; left_start < n-1; 
                        left_start += 2*curr_size) 
            { 
                int mid = left_start + curr_size - 1; 
          
                int right_end = Math.min(left_start  
                             + 2*curr_size - 1, n-1); 
                merge(arr, left_start, mid, right_end); 
            } 
        }
        return a;
    } 
    static void merge(int arr[], int l, int m, int r) 
    { 
        int i, j, k; 
        int n1 = m - l + 1; 
        int n2 = r - m; 
        int L[] = new int[n1]; 
        int R[] = new int[n2]; 
        for (i = 0; i < n1; i++) 
            L[i] = arr[l + i]; 
        for (j = 0; j < n2; j++) 
            R[j] = arr[m + 1+ j]; 
        i = 0; 
        j = 0; 
        k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        }
    }//end mergesortIterative
    
    
    
    /**
     * Sorts an array of doubles using recursive implementation of Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     *
     * @param a: An unsorted array of doubles.
     * @return after the method returns, the array must be in ascending sorted order.
     */
    static double[] mergeSortRecursive (double a[]) {
    	int n = a.length;
        int curr_size;  
        int left_start; 
        for (curr_size = 1; curr_size <= n-1;  
                      curr_size = 2*curr_size) 
        { 
            for (left_start = 0; left_start < n-1; 
                        left_start += 2*curr_size) 
            { 
                int mid = left_start + curr_size - 1; 
                int right_end = Math.min(left_start  
                             + 2*curr_size - 1, n-1); 
                merge(arr, left_start, mid, right_end); 
            } 
        }
        return a;
    } 
    static void merge(int arr[], int l, int m, int r) 
    { 
        int i, j, k; 
        int n1 = m - l + 1; 
        int n2 = r - m; 
        int L[] = new int[n1]; 
        int R[] = new int[n2]; 
        for (i = 0; i < n1; i++) 
            L[i] = arr[l + i]; 
        for (j = 0; j < n2; j++) 
            R[j] = arr[m + 1+ j]; 
        i = 0; 
        j = 0; 
        k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
   }//end mergeSortRecursive
    	
    
    /**
     * Sorts an array of doubles using Selection Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    static double [] selectionSort (double a[]){
        int i, j, min_idx; 
        for (i = 0; i < n-1; i++) 
        { 
            min_idx = i; 
            for (j = i+1; j < n; j++) 
              if (arr[j] < arr[min_idx]) 
                min_idx = j; 
            swap(&arr[min_idx], &arr[i]); 
        } 
        return a;
    }
    void swap(int *xp, int *yp) 
    { 
        int temp = *xp; 
        *xp = *yp; 
        *yp = temp; 
    }//end selectionsort

   


    public static void main(String[] args) {

        //todo: do experiments as per assignment instructions
    }

 }//end class
