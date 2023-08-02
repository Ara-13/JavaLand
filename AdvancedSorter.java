import java.util.ArrayList;

public class AdvancedSorter {
    public static void main(String[] args){
        ArrayList<Integer> myArr = new ArrayList<>();
        for(int i=0; i<=10; i++){
            int myNum = (int)(Math.random()*100);
            myArr.add(myNum);
        }
        ArrayList<Integer> mySortedArr = sortArr(myArr);
        System.out.println("Random Arr: " + myArr);
        System.out.println("Sorted Arr: " + mySortedArr);
    }
    public static ArrayList<Integer> sortArr(ArrayList<Integer> arr){
        if (arr.size() < 2){
            return arr;
        }else{
            int selectedNum = arr.get(0);
            ArrayList<Integer> selectedArr = new ArrayList<>();
            selectedArr.add(selectedNum);
            ArrayList<Integer> lowers = new ArrayList<>();
            ArrayList<Integer> highers = new ArrayList<>();
            for (int num:
                    arr) {
                if(selectedNum < num){
                    highers.add(num);
                }else if(selectedNum > num){
                    lowers.add(num);
                }
            }
            return add(sortArr(lowers), add(selectedArr, sortArr(highers)));
        }
    }
    public static ArrayList<Integer> add(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
        arr1.addAll(arr2);
        return arr1;
    }
}