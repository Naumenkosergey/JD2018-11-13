package by.it.vchernetski.calc;

import java.util.Scanner;

public class ConsoleRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in;
        while (!(in = sc.next()).equals("end")){
            Var res = Parcer.calc(in);
            if(res == null) continue;
            Printer.print(res);
        }

    }
}