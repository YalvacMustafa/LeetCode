package Example17;

 class Solution {
    
    public int divide(int dividend, int divisor){
        int result = 0;
        try {
            int value = dividend / divisor;
            result = Math.round(value);
            

        } catch(ArithmeticException e) {

            System.out.println("0 a bolme hatasi");
        }
        return result;
    }
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.divide(-10, 3));
    }
}
