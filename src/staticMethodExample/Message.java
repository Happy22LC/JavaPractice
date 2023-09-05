package staticMethodExample;
/*
The Message class contains the getMessage method Like main,
it has the static keyword. Unlike main, getMessage has a return type of String instead of void.
getMessage takes a single String parameter, lang
Since Java is statically typed, we must declare the data type for each parameter AND the return value.
public static returnedDataType methodName(parameterDataType parameterName) {
        //code
        }*/

public class Message {
    public static String getMessage(String language)
    {
        if(language.equals("spanish"))
        {
            return "Hola, Mundo!";
        }
        else if(language.equals("french"))
        {
            return "Bonjour, le monde!";
        } else if (language.equals("Japanese"))
        {
            return "Kon'nichiwa sekai!";
        }
        else
        {
            return "Hello, World!";
        }
    }
}
