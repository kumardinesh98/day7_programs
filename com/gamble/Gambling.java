package com.gamble;

public class Gambling {
	static int stake = 100;
	int day = 1;
	static int target =stake+ (stake/2);
	static int loss = (stake/2);
	
	public static void main(String[] args) {
		Gambling gambling = new Gambling();
		while(stake > loss && stake < target ) {
			gambling.game(gambling.random());
			System.out.println(stake);
		}
		
	}
	public int random() {
		return (int)(Math.floor(Math.random()*10) % 2 );
	}
	public void game(int random) {
		switch (random) {
		case 0:
			stake = stake+1;
			break;
		case 1:
			stake = stake-1;
		}
	}
}

