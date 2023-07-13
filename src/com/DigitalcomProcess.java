package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DigitalcomProcess {
	public static void main(String[] args) {
		boolean flag=true;
		Scanner sc = new Scanner(System.in);
		GameService gameObject=new GameService();
		while(flag){
			System.out.println("Main Menu - choices");
			System.out.println("1) RegisterUser");
			System.out.println("2) ViewGames");
			System.out.println("3) SearhByName");
			System.out.println("4) Exit");
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
		switch(choice){
		    case 1:
		    	System.out.println("Enter User Id");
		    	String userId=sc.next();
		    	String password=sc.next();
		    	User newUser=new User();
		    	newUser.addUser(userId, password);
		    	break;
		  
		    case 2:
		    	List<Game> li=new ArrayList<Game>();
		    	li=gameObject.viewAll();
		    	for (Game game : li) {
					System.out.println(game.getGameName());
				}
		    	break;
		        
		    case 3:
		    	System.out.println("Enter Author name: ");
		    	String author=sc.next();
		    	String gameName=gameObject.authorSearch(author);
		    	System.out.println("Game By Author---> "+gameName);
		    	break;
		    case 4:
		    	flag=false;
		}
		}
	}
}
