package kr.ac.daegu.ysy;
//p 487

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Main {
    //ByteArrayOutPutStream 테스트

    public static void main(String[] args) {
        String msg = "ByteArrayOutputStream test";
        ByteArrayOutputStream bao = null;

        try{
            bao = new ByteArrayOutputStream();
            //bao는 ByteArrayOutPutStream 타입 변수
            //ByteArrayOutputStream : Byte 계열 데이터를 출력하는 기능
            bao.write(msg.getBytes());  //bao 문자열을 바이트 배열로 메모리에 출력
            System.out.println("bao = " + bao);
        }catch (IOException io){
            io.printStackTrace();
        }
        finally {
            try{
                bao.close();
            }
            catch (IOException io){
                io.printStackTrace();
            }
        }

    }
}
