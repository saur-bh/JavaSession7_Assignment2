package com.acadglid.session;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] arg) {



		//1. Input the string from user 

		System.out.println("Enter any sentence :");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();

		//2. Break sentence to word array using string split function 

		String [] arrWord = new String[sentence.length()];

		arrWord= sentence.split(" ");

		//3. Sort the Array 

		Arrays.sort(arrWord);
		System.out.println("The word sorted in accending order : ");
		//4. Print the sorted Array 

		for(String item : arrWord) {
			System.out.println(item);
		}

		//5. Change the sorted array to String back 

		String temp =" ";

		for( int i= 0; i<arrWord.length;i++) {

			temp = temp + arrWord[i];


		}

		System.out.print("This is new -->>> "+temp);

		//6. Conver to char Array and then again sort it 

		char [] letters = temp.toCharArray();

		Arrays.sort(letters);


		//7. Print the sorted array 

		for( char item:letters) {

			System.out.println(item);
		}



	}







}


