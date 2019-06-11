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
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getWeight(){
        return weight;
    }

    public void setWeight(String weight){
        this.weight = weight;
    }

    public String getHasOwner(){
        return hasOwner;
    }

    public void setHasOwner(String hasOwner){
        this.hasOwner = hasOwner;
    }

    public String getAge(){
        return age;
    }

    public void setAge(String age){
        this.age = age;
    }

    public String getUniqueID(){
        return uniqueID;
    }

    public void setUniqueID(String uniqueID){
        this.uniqueID = uniqueID;
    }

    public String getFavoriteChar(){
        return favoriteChar;
    }

    public void setFavoriteChar(String favoriteChar){
        this.favoriteChar = favoriteChar;
    }

    public String getSpeed(){
        return speed;
    }

    public void setSpeed(String speed){
        this.speed = speed;
    }

    public String getHeight(){
        return height;
    }

    public void setHeight(String height){
        this.height = height;
    }
    


    public static void main(String[] args) {
        Animal theAnimal = new Animal();
        
    }

}