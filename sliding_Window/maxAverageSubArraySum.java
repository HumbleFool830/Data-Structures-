import java.util.*;

public class maxAverageSubArraySum {
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
        System.out.println(SubArraySum(arr,k));

    }
    public static double SubArraySum(int arr[] , int k)
    {
        List<Integer> res = new ArrayList<>();
        int st = 0;
        int sum = 0;
        for(int en=0;en<arr.length;en++)
        {
            sum += arr[en];
            while(en-st == k-1)
            {
                res.add(sum);
                sum -= arr[st];
                st++; 
            }

        }
        int m = Collections.max(res);

        return m/k;
    }
}