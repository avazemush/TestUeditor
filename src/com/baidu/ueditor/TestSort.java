package com.baidu.ueditor;
/**
 * @author jwS
 *
 */
public class TestSort {
	    public static void insertSort(int[] a) {  
	        for (int i = 1; i < a.length; i++) {  
	            int key = a[i];  
	            int j = i - 1;  
	            while (j >= 0 && a[j] > key) {  
	                a[j+1] = a[j];  
	                j--;  
	            }  
	            a[j+1] = key;  
	        }  
	    }  
	      
	    public static void main(String[] args) {  
	        int a[] = { 5, 2, 45, 7, 2, 4, 2, 45, 7, 2, 4, 2, 45, 7, 2, 4, 23, 7,  
	                2, 3, 0, 43, 23, 12, 4, 1, 15, 7, 3, 8, 31 };  
	        insertSort(a);  
	        for (int i = 0; i < a.length; i++) {  
	            System.out.print(a[i] + " ");  
	        }  
	    }  
}
