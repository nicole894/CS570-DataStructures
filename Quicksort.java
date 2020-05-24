import java.util.Scanner;
import java.util.ArrayList;

public class Quicksort {

    private ArrayList<Integer> arr ;
    private int a_length;

    
    public int pivoting(int low_p, int high_p){
        int pivot  = low_p;
        System.out.println("Element at pivot " + arr.get(pivot));
        low_p = low_p + 1;
        

        while(low_p <= high_p){


            while(low_p <= high_p){
                if (arr.get(pivot) < arr.get(high_p)){
                    high_p --;
                }
                else{
                    break;
                }
            }

            while(low_p < high_p){
                if (arr.get(pivot) >= arr.get(low_p)){
                    low_p ++;
                }
                else{
                    break;
                }
            }
            System.out.println("Low pivot: " + low_p);
            System.out.println("High pivot: " + high_p);
            
            //Swapping for the interations
            int temp = arr.get(high_p);
            arr.set(high_p, arr.get(low_p));
            arr.set(low_p, temp);
            high_p--;
            System.out.println(arr);
            
        }
        
        
        System.out.println("Low pivot for swapping: " + low_p);
        System.out.println("High pivot for swapping: " + high_p);
        int temp1 = arr.get(low_p);
        arr.set(low_p, arr.get(pivot));
        arr.set(pivot, temp1);
        System.out.println(arr);
            
        return low_p;


    }

    
    public void quicksort(int low, int high){
               

        if(low < high){
            int pi = pivoting(low, high);
            System.out.println("Returned low pi: " + pi);
            quicksort(low, pi-1);
            quicksort(pi +1, high);
        
        }
        return;

    }



    public static void main(String[] args){
        System.out.println("Enter the ArrayList to be sorted number. (Space Separated)");
        //Scanner sc = new Scanner(System.in);
        
        Quicksort qs = new Quicksort();
        qs.arr =  new ArrayList<Integer>();
        qs.arr.add(3);
        qs.arr.add(5);
        qs.arr.add(34);
        qs.arr.add(2);
        qs.arr.add(4);
        qs.arr.add(6);
        qs.arr.add(4);
        qs.arr.add(7);
        qs.arr.add(16);
        qs.arr.add(3);
        qs.arr.add(7);
        qs.arr.add(10);
        qs.arr.add(5);
        System.out.print(qs.arr);

        int arr_length = qs.arr.size();
        qs.a_length = qs.arr.size();
        //int pivot = arr.get(0);
        System.out.println(arr_length);
       // System.out.println(pivot);
        qs.quicksort(0, arr_length-1);

    }
    
}