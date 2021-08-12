package kr.ac.daegu.ysy;

import java.io.FileInputStream;
import java.io.IOException;

//p 479
public class FileInputStreamTest {

    //FileInputStream 테스트

    public static void main(String[] args) {
        FileInputStream fIn=null;

        try{
            fIn = new FileInputStream("C:\\data\\test.txt");
        }
        catch (IOException io){
            io.printStackTrace();
        }

        int var_read = -1;

        try{
            while((var_read = fIn.read()) !=-1){
                System.out.print((char)var_read);
            }
        }
        catch (IOException io){
            io.printStackTrace();
        }
        finally {
            try{
                fIn.close();
            }
            catch(IOException io){
                io.printStackTrace();
            }
        }
    }
}
