package com.secondprgrm.abc;

import java.util.Scanner;


class Guesser
{
	
	int gnum;
	int guessNum(int low,int high)
	{
		
		System.out.println("Guesser,Kindly guess the number from range"+low+" to" +high);
		Scanner kb=new Scanner(System.in);
		
		gnum=kb.nextInt();
		if(gnum>=low & gnum<=high)
		{
		
		return gnum;
		}
		else
		{
			System.out.println("please guess the number between range Specified");
			return guessNum(low,high);
		}
		
	}
}

class Player
{
	int pnum;
	int predictNum(int low,int high)
	{
		System.out.println("Player, Kindly predict the number from"+low+"to"+high);
		Scanner scan=new Scanner(System.in);
		pnum=scan.nextInt();
		if(pnum>=low & pnum<=high)
		{
		
		return pnum;
		}
		else
		{
			System.out.println("please guess the number between range Specified");
			return predictNum(low,high);
		}
		
	}
}

class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum(1,100);
		
	}
	void collectNumFromPlayer()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numFromPlayer1=p1.predictNum(1,100);
		numFromPlayer2=p2.predictNum(1,100);
		numFromPlayer3=p3.predictNum(1,100);
	}
	void compare()
	{
		if(numFromGuesser==numFromPlayer1)
		{
			System.out.println("Player1 Wins");
		}
		if(numFromGuesser==numFromPlayer2)
		{
			System.out.println("Player2 Wins");
		}
		if(numFromGuesser==numFromPlayer3)
		{
				System.out.println("Player3 Wins");
		}
		else if(numFromGuesser!=numFromPlayer1 && numFromGuesser!=numFromPlayer2)
		{
			System.out.println("Game Lost, Try Again");
		}
	
	}
}

public class GuesserGame {
	
	final static int CHANCES=3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Umpire u=new Umpire();
		u.collectNumFromGuesser();
		int i=1;
		while(i<=CHANCES)
		{
		
		u.collectNumFromPlayer();
		u.compare();
		++i;
		}
		}
}
