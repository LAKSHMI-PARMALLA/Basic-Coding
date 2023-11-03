import java.util.Arrays;

public class ConcatArrays {
    public static void main(String[]args)
    {
        int[] a = {10, 20, 30};
        int[] b = {40, 50, 60};
        int alen = a.length;
        int blen = b.length;
        int totallen =alen+blen;
        int[] result = new int[totallen];
        //System.arraycopy(source_arr, sourcePos, dest_arr, destPos, len);
        System.arraycopy(a, 0, result, 0, alen);
        System.arraycopy(b, 0, result, alen, blen);
        System.out.println("Final array is " +Arrays.toString(result));
    }
}
