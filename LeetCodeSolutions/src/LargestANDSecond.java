import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by qihuiyang on 8/28/17.
 */
public class LargestANDSecond {
    public static void find2(int[] n){
        if(n == null || n.length <1){
            return;
        }
        int first, second;
        ArrayList store = new ArrayList();
        if(n.length == 1){
           first = n[0];
           second = n[0];
        }
        if(n[0]>n[1]){
            first = n[0];
            second = n[1];
        }else{
            first = n[1];
            second = n[0];
        }
        for(int i = 2; i < n.length -1;){
            if(n[i]>n[i+1]){
                store.add(Math.min(first, n[i]));
                first = Math.max(first, n[i]);
            }else{
                store.add(Math.min(first, n[i+1]));

                first = Math.max(first,n[i+1]);
            }
            i = i +2;

        }
        if(n.length % 2 ==1){
            int lose = Math.min(first,n[n.length-1]);
            first = Math.max(first, n[n.length-1]);
            second = Math.max(second,lose);
        }
        // find second largest in store
        for(int i = 0 ; i < store.size();i++){
            if(second < (int)store.get(i)){
                second = (int)store.get(i);
            }
        }

        System.out.print("first is :" + first+" second is : " +second);

    }
    public static void main(String[] args) {
        int[] n = {3,2,1,4,5,7,2,8,9};
        find2(n);

    }

}
