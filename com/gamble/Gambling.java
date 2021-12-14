package com.gamble;

public class Gambling {
	static long stake = 100;
	static int day = 1;
	static int month = 1;
	static int  daysWon = 0;
	static int daysLost = 0;
	static int temp ;
	static long thisMonth;
	static long daysprofit;
	static long target =stake+ (stake/2);
	static long loss = (stake/2);
	
	public static void main(String[] args) {
		Gambling gambling = new Gambling();
		while (month <= 2) {
			thisMonth = stake;
			while (day <= 20) {
				daysprofit = stake;
				while(stake > loss && stake < target ) {
					temp = gambling.random();
					if (temp == 0) {
						stake = stake+1; 	
					}
					else {
						stake = stake-1;
						
					}
					
				}
				if ((stake-daysprofit) > 0) {
					daysWon += 1;
					System.out.println("day "+day+" profit  "+stake);
				}
				else {
					daysLost += 1;
					System.out.println("day "+day+" loss  "+stake);
				}
				
			
				stake = stake + 100;
				target = stake +(stake/2);
				loss = (stake/2);
				day +=1;
			}
			long monthPandL = stake - thisMonth;
			System.out.println("days won = "+ daysWon);
			System.out.println("days lost = "+ daysLost);
			System.out.println("month" + month + "P/L is  " + monthPandL );
			day =1;
			month ++;
		}
		
		
	}
	public int random() {
		return (int)(Math.floor(Math.random()*10) % 2 );
	}
	
}
