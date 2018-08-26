//
//Cracking the Coding Interview
//Chapter 1 Problem 6
// String Compression implement a method to perform basic string compression
// if the compressed string is not smaller than the original it will return the original

import java.util.Scanner;

public class Chap1StringCompression {
    public static void main(String []args){
        Scanner reader = new Scanner(System.in);
        System.out.println("enter a string to be compressed: ");
        String str = reader.next();
        reader.close();
        System.out.println(compress(str));

    }

    public static String compress(String str){
        int amount = 1;
        int highest = 1;
        char temp = str.charAt(0);
        StringBuilder compressed = new StringBuilder();
        String comp;

        for(int i = 1; i < str.length(); i++){

            if(temp != str.charAt(i)){
                compressed.append(temp);
                compressed.append(amount);
                temp = str.charAt(i);
                amount = 1;
                if(amount > highest){ highest = amount;}
            }
            else if(i == str.length() - 1){
                ++amount;
                compressed.append(temp);
                compressed.append(amount);
                if(amount > highest){ highest = amount;}
            }
            else{
                ++amount;
            }
        }

        if(highest == 1)
            comp = str;
        else
            comp = compressed.toString();

        return comp;
    }
}
