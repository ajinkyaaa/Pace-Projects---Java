
public class Main {
    public static void main(String a[]){
        
        MyQuickSort sorter = new MyQuickSort();
        int[] input = {24,2,45,20,56,75,2,56,99,53,12};
        sorter.QuickSort(input,0,input.length - 2);
        for(int i:input){
            System.out.print(i);
            System.out.print(" ");
        }
    }
}
