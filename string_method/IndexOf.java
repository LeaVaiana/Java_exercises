package string_method;

import java.io.*;
public class IndexOf
{
public static void main(String[] args)
{
    strmanip();
}

static void strmanip(){
 
String email="";

try{
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   System.out.print("Enter an e-mail address:");
	email= br.readLine();
}catch(IOException e){}

if (email.indexOf('@')>0 && email.indexOf('@')<email.length()-1)
  System.out.println("It is a valid e-mail address.");
else System.out.println("It is an invalid e-mail address.");

}

}

