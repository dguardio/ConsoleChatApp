import java.io.*;
import java.util.Scanner;
//Created by Yemi
public class userInput{
	public static void chatMessage(String n){
		//run command line
		String gT = n.substring(0, 2);
		System.out.println(gT);
		if (gT.equals(">>")){
			String cmd = n.substring(2);
			System.out.println(cmd);
			//return cmd;
			};

	}
	public static void main(String[] args) {
		System.out.println("Dear User, you can now enter your chat: ");
		Scanner in =  new Scanner(System.in);
		String chat = in.nextLine();
		chatMessage(chat);
		//System.out.println(chat);
	}
}