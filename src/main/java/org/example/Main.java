package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(-11212));
        System.out.println("-----------");
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
        System.out.println("-----------");
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));



    }
    public static boolean isPalindrome(int sayi) {
        String text = Integer.toString(sayi);
        text = text.replace("-", "");
        String reversed = new StringBuilder(text).reverse().toString();
        if (text.equals(reversed)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isPerfectNumber(int number){
        if (number<0){
            return false;
        }

        int total=0;

        for(int i=1;i<=number/2;i++){
            if(number%i==0){
                total+=i;
            }
        }
        return total == number;
    }
    public static String numberToWords(int number){
        if(number<0){
            return "Invalid Value";
        };

        char [] digits=String.valueOf(number).toCharArray();
        String text="";
        for(char digit:digits){
            switch (digit){
                case '0':
                    text+="Zero ";
                    break;
                case '1':
                    text+="One ";
                    break;
                case '2':
                    text+="Two ";
                    break;
                case '3':
                    text+="Three ";
                    break;
                case '4':
                    text+="Four ";
                    break;
                case '5':
                    text+="Five ";
                    break;
                case '6':
                    text+="Six ";
                    break;
                case '7':
                    text+="Seven ";
                    break;
                case '8':
                    text+="Eight ";
                    break;
                case '9':
                    text+="Nine ";
                    break;
            }

        }return text.trim();
    }
}