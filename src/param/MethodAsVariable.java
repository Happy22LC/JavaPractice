package param;

public class MethodAsVariable {
    public static void main(String[] args) {
        MethodAsVariable mv = new MethodAsVariable();
        mv.loop1();
        System.out.println(mv.loop2() +5);
    }
    //Simple Method
    void loop1()
    {
        int sum = 0;
        for(int i = 0; i <= 10; i++)
        {
            sum += i;
        }
        System.out.println(sum);
    }

    //when method works as a variable that method should have to initialize with their Data type
    // and the method must return ;
    // we can do the operation when we call with object. example above online 7.

    int loop2 ()
    {
        int sum = 0;
        for(int i = 0; i <= 10; i++)
        {
            sum += i;
        }
        return sum;
    }
}
