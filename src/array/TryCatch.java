package array;

public class TryCatch {
    public static void main(String[] args) {
        char[] x = {'a', 'b', 'c', 'd', 'e'};

        System.out.println(x[3]);

        try {
            System.out.println(x[5]);
        }catch (Exception b)
        {
            System.out.println("catch the exception");
        }
        System.out.println(x[2]);
    }
}
