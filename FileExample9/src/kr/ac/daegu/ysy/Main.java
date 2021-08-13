package kr.ac.daegu.ysy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//p506~ 507
public class Main {

    public static void main(String[] args) {
//        FileExample7 : 506p 507p 'Buffer'
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(".\\FileExample9\\demo\\bufferedWriter.txt");
            bw = new BufferedWriter(fw, 10);    //sz= size
            bw.write('A');                       //하나의 데이터 byte
            bw.write('B');
            bw.write('C');
            bw.write('D');

            Scanner sc = new Scanner(System.in);
            String input = null;
            do {
                System.out.println("입력하시오.");
                input = sc.next();
                if(input.equals("end")){
                    System.exit(0); // "end" 입력 시 강제종료
                }
            } while(!input.equals("Q")); // "Q" 입력 받을 때 까지 계속 반복

            // 데이터가 버퍼 사이즈만큼 전부 채워 지길 기다렸다가 flush 하는 경우 (비움)
            bw.flush();
            // 여기서 q를 입력받아야 flush로 넘어가서 위의ABCD가 bufferWriter.txt 에 입력된다


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
            } catch (IOException e ){
                e.printStackTrace();
            }
        }

    }
}
