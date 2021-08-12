package kr.ac.daegu.ysy;

import java.io.IOException;

//p 477
public class InputStreamTest {
    //InputStream 테스트


    public static void main(String[] args) {
        int var_byte=-1;

        do{
            try{
                System.out.print("입력 : ");
                var_byte = System.in.read();
            }
            catch(IOException io) {
                io.printStackTrace();
            }
            if(var_byte == 10 || var_byte == 13) continue;
            if(var_byte == -1) break;
            System.out.println("읽은 값 : " + (char)var_byte);
        }
        while(true);


    }
}
