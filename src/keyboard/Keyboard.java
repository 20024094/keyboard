package keyboard;

/*
* Author: Daniel Barbu: 20024094
* Application: Keyboard
* Version: 1.0
* Date: 03/10/2023
*/

/**
 *
 * @author 20024094
 */

import java.io.*;
import java.util.*;

public class Keyboard {
    
    Scanner keyboard;
    
    public Keyboard() {
        keyboard = new Scanner(System.in);
    }
    
    public void enterToContinue() {
        getString();
    }
    
    public String getString() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString = "";
        
        try {
            inputString = br.readLine();
        } catch(IOException ex) {
            System.err.println(ex);
        }
        return inputString;
    }
    
    public String getString(String prompt) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString = "";
        try {
            System.out.print(prompt);
            inputString = br.readLine();
        } catch(IOException ex) {
            ex.printStackTrace();
        }
        return inputString;
    }
    
    public char getChar(String prompt) {
        String input = "";
        char temp_char = ' ';
        System.out.print(prompt);
        input = keyboard.next();
        temp_char = input.charAt(0);
        return temp_char;
    }
    
    public char getChar() {
        String input = "";
        char temp_char = ' ';
        input = keyboard.next();
        temp_char = input.charAt(0);
        return temp_char;
    }
    
    public int getInt(String prompt) {
        int temp_int = 0;
        System.out.print(prompt);
        temp_int = keyboard.nextInt();
        return temp_int;
    }
    
    public int getInt() {
        int temp_int = 0;
        temp_int = keyboard.nextInt();
        return temp_int;
    }
    
    public double getDouble(String prompt) {
        double temp_double = 0d;
        System.out.print(prompt);
        temp_double = keyboard.nextDouble();
        return temp_double;
    }
    
    public double getDouble() {
        double temp_double = 0;
        temp_double = keyboard.nextDouble();
        return temp_double;
    }
    
    public boolean getBool(String prompt) {
        boolean temp_bool = false;
        System.out.print(prompt);
        String temp = getString();
        temp_bool = (temp.equals("true") ? true : false);
        return temp_bool;
    }
    
    public boolean getBool() {
        boolean temp_bool = false;
        String temp = getString();
        temp_bool = (temp.equals("true") ? true : false);
        return temp_bool;
    }
    
    

    public static void main(String[] args) {
         Keyboard kb = new Keyboard();
         
        Dog theDog = new Dog();
        
        theDog.setName(kb.getString("what is the Dog's name? > "));
        theDog.setGender(kb.getChar("what is " + theDog.getName() + " gender? > "));
        theDog.setAge(kb.getInt("how old is " + theDog.getName() + "? > "));
        theDog.setBreed(kb.getString("what is the " + theDog.getName() + " breed? > "));
        theDog.walkTheDog(kb.getDouble("How far did " + theDog.getName() + " walk today? >"));
        theDog.setNoOfLegs(kb.getInt("how many legs does " + theDog.getName() + " have? > "));
        theDog.setTrained(kb.getBool("is " + theDog.getName() + " trained? > "));
       
        theDog.displayDetails();
    }
    
}
