import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.*;
import java.util.Scanner;
import java.lang.*;
/**
 * Write a description of class Client here.
 * 
 * @author (Michael Blackley) 
 * @version (12/3/2015)
 */
public class Client
{
 public static void main(String[] args) throws Exception
 {
   int port = 3333;
   int [] array = new int[9];
   Scanner input = new Scanner(System.in);
   int answer;  
   Socket socket = null;                      //create socket and assign it to null
   BufferedReader in = null;
   
   socket = new Socket("localhost", port);    
   
   in = new BufferedReader(new InputStreamReader(socket.getInputStream()));    //create input stream from server
       
   DataOutputStream out = new DataOutputStream(socket.getOutputStream()); 
   
   System.out.println("Welcome to the game of Tic Tac Toe!");
   System.out.println(" ");
  
   System.out.println("|   |   |   |");
   System.out.println("_____________");
   System.out.println("|   |   |   |");
   System.out.println("_____________");
   System.out.println("|   |   |   |");

  
   System.out.println("");
   System.out.println("The entries for the first row are as follows: 1, 2, 3");
   System.out.println("The entries for the second row are as follows: 4, 5, 6");
   System.out.println("The entries for the third row are as follows: 7, 8, 9");
   
   System.out.println("");

   
   //needs to run 9 times for the game to be completed
   for(int i = 1; i < 9; i++)
   {
    if(i > 1)
    {
     System.out.println(in.readLine());   
    }
       
       
    if(i % 2 == 0)
    {
        //player twos turn
        System.out.println("Player Two, you are X's, please enter your move:");
       
        answer = input.nextInt();
       
   
        while(array[answer] !=0)
        {
            System.out.println("That position on the board is already filled! Try again");
            answer = input.nextInt();
        }
        
        array[answer] = answer;

        
        out.writeInt(answer);
    }
    
    else
    {
     //player ones turn
     System.out.println("Player One, you are O's, please enter your move:");
     
     answer = input.nextInt();
     

     
     while(array[answer] !=0)
     {
            System.out.println("That position on the board is already filled! Try again");
            answer = input.nextInt();
     }
     
          array[answer] = answer;

          
     out.writeInt(answer);
    }
    
    }
   
   in.close();
   
   out.close();
   
   socket.close();
   

}
}
