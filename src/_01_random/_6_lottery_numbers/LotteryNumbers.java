package _01_random._6_lottery_numbers;

import java.util.Random;

public class LotteryNumbers {
	public static void main(String[] args) {
	
for (int num=0; num<=5; num++) {
Random ran=new Random();
int number;
number= ran.nextInt(100);
System.out.print(number + " ");
}
	}
}
//Get 6 random numbers to put on your lottery ticket
//Display the selected numbers to the user in a pop-up
//Bonus: set the title of the pop-up to show it is a lottery ticket