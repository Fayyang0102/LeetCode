/**
 * Created by qihuiyang on 8/6/17.
 */
public class SprialPrint {
    public void sprialPrint(int[][] a, int offset, int levelsize ,int counter){

        if(levelsize <= 1){
            System.out.print(a);
        }
        // -
        for(int i = 0 ; i < levelsize -1; i ++){
            //ROLL    COLUMN
            a[offset][offset+i] = counter++;
        }
        // -|
        for(int i = 0 ; i < levelsize-1; i++){
            a[offset+i][offset]= counter++;
        }
        //_
        for(int i = levelsize-1; i > 0;i-- ){
            a[offset][offset+i] = counter++;
        }
        //|_
        for(int i = levelsize-1;i>0;i--){
            a[offset+i][offset]= counter++;
        }
        sprialPrint(a,offset+1,levelsize-2,counter);

    }
    public static void main(String[] args) throws Exception{
        SprialPrint print = new SprialPrint();
        int count = 0;
        int[][] a = new int[5][5];
        for(int i = 0 ; i <5; i++){
            for(int j = 0 ; j <5;j++){
                a[i][j]=count++;
            }
        }

        print.sprialPrint(a,0,5,0);
        System.out.print(a);
    }
}
