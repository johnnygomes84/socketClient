package com.socket.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {

//	public static void main(String[] args) {
//		try {
//			Scanner scn = new Scanner(System.in);
//
//			// getting localhost ip
//			InetAddress ip = InetAddress.getByName("localhost");
//
//			// establish the connection with server port 5056
//			Socket s = new Socket(ip, 1234);
//
//			// obtaining input and out streams
//			DataInputStream dis = new DataInputStream(s.getInputStream());
//			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
//
//			// the following loop performs the exchange of
//			// information between client and client handler
//			while (true) {
//				System.out.println(dis.readUTF());
//				String tosend = scn.nextLine();
//				dos.writeUTF(tosend);
//				dos.flush();
//
//				// If client sends exit,close this connection
//				// and then break from the while loop
//				if (tosend.equalsIgnoreCase("BYE MATE")) {
//					System.out.println(dis.readUTF());
//					System.out.println("Closing this connection : " + s);
//					s.close();
//					System.out.println("Connection closed");
//					break;
//				}
//
//				// printing date or time as requested by client
//				String received = dis.readUTF();
//				System.out.println(received);
//			}
//
//			// closing resources
//			scn.close();
//			dis.close();
//			dos.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

}
