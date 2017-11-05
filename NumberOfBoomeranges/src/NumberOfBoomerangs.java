import java.util.HashMap;

/**
 * Created by qihuiyang on 4/1/17.
 * Given n points in the plane that are all pairwise distinct, a "boomerang" is a tuple of points (i, j, k)
 * such that the distance between i and j equals the distance between i and k (the order of the tuple matters).

 Find the number of boomerangs. You may assume that n will be at most 500 and coordinates of points are all in
 the range [-10000, 10000] (inclusive).

 Example:
 Input:
 [[0,0],[1,0],[2,0]]

 Output:
 2

 Explanation:
 The two boomerangs are [[1,0],[0,0],[2,0]] and [[1,0],[2,0],[0,0]]
 */
public class NumberOfBoomerangs {
    public static int getnumberOfBoomerangs(int[][] points) {
        int count = 0;

        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < points.length; i++){
            for(int j = 0 ; j < points.length; j++){
                if(i == j ) {
                    continue;
                }
                 else{
                    int dis = getDistance(points[i], points[j]);
                    hm.put(dis, hm.getOrDefault(dis, 0) + 1);
                }
            }
            for(int val : hm.values()){
                count += val * (val - 1); //Total number of permutations of size 2 from n
                                         // different points is nP2 = n!/(n-2)! = n * (n-1)
            }
            hm.clear();

        }
        return count;

    }
    public static int getDistance(int[] a, int[] b){
        int dx = a[0] - b[0];
        int dy = a[1] - b[1];

        return dx * dx + dy * dy;
    }
    public static void main(String[] args){
        int data[][] =  {{0,0},{1,0},{2,0}};

        int res = getnumberOfBoomerangs(data);

        System.out.print("result is:" + res);

    }

}
