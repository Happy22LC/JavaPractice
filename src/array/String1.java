package array;

public class String1 {
    public static void main(String[] args) {
        String a = "hello world";
        //If we want to split any sentence we need a placeholder that will hold the split words temporary
        String[] words = a.split(" "); //split the string with space

        for(String v : words)//iterate throw each word split with space
        {
            System.out.println(v);
        }

        System.out.println(a.length());//total length of the string
        String[] b = a.split("l");
        System.out.println("count of: " + (b.length - 1));
        System.out.println(a.substring(2,6));
    }
}
