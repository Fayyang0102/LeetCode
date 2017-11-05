/**
 * Count the number of prime numbers less than a non-negative number, n.

 * Created by qihuiyang on 7/8/17.
 */
public class CountPrime {
    public int countPrimes(int nums){
        boolean[] notPrime = new boolean[nums];
        int count = 0;
        for(int i = 2; i < nums; i++){
            if(notPrime[i] == false){
                count++;
                for (int j = 2; i * j < nums; j++ ){
                    notPrime[i*j] = true;
                }
            }

        }
        return count;
    }
    public static void main(String[] args){
        int n = 3;
        CountPrime count = new CountPrime();
        int res = count.countPrimes(n);
        System.out.print(res);
    }
}
