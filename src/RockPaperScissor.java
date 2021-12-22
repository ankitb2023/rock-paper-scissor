import java.util.*;
public class RockPaperScissor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random rnd = new Random();
		System.out.println("********************************************************************************************************************************");
		System.out.println("\t\t\t\t\tROCK\tPAPER\tSCISSOR\t\t\t\t\n\n");
		System.out.println("\t\t\t\t  Welcome!! To The World Of WINNERS\t\n");
		System.out.println("********************************************************************************************************************************");
		System.out.print("Enter your name here: ");
		String player_name=sc.next(); 
		
		System.out.print(player_name+",Enter how many rounds you want to play: ");
		int n=sc.nextInt(),i=1,cc=0,cp=0;
	     String comp ="",user="";
		while(i<=n) {
			String options = "RPS";
			char computer = options.charAt(rnd.nextInt(3));  //rnd.nextInt(options.length())
			System.out.println("********************************************************************************************************************************");
			System.out.print(player_name+", please enter your choice:R for ROCK, P for paper and S for Scissor: ");
			
			char player=sc.next().charAt(0);
			System.out.println("********************************************************************************************************************************");
			
			if(player=='r' || player == 'R') user = "Rock";
			else if(player =='p' || player=='P') user ="Paper";
			else if(player=='s' || player == 'S') user="Scissor";
			else user = "invalid";
			
			if(computer == 'R') comp = "Rock";
			else if(computer=='P') comp ="Paper";
			else if(computer == 'S') comp="Scissor";
			else return;
			
			System.out.println("\n\t\t\t\tThe computer chosen -----> "+comp+" and "+player_name+" chosen -----> "+user+"\n");
		
			
			if((user=="Rock" && comp=="Rock")||(user=="Paper" && comp=="Paper")||(user=="Scissor" && comp=="Scissor")) {
				System.out.println("|*=================================================== * ||  Round Draw  || * =================================================== * |");
			}
			else if((user=="Rock" && comp=="Scissor")||(user=="Scissor" && comp=="Paper")||(user=="Paper" && comp=="Rock")) {
				cp++;
				System.out.println("|*=========================================== * ||    " + player_name + " won the round.    || * =========================================== * |");
				
			}
			else if((user=="Scissor" && comp=="Rock")||(user=="Paper" && comp=="Scissor")||(user=="Rock" && comp=="Paper")) {
				cc++;
				System.out.println("|*==================================== * ||   Computer Won this round.  Keep Trying!!  || * ==================================== * |");
				
			}
			else System.out.println("Invalid Combination");
			System.out.println("|*=================================== * ||  "+ player_name+" has "+ cp +" points && Computer has " +cc +" points.  || * =================================== * |");
			
			if(n-i==0) {
				System.out.println("\t\t\t\t\t\t||\t " + player_name+", Game Over \t ||");
				break;
			}
			else {
				int choice=n-i;
				System.out.println("\t\t\t\t\t\t||\t " + choice+" rounds Remaining" + " \t|| ");
			}
			i++;
		}
		if(cp>cc)
			System.out.println(player_name+" is the winner.");
		else if(cc>cp)
			System.out.println("Computer is the winner");
		else
			System.out.println("Tournament is draw!! Please try again later.");
		sc.close();
	}

}