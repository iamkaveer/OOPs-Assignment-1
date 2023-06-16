import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String[] args) {
       int[] arr={4,1,-2,-1,1};
       int target=0;
       Map<Integer, Integer> map_ = new HashMap<>();//to store arr ele and it's index
        for (int i = 0; i <arr.length; i++)
        {
            if(map_.containsKey(target - arr[i]))
            {
               System.out.print(arr[map_.get(target - arr[i])]+ "," + arr[i]);
                return;
            }
            map_.put(arr[i], i);
        }
        System.out.print("No element found");
    }
}

//TC = O(n), where n is the size of array
//SC = O(n), as we have created one HashMap
