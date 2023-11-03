public class AverageArrays {
    public static void main(String[] args)
    {
        double[] numarray = {10.1, 20.5, 30.6, 40.8, 50.9};
        double sum = 0.0;
        //foreach
        for(double num: numarray)
        {
            sum += num;
        }
        System.out.println("Sum of array elements is: " +sum);
        double avg = sum/numarray.length;
        System.out.println("Average is: " +avg);
    }
}
