import java.util.Comparator;
import java.util.Arrays;

class MyCmp implements Comparator<Integer>
{
    public int compare(Integer a,Integer b)
    {
        return a%2 - b%2;
    }
}
public class WrapperExample {
    public static void main(String args[])
    {
        Integer arr[]={5,20,10,3,12};
        Arrays.sort(arr, MyCmp());
        System.out.println(Arrays.toString(arr));

    }

    private static Comparator MyCmp() {
        return null;
    }
}
