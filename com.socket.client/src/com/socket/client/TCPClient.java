package com.socket.client;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPClient {
	public static void main(String[] args) throws Exception {
		try {
			Socket socket = new Socket("127.0.0.1", 1234);
			DataInputStream inStream = new DataInputStream(socket.getInputStream());
			DataOutputStream outStream = new DataOutputStream(socket.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String clientMessage = "", serverMessage = "";

			while (true) {
				serverMessage = inStream.readUTF();
				System.out.println(serverMessage);

				clientMessage = br.readLine();
				outStream.writeUTF(clientMessage);
				outStream.flush();
				

				if (clientMessage.equalsIgnoreCase("bye mate")) {
					outStream.writeUTF(clientMessage);
					outStream.flush();
					serverMessage = inStream.readUTF();
					System.out.println(serverMessage);
					socket.close();
					break;

				}

			}

			outStream.close();
			outStream.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}