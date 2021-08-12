package kr.ac.daegu.ysy;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

//p 481~483
public class SequenceInputStreamTest {
    //SequenceInputStream 테스트
    public static void main(String[] args) {

        FileInputStream fIn1 = null;
        FileInputStream fIn2 = null;
        FileInputStream fIn3 = null;
        SequenceInputStream si1 = null;
        SequenceInputStream si2 = null;

        try{
            fIn1 = new FileInputStream("test1.txt");
            fIn2 = new FileInputStream("test2.txt");
            fIn3 = new FileInputStream("test3.txt");

            Vector v = new Vector();
            v.add(fIn1);
            v.add(fIn2);
            v.add(fIn3);

            Enumeration fIns =v.elements();
            si1 = new SequenceInputStream(fIns);

            int var_readbyte = -1;
            while((var_readbyte = si1.read()) !=-1){
                System.out.print((char)var_readbyte);
            }
            System.out.println();

            fIn1 = new FileInputStream("test1.txt");
            fIn2 = new FileInputStream("test2.txt");
            si2 = new SequenceInputStream(fIn1, fIn2);
            var_readbyte = -1;
            while((var_readbyte = si2.read()) !=-1){
                System.out.print((char)var_readbyte);
            }

        }
        catch (IOException io){
            io.printStackTrace();
        }
        finally {
            try{
                si1.close();
                si2.close();
            }catch (IOException io){
                io.printStackTrace();
            }
        }

    }
}
