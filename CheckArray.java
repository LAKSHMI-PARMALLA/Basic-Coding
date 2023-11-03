public class CheckArray {
    public static void main(String[] args)
    {
        int[] arr = {10, 20, 30, 40, 58};
        int toFind = 58;
        boolean found = false;
        for(int num: arr)
        {
            if(num == toFind)
            {
                found = true;
                break;
            }
        }
        if(found)
        {
            System.out.println(toFind+ " is present in the array");
        }
        else
        {
            System.out.println(toFind+ " is not present in the array");
        }
    }
}
