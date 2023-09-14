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
        // Locally / inside the main method we catch the exception by try-catch block

        System.out.println("First");
        try{
            Thread.sleep(10000);
        }catch(Exception m)
        {

        }
        System.out.println("second");
    }


    /*
    we can do both way to throw the exception
    // with the main method / globally throw the exception
    
    public static void main(String[] args) throws InterruptedException {
        System.out.println("first");
        Thread.sleep(10000);
        System.out.println("second");

    }*/
}
