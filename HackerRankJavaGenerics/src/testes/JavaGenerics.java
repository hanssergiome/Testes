package testes;

import java.lang.reflect.Method;
class Printer
{

 public static < E > void printArray( E[] inputArray )
   {
              
         for ( E element : inputArray ){        
            System.out.println(element);
         }
    }
}

public class JavaGenerics {

    public static void main( String args[] ) {
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        Printer.printArray(intArray);
        Printer.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
 
    }
}