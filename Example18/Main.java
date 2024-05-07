/**
 * Üslü sayılar işlemini toplama şeklinde yapma.
 * Örneğin: 2^3 = 8, 
 * 2 + 2 + 2 + 2 = 8 şeklinde olmalı.
 */

package Example18;



 class Solution {
    
    public static int ÜsAlma(int sayi, int üs){

        if (üs == 0){

            System.out.println(sayi + "^" + üs + " =1");
        }

        int toplam = 0;
        double değer = Math.pow(sayi,  üs - 1);

        for (int i = 0; i < değer; i ++){

            toplam += sayi;
        }
        return toplam;
    }

    public static void main(String[] args){

        System.out.println(ÜsAlma(3, 4));
    }
}
