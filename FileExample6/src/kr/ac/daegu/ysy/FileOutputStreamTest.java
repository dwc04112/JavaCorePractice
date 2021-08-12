package kr.ac.daegu.ysy;

import java.io.FileOutputStream;
import java.io.IOException;

//p 485
public class FileOutputStreamTest {
    //FileOutputStream 테스트

    public static void main(String[] args) {
        FileOutputStream fo = null;
        String msg = "FileOutputStream Test";
        byte [] byteArray = msg.getBytes();

        try{
            fo = new FileOutputStream("fileoutput.txt",true);
            fo.write(byteArray);

        }
        catch (IOException io){
            io.printStackTrace();
        }
        finally {
            try{
                fo.close();
            }
            catch (IOException io){
                io.printStackTrace();
            }
        }
    }
}
