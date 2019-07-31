package com.codegym.task.task09.task0929;

import java.io.*;

/* 
Let's make the code do something useful!

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();

        boolean isExceptionCatched = false;

        try {
            InputStream fileInputStream = getInputStream(sourceFileName);
        }
        catch (Exception e) {
            System.out.println("File does not exist.");
            isExceptionCatched = true;
        }

        if (isExceptionCatched) {
            sourceFileName = reader.readLine(); //"D:\\New folder\\NewTextDocument.txt";
        }
        InputStream fileInputStream = getInputStream(sourceFileName);

        String destinationFileName = reader.readLine(); //"D:\\New folder\\NewTextDocument1.txt";
        OutputStream fileOutputStream = getOutputStream(destinationFileName);


        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}

