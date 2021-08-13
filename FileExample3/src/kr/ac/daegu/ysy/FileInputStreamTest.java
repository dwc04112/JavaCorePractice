package kr.ac.daegu.ysy;

import java.io.FileInputStream;
import java.io.IOException;

//p 478 479
//예제의 의도 : 파일의 컨텐츠를 어떻게 핸들링?
public class FileInputStreamTest {

    //FileInputStream 테스트

    public static void main(String[] args) {
        FileInputStream fIn=null;

        try{
            // C, C++ : 메모리에 객체를 적재 명령을 하면, 런타임에서 해당 객체를 다 쓰고 난 뒤에 '해제'하는 코드를 넣어야한다
            // Java : GARBEGE COLLECTOR (쓰레기 수집기) : new Instance(); 객체를 메모리에 적재하고 GC가 '알아서'메모리 해제
            // C, C++ 에서 해야하는 해제 작업을 안해도 된다
            fIn = new FileInputStream("C:\\javaExample\\JavaCorePractice\\FileExample3\\demo\\test.txt");
            //메모리(RAM의) 자원을 고정해서 점유
            //FileEx1과 다르게 파일의 내용을 어떻게 핸들링 할것인가?
        }
        //File을 정식적으로 읽지 못했다면 IOException이 발생
        //파일을 찾았으나 읽지 못했을 경우
        catch (IOException io){     //문제발생시 빨리 알수있게 해주는 장치라고 이해
            io.printStackTrace();   //호출하면 로그에 Stack trace가 출력
        }

        int var_read = -1;

        try{
            while((var_read = fIn.read()) !=-1){
                //결과값이 -1인지 아닌지 : 입력되는 값이 -1이 돌면 빠져나간다
                System.out.print((char)var_read);
            }
        }
        catch (IOException io){
            io.printStackTrace();
        }
        //try 블록에서 예외발생이 되던 안되던 실행되는 블록 finally
        finally {
            try{
                fIn.close();    //자원반납
            }
            catch(IOException io){
                io.printStackTrace();
            }
        }
    }
}
