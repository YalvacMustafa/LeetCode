package leetcode.Example12;

import java.util.ArrayList;
import java.util.Scanner;



final class Main {
    
    final static int Divide(ArrayList<Integer> arraylist){

        int divide = arraylist.get(0);
        arraylist.remove(0);

        for (int number : arraylist) {
            
            if (number == 0){
                throw new ArithmeticException("no division by zero");
            }
            divide /= number;
        }
        return divide;
    }

    public static void main(String[] args) {
        
        ArrayList<Integer> numberlist = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numbers to be divided and for exit 'divide': ");

        while(true){

            String tmp = scanner.next();
            if (tmp.equals("divide")){
                break;
            
            } try {

                int number = Integer.parseInt(tmp);
                numberlist.add(number);
            } catch(NumberFormatException e) {

                System.out.println("Wrong Value");
            }
        }
        scanner.close();

        int result = Divide(numberlist);
        System.out.println("Divide: " + result);
    }
}
