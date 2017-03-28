import java.io.DataInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
import java.util.Scanner;
import java.util.Random;
/**
 * Write a description of class Server here.
 * 
 * @author (Michael Blackley) 
 * @version (a version number or a date)
 */
public class Server
{
  public static void main(String[] args) throws Exception
  {
      int port = 3333;  
      int [] array = new int[9];
      int answer;
      int temp = 1;
      int temp2 = 0;
      int x;
      int a;
      
      Socket [] alteration = new Socket [2];
      PrintWriter out = null;
      PrintWriter out2 = null;
     
      ServerSocket players = new ServerSocket(port);
      
      
      alteration[0] = players.accept();  //player1
      System.out.println("Accepted connection on " + alteration[0].getInetAddress());
      alteration[1] = players.accept();  //player2
      System.out.println("Accepted connection on " + alteration[1].getInetAddress());
      
      /////alteration////
      while(temp < 9)
      {
      x = (temp + 1)%2;         //alternates x in between 0 and 1
      a = (temp2 + 1)%2;  
      
      DataInputStream din = new DataInputStream(alteration[x].getInputStream());      //gets the input 
      out = new PrintWriter(alteration[x].getOutputStream(), true);      //assings an output to the client
      out2 = new PrintWriter(alteration[a].getOutputStream(), true);  
      ////////////////////////////////////////////////////
      if(x == 0)
      {
          out.println("Player One it is your turn");
          
        }
        else
        {
            out2.println("Player Two it is your turn");
        }
      answer = din.readInt();
      
      switch(answer)
      {
       //need to make conditional for which player it is X or O
          
   case 1:
   array[0] = answer;
   out.println(array[0] + array[1] + array[2]);
   out.println(array[3] + array[4] + array[5]);
   out.println(array[6] + array[7] + array[8]);
   /////////////////////////////////////////////////
   out2.println(array[0] + array[1] + array[2]);
   out2.println(array[3] + array[4] + array[5]);
   out2.println(array[6] + array[7] + array[8]);
   break;
   
   case 2:
   array[1] = answer;
   out.println(array[0] + array[1] + array[2]);
   out.println(array[3] + array[4] + array[5]);
   out.println(array[6] + array[7] + array[8]);
   //////////////////////////////////////////////
   out2.println(array[0] + array[1] + array[2]);
   out2.println(array[3] + array[4] + array[5]);
   out2.println(array[6] + array[7] + array[8]);
   break;
   
   case 3:
   array[2] = answer;
   out.println(array[0] + array[1] + array[2]);
   out.println(array[3] + array[4] + array[5]);
   out.println(array[6] + array[7] + array[8]);
   ////////////////////////////////////////////////////
   out2.println(array[0] + array[1] + array[2]);
   out2.println(array[3] + array[4] + array[5]);
   out2.println(array[6] + array[7] + array[8]);
   break;
   
   case 4:
   array[3] = answer;
   out.println(array[0] + array[1] + array[2]);
   out.println(array[3] + array[4] + array[5]);
   out.println(array[6] + array[7] + array[8]);
   //////////////////////////////////////////////
   out2.println(array[0] + array[1] + array[2]);
   out2.println(array[3] + array[4] + array[5]);
   out2.println(array[6] + array[7] + array[8]);
   break;
   
   case 5:
   array[4] = answer;
   out.println(array[0] + array[1] + array[2]);
   out.println(array[3] + array[4] + array[5]);
   out.println(array[6] + array[7] + array[8]);
   ////////////////////////////////////////////
   out2.println(array[0] + array[1] + array[2]);
   out2.println(array[3] + array[4] + array[5]);
   out2.println(array[6] + array[7] + array[8]);
   break;
   
   case 6:
   array[5] = answer;
   out.println(array[0] + array[1] + array[2]);
   out.println(array[3] + array[4] + array[5]);
   out.println(array[6] + array[7] + array[8]);
   ////////////////////////////////////////////
   out2.println(array[0] + array[1] + array[2]);
   out2.println(array[3] + array[4] + array[5]);
   out2.println(array[6] + array[7] + array[8]);
   break;
   
   case 7:
   array[6] = answer;
   out.println(array[0] + array[1] + array[2]);
   out.println(array[3] + array[4] + array[5]);
   out.println(array[6] + array[7] + array[8]);
   ///////////////////////////////////////////////
   out2.println(array[0] + array[1] + array[2]);
   out2.println(array[3] + array[4] + array[5]);
   out2.println(array[6] + array[7] + array[8]);
   break;
   
   case 8:
   array[7] = answer;
   out.println(array[0] + array[1] + array[2]);
   out.println(array[3] + array[4] + array[5]);
   out.println(array[6] + array[7] + array[8]);
   ////////////////////////////////////////////
   out2.println(array[0] + array[1] + array[2]);
   out2.println(array[3] + array[4] + array[5]);
   out2.println(array[6] + array[7] + array[8]);
   break;
   
   case 9:
   array[8] = answer;
   out.println(array[0] + array[1] + array[2]);
   out.println(array[3] + array[4] + array[5]);
   out.println(array[6] + array[7] + array[8]);
   ///////////////////////////////////////////
   out2.println(array[0] + array[1] + array[2]);
   out2.println(array[3] + array[4] + array[5]);
   out2.println(array[6] + array[7] + array[8]);
   break;
   }
   
   if(array[0] == array[1] && array[0] == array[2])
   {
       
   }
   
   if(array[0] == array[4] && array[0] == array[8])
   {
       
    }
    
    if(array[0] == array[3] && array[0] == array[6])
    {
        
    }
    
    if(array[3] == array[4] && array[3] == array[5])
    {
        
    }
    
    if(array[6] == array[7] && array[6] == array[8])
    {
        
    }
    
    if(array[2] == array[5] && array[2] == array[8])
    {
        
    }
          
      temp++;          
}   
      }
      
      
   }

