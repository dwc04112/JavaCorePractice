package kr.ac.daegu.ysy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

//p 485  ex3
public class FileOutputStreamTest {
    //FileOutputStream 테스트

    public static void main(String[] args) {
        FileOutputStream fo = null;
        //FileOutputStream = 특정 대상 파일로 내용을 출력
        String msg = "안녕안녕안녕안녕";
        byte [] byteArray = msg.getBytes(StandardCharsets.UTF_8);
        //문자열(String 타입) msg를 byte로 가져온다 .
        // StandarCharsets.UTF_8을 넣어서 안전하게 한글도 사용가능하게


        try{
            //상대경로를 지정할때 어떻게 테스트 해가면서 쓸지? : ./ 찍어서 실제 동작이 어떻게 되는지 확인
            // append 의 뜻 : 기존 컨텐츠에 ++ 아래 예제 있음!!
            fo = new FileOutputStream(".\\FileExample6\\demo\\안녕로봇.txt",true);
            //상대경로 : 호출하는 코드의 위치를 기준으로 한다
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

        //append 설명
        StringBuilder sb = new StringBuilder();
        sb.append("hihi");
        sb.append("방가방가");
        System.out.println(sb);
        //뒤에 append가 추가됨

        String str = "hihi";
        str = str + "방가방가";
        System.out.println(str);
    }
}
