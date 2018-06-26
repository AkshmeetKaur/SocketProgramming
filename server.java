
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author H.P
 */
public class server {
    
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(3341);
        Socket s=ss.accept();
        DataInputStream din=new DataInputStream(s.getInputStream());
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
       // BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str1="",str2="";
        str1=(String)din.readUTF();
        int sum=0;
        try{
        int a =Integer.parseInt(str1);
        /*for(int i=1;i<a;i++)
        {
            if(a%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum==a)
        { a= 2*a;
          str2=Integer.toString(a);
          
        }*/
        a=a*2;
        str2=Integer.toString(a);}
        catch(NumberFormatException e)
        { 
          str2="please send a proper number";}
        dout.writeUTF(str2);
        dout.flush();
        din.close();
        s.close();
        ss.close();
    }
}