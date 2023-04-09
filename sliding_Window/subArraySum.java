import java.util.*;

public class subArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0 ;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the how many elements to add in a array");
        int k = sc.nextInt();
        sc.close();
        System.out.println(sumOfSubArray(arr, k));
        System.out.println(SubArraySum(arr,k));

    }

    //Brute force Approach.

    public static List<Integer> sumOfSubArray(int arr[] , int k)
    {
        List<Integer> sumofsubArray = new ArrayList<>();
        for(int i=0;i<arr.length && (arr.length-i>=k);i++)
        {
            int sum =0;
            for(int j=i;j<k+i;j++){
                sum+=arr[j];
            }
            sumofsubArray.add(sum);
        }
        /*  In this approach we are touching every eleme twice accept first and form last k-1 elements
        touching only once.

        Time complexity : o(n*(n-k)) but it also similar to o(n^2)
        space complexity : O(n-k) it almost similar to O(n)
        */
        return sumofsubArray;
    }

    //Sliding window Technique.
    public static List<Integer> SubArraySum(int arr[] , int k)
    {
        List<Integer> res = new ArrayList<>();
        int st = 0;
        int sum = 0;
        for(int en=0;en<arr.length;en++)
        {
            sum += arr[en];   
            /* 
        first "K" element's of the array will be added to sum because the condition in
        while statement is in false until end reaches the "k"th index in the array. after that while 
        condition is true then we are updating the list and removing the leftmost element form sum and incrementing 
        the start value and iterating over the array until reaches the end element in the array 
        st --> start , en -->end , sum -->current sub array sum of k elements in array . 
             */
            while(en-st == k-1)
            {
                res.add(sum);
                sum -= arr[st];
                st++; 
            }

        }
/*
 * In this sliding technique Time complexity is similar to o(n) and space complexity is o(n);
 */
        return res;
    }
}