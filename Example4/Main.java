package leetcode.Example4;

import java.util.ArrayList;
import java.util.Scanner;

final class Main{
    
    final static int Sum(ArrayList<Integer> arrayList){

        int sum = 0;
        for (int  sayi : arrayList) {
            
            sum += sayi;
        }
        return sum;
    }

    public static void main(String[] args) {
        
        ArrayList<Integer> numberlist = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add number, for exit 'sum' ");

        while(true){

            String tmp = scanner.next();

            if(tmp.equals("sum")){

                break;
            } try {
                int number = Integer.parseInt(tmp);
                numberlist.add(number);
            } catch (NumberFormatException e){
                System.out.println(" Wrong value try again");

            }
        }
        scanner.close();

        int sonuc = Sum(numberlist);
        System.out.println("Sum: " + sonuc);
    }
}