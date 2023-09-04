package Carro;
import java.util.Scanner;

public class Carro {
    public static void main(String[] a) {
        Car car = new Car();
        
        while (true) {
            var line = input();
            write("$" + line);
            var args = line.split(" ");

            if      (args[0].equals("end"))   { break; } 
            else if (args[0].equals("show"))  { System.out.println(car); }
            else if (args[0].equals("enter")) { car.addPass();}
            else if (args[0].equals("leave")) { car.removePass();}
            else if (args[0].equals("drive")) { 
                car.drive((int) number(args[1])); 
            }
            else if (args[0].equals("fuel"))  { car.fuel((int) number(args[1])); }
            else { write("fail: comando invalido"); }
        }
    }

    private static final Scanner scanner = new Scanner(System.in);
    private static String  input()              { return scanner.nextLine(); }
    private static double  number(String value) { return Double.parseDouble(value); }
    private static void    write(String value)  { System.out.println(value); }
}
