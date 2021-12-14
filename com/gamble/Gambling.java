package com.gamble;

public class Gambling {
	static int stake = 100;
	static int day = 1;
	static int target =stake+ (stake/2);
	static int loss = (stake/2);
	
	public static void main(String[] args) {
		Gambling gambling = new Gambling();
		while (day <= 20) {
		
			while(stake > loss && stake < target ) {
				int temp = gambling.random();
				if (temp == 0) {
					stake = stake+2; 
				}
				else {
					stake = stake-1;
				}
			}
			System.out.println("day "+day+" P/L  "+stake);
		
			stake = stake + 100;
			target = stake +(stake/2);
			loss = (stake/2);
			day +=1;
		}
		
		
	}
	public int random() {
		return (int)(Math.floor(Math.random()*10) % 2 );
	}
	
}
