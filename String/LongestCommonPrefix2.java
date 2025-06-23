package String;
import java.util.HashSet;

public class LongestCommonPrefix2 {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        
        int longestCommonPrefix=0;
        HashSet<Integer> arr1HashSet= new HashSet<>();
        for(int val:arr1){
            while(!arr1HashSet.contains(val) && val>0){

                arr1HashSet.add(val);
                val=val/10;
            }
        }
        System.out.println(arr1HashSet);
        for(int val:arr2){
            while(!arr1HashSet.contains(val) && val>0){
                val=val/10;
            }
            System.out.println(val);
            if(val>0){
                longestCommonPrefix=(int) Math.max(longestCommonPrefix,Math.log10(val)+1);
            }
            System.out.println(longestCommonPrefix);

        }
        return longestCommonPrefix;
    }

    public static void main(String[] args) {
        int[] arr1={1,10,100};
        int[] arr2={1000};

        new LongestCommonPrefix2().longestCommonPrefix(arr1,arr2);
    }
}