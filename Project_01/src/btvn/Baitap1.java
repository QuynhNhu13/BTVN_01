/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btvn;

public class Baitap1 {


static boolean isPrime(int n) {
if(n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
return true;
}

static boolean isOdd(int n) {
return n % 2 != 0;
}

    public static void main(String[] args) {
        int a = 13;
        int b = 24;

boolean aPrime = isPrime(a);
boolean bOdd = isOdd(b);

        System.out.println("a is prime number: " + aPrime);
        System.out.println("b is odd number: " + bOdd);

    }

}
