package labsix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/** This class has a method that accepts user input and displays it as output.
  * This program will be able to manipulate DNA.
  */
public class ManipulateDna {

  /** This program manipulates DNA by reading in and displaying a string of
    * DNA, then computing the complement and manipulates the string.
    */
  public static void main(String[] args) {
    // display the name of the programmer and the date
    System.out.println("Dillon Thoma " + new Date());
    // declare the starting file and scanner
    File dnaInputsFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      dnaInputsFile = new File("input/dna_inputs.txt");
      scanner = new Scanner(dnaInputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
    // Step One: Read in and display the chosen DNA string
    String dnaString = scanner.nextLine();
    System.out.println("Okay, I am going to manipulate the DNA string" + ": " + dnaString);
    System.out.println();
    System.out.println("Enter a string containing only the letters C, G, T, and A: " + dnaString);
    // Step Two: Compute the complement of the DNA String
    String complementDna = dnaString.replace('a','T');
    complementDna = complementDna.replace('t','A');
    complementDna = complementDna.replace('c','G');
    complementDna = complementDna.replace('g','C');
    System.out.println("The complement of the DNA string " + dnaString + " is " + complementDna);
    // Step Three: Insert a randomly chosen DNA letter into the DNA String
    String dnaOneToFour = "actg";
    Random random = new Random();
    char letter = dnaOneToFour.charAt(random.nextInt(4));
    int randomInsertionIndexA = random.nextInt(dnaString.length());
    String mutationOne = dnaString.substring(0, randomInsertionIndexA) + letter 
        + dnaString.substring(randomInsertionIndexA);
    System.out.println("Inserting " + letter + " at position " + randomInsertionIndexA 
        + " gives " + mutationOne);
    // Step Four: Delete a DNA letter from a randomly chosen position in the DNA string
    int randomRemovalIndex = random.nextInt(dnaString.length());
    String mutationTwo = dnaString.substring(0, randomRemovalIndex);
    String mutationThree = dnaString.substring(randomRemovalIndex + 1, dnaString.length());
    System.out.println("Deleting from position " + randomRemovalIndex 
        + " gives " + mutationTwo + mutationThree);
    // Step Five: Change a random position in the DNA String to a randomly chosen DNA letter
    int randomInsertionIndexB = random.nextInt(dnaString.length());
    String mutationFour = dnaString.substring(0, randomInsertionIndexB);
    String mutationFive = dnaString.substring(randomInsertionIndexB + 1, dnaString.length());
    System.out.println("Changing position " + randomInsertionIndexB + " gives " + mutationFour 
        + letter + mutationFive);
    // Step Six: Display a final thankyou message
    System.out.println();
    System.out.println("Thank you for using the ManipulateDna program.");
    System.out.println("Let's Go Pens!");
  }

}
