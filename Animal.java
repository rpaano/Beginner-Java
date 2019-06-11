//Single Line comment
/*
 *vsvsvs
*/

import java.util.Scanner;
import java.util.*;

public class Animal{

    public static final double FAVNUMBER = 1.345;

    private String name;

    private int weight;
    //true or false
    private boolean hasOwner = false;
    // -28 TO 127 value
    private byte age;
    //-2^63 to 2^63
    private long uniqueID;

    private char favoriteChar;
    //64 bit number
    private double speed;
    //32 bit
    private float height;

    //can only be acces to the same package
    protected static int numberOfAnimals = 0;

    static Scanner userInput = new Scanner(System.in);

    public Animal(){
        numberOfAnimals++;

        int sumOfNumber = 5 + 1;

        System.out.println("5 + 1 = " + sumOfNumber);

        int diffOfNumber = 5 - 1;

        System.out.println("5 - 1 = " + diffOfNumber);

        int multiOfNumber = 5 * 1;

        System.out.println("5 * 1 = " + multiOfNumber);

        int divOfNumber = 5 / 1;

        System.out.println("5 / 1 = " + divOfNumber);

        int modOfNumber = 5 / 1;

        System.out.println("5 / 1 = " + modOfNumber);

        System.out.print("Enter the name: \n");

        if(userInput.hasNextLine()){
            /*
             *"this" is a way referring to an object that 
             *has been created because there is no other way to do that
            */
            this.setName(userInput.nextLine());
        }

        this.setFavoriteChar();
        this.setUniqueID();

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public boolean idHasOwner(){
        return hasOwner;
    }

    public void setHasOwner(boolean hasOwner){
        this.hasOwner = hasOwner;
    }

    public byte getAge(){
        return age;
    }

    public void setAge(byte age){
        this.age = age;
    }

    public long getUniqueID(){
        return uniqueID;
    }

    public void setUniqueID(long uniqueID){
        this.uniqueID = uniqueID;
        System.out.println("Unique ID set to: " + this.uniqueID);
    }

    public void setUniqueID(){
        long minNumber = 1;
        long maxNumber = 1000000;

        //cast in to byte, int
        this.uniqueID = minNumber + (long) (Math.random() * ((maxNumber - minNumber) + 1));

        //reverse int numberString = Interger.parseInt(stringNumber);
        String stringNumber = Long.toString(maxNumber);
        
        //reverse 
        int numberString = Integer.parseInt(stringNumber);

        System.out.println("Unique ID set to: " + this.uniqueID);
    }

    public char getFavoriteChar(){
        return favoriteChar;
    }

    public void setFavoriteChar(char favoriteChar){
        this.favoriteChar = favoriteChar;
    }

    public void setFavoriteChar(){
        int randomNumber = (int) (Math.random() *126) + 1;

        this.favoriteChar = (char) randomNumber;

        if (randomNumber == 32) {

            System.out.println("Favarite character set to Space");

        }else if (randomNumber == 10) {

            System.out.println("Favarite character set to Newline");

        } else {

            System.out.println("Favarite character set to " + this.favoriteChar);

        }



    }

    public double getSpeed(){
        return speed;
    }

    public void setSpeed(double speed){
        this.speed = speed;
    }

    public float getHeight(){
        return height;
    }

    public void setHeight(float height){
        this.height = height;
    }
    


    public static void main(String[] args) {
        Animal theAnimal = new Animal();
        
    }

}