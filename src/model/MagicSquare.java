package model;

public class MagicSquare {
	
	private int n;
	private int[][] matrix; 
	private int magicConstant;
	private int option;
	
	public MagicSquare(int nx) {
		n = nx; 
		matrix= new int[n][n];
		magicConstant=n*((n*n)+1)/2;
		option=0; 
	}
	
	public int checker(String startPosition, String orientation) {
		
		if((n%2==0)||!(n>2)){
			option=1000000; 
		}else {
			if(startPosition.equalsIgnoreCase("Up-center")) {
				if(orientation.equalsIgnoreCase("NO")) {
					option = 1; 
				}else if(orientation.equalsIgnoreCase("NE")) {
					option = 2; 
				}else {
					option = 10;
				}
			}
			
			if(startPosition.equalsIgnoreCase("Down-center")) {
				if(orientation.equalsIgnoreCase("SO")) {
					option = 3; 
				}else if(orientation.equalsIgnoreCase("SE")) {
					option = 4; 
				}else {
					option = 100;
				}
			}
			
			if(startPosition.equalsIgnoreCase("Left-center")) {
				if(orientation.equalsIgnoreCase("NO")) {
					option = 5; 
				}else if(orientation.equalsIgnoreCase("SO")) {
					option = 6; 
				}else {
					option = 1000;
				}
			}
			
			if(startPosition.equalsIgnoreCase("Right-center")) {
				if(orientation.equalsIgnoreCase("NE")) {
					option = 5; 
				}else if(orientation.equalsIgnoreCase("SE")) {
					option = 6; 
				}else {
					option = 10000;
				}
			}
		}
		
		return option; 
	}
	
	public String message() {
		String msg="You can not use Up-center with that orientation";
		if(option==1000000) {
			msg= "Error, (n) cannot to be pair ";
		}
			
			
		if(option==1||option==2||option==3||option==4||option==5||option==6||option==7||option==8) {
			msg="The solution:"; 
		}else if(option==100) {
			msg="You can not use Down-center with that orientation";
		}else if(option == 1000) {
			msg="You can not use Left-center with that orientation";
		}else if(option == 10000) {
			msg="You can not use Right-center with that orientation";
		}
		
		return msg; 
	}
	
	public int[][] fillMatrix(){
		int[][] solvedMatrix=matrix; 
		
		if(option== 1) {
			
		}
		
		if(option == 2) {
			
		}
		
		if(option == 3) {
			
		}
		
		if(option == 4) {
			
		}
		
		if(option == 5) {
			
		}
		
		if(option == 6) {
			
		}
		
		if(option == 7) {
			
		}
		
		if(option == 8) {
			
		}
		return solvedMatrix; 
	}
	
}
