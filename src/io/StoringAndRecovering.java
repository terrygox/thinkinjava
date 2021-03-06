package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StoringAndRecovering {
	public static void main(String[] args) throws IOException {
		String data = "E:/Java/thinkinjava/src/io/Data.txt";
		DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(data)));
		out.writeDouble(3.1415926);
		out.writeUTF("That was PI");
		out.writeDouble(1.41413);
		out.writeUTF("That was square root of 2");
		out.close();
		DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(data)));

		System.out.println(in.readDouble());
		System.out.println(in.readUTF());
		System.out.println(in.readDouble());
		System.out.println(in.readUTF());
		in.close();

	}
}
