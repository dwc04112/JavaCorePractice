package kr.ac.daegu.ysy;

import java.io.ByteArrayInputStream;

// p 480
public class ByteArrayInputStreamTest {
    //ByteArrayInputStream 테스트

    public static void main(String[] args) {
        byte[] datas = new byte[]{10,20,30,40};
        ByteArrayInputStream bai = new ByteArrayInputStream(datas);
        int var_readbyte = -1;

        while((var_readbyte = bai.read()) !=-1){
            System.out.print(var_readbyte + " ");
        }
    }
}
