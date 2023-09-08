package param;

public class SkyBlue {
    void sum(){
        int i = 5;
        int j = 10;
        System.out.println(i +j);
    }
    //used parameter in a method
    // any parameter works like a placeholder ,after initialization of parameter value can assign later
    void sum2 (int k, int l)
    {
        System.out.println(k+l);
    }

    public static void main(String[] args) {
        SkyBlue sb = new SkyBlue();
        sb.sum();
        sb.sum2(3, 1);
    }
}
