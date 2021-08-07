package com.company;
import java.util.*;

class Main {
    static int getNumber(char ch){
        int num = 0;
        switch(ch){
            case 'A': num = 10;
                break;
            case 'B': num = 11;
                break;
            case 'C': num = 12;
                break;
            case 'D': num = 13;
                break;
            case 'E': num = 14;
                break;
            case 'F': num = 15;
                break;
            case 'G': num = 16;
        }
        return num;
    }

    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the 17 decimal number: ");
        String numStr = Sc.nextLine();
        int decimalRes = 0;

        for(int i=0, power = numStr.length()-1 ; i<numStr.length(); i++, power--){
            int eachDigit = 0;
            char ch = numStr.charAt(i);
            if(Character.isDigit(ch)){
                eachDigit = ch - '0';
            }else{
                eachDigit = getNumber(ch);
            }
            decimalRes = decimalRes + (eachDigit*(int)(Math.pow(17,power)));
        }
        System.out.println("Decimal value is: "+ decimalRes);
    }
}