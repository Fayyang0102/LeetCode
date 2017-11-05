/**
 * Reverse bits of a given 32 bits unsigned integer.

 For example, given input 43261596 (represented in binary as 00000010100101000001111010011100), return 964176192 (represented in binary as
 00111001011110000010100101000000).

 Follow up:
 If this function is called many times, how would you optimize it
 * Created by qihuiyang on 7/23/17.
 */


/**n & 1 will do a binary comparison between n, and 1 which is 00000000000000000000000000000001 in binary.
 * As such, it will return 00000000000000000000000000000001 when n ends in a 1 (positive odd or negative even number)
 * and 00000000000000000000000000000000 otherwise.

 (n & 1) == 0 will hence be true if n is even (or negative odd) and false otherwise.

 n >> = 1 is equivalent to n = n >> 1. As such it shifts all bits to the right, which is roughly equivalent to a division by two (rounding down).

 If e.g. n started as 12 then in binary it would be 1100. After one loop it will be 110 (6), after another it will be 11 (3) and then the loop will stop.

 If n is 0 then after the next loop it will still be 0, and the loop will be infinite.
*/
public class ReverseBits {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result += n & 1;//COUNTING THE NUMBER OF SET BITS IN AN INTEGER
            n >>>= 1;   // unsigned shift
            if (i < 31) // for last digit, don't shift!
                result <<= 1; //shifts all bits to the left
        }
        return result;

    }
    public  static void main(String[] args){
        int nums = 43261596;
        ReverseBits reverse = new ReverseBits();
        int res = reverse.reverseBits(nums);
        System.out.print(res);
    }
    /**How to optimize if this function is called multiple times? We can divide an int into 4 bytes,
     *  and reverse each byte then combine into an int. For each byte, we can use cache to improve performance.

     // cache
     private final Map<Byte, Integer> cache = new HashMap<Byte, Integer>();
     public int reverseBits(int n) {
     byte[] bytes = new byte[4];
     for (int i = 0; i < 4; i++) // convert int into 4 bytes
     bytes[i] = (byte)((n >>> 8*i) & 0xFF);
     int result = 0;
     for (int i = 0; i < 4; i++) {
     result += reverseByte(bytes[i]); // reverse per byte
     if (i < 3)
     result <<= 8;
     }
     return result;
     }

     private int reverseByte(byte b) {
     Integer value = cache.get(b); // first look up from cache
     if (value != null)
     return value;
     value = 0;
     // reverse by bit
     for (int i = 0; i < 8; i++) {
     value += ((b >>> i) & 1);
     if (i < 7)
     value <<= 1;
     }
     cache.put(b, value);
     return value;
     }*/

}
