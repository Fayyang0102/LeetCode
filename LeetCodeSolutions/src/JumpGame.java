/**
 * Created by qihuiyang on 8/19/17.
 */
public class JumpGame {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        boolean[] array = new boolean[len];
        array[len -1]=true;
        for(int i = len-2; i >= 0; i--){
            for(int k = 1; k<=nums[i]; k++){
                if((k+i >= len -1)||(k+i < len -1) && array[k+i]==true){
                    array[i]= true;
                    break;
                }
            }
        }
        return array[0];
    }
    public static void main(String[] args){
        int[] n = {2,3,1,1,4};
        JumpGame jumpGame = new JumpGame();
        boolean res = jumpGame.canJump(n);
        System.out.print(res);

    }}
