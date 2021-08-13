package kr.ac.daegu.ysy;

import java.io.*;

//p490
public class Main {

    //DataInputStream, DataOutputStream 테스트

    public static void main(String[] args) {

        FileOutputStream fo = null;
        FileInputStream fi = null;
        DataOutputStream dos = null;
        DataInputStream dis = null;

        try{

            fo= new FileOutputStream(".\\FileExample8\\demo\\dataFile.txt");    //파일 만들기
            //파일이 가지고있는 컨텐츠 : 글, 사진, 영상... 이 컨텐츠들은 byte[] 배열의 모음이다.

            dos= new DataOutputStream(fo);  // java -> file (OUTPUT) 파일로 보내기

            dos.writeShort(-1);     // short : 2byte 자료형. 0~65535
            dos.writeByte(2);   //16진수
            dos.writeByte(3);   //16진수
            dos.writeByte(4);   //16진수
            dos.writeDouble(3.14);
            dos.writeLong(30);
            dos.writeUTF("datastream test");

            fi= new FileInputStream(".\\FileExample8\\demo\\dataFile.txt");
            dis= new DataInputStream(fi);   // java <- file (INPUT)

            System.out.println(dis.readUnsignedShort());  // 65535 : unsigned(음수없음), short(2byte, 2^16)
            //sign : 부호가 있는것 : 1byte , 2^7    unsigned 의 1 byte는 2^8 (부호자리가 필요없어서)

            System.out.println(dis.readByte());
            //readByte() : Byte - 파일이 가지고있는 컨텐츠의 최소단위인데, 이 최소단위 '한개' 를 읽어온다
            dis.skip(1);                         //이 자리의(readByte) byte n개를 스킵 : 3이 스킵된다
            System.out.println(dis.readByte());
            System.out.println(dis.readDouble());
            System.out.println(dis.readLong());
            System.out.println(dis.readUTF());
        }
        catch (IOException io){
            io.printStackTrace();
        }
        finally {
            try{
                fi.close();
                fo.close();
                dis.close();
                dos.close();
            }
            catch (IOException io){
                io.printStackTrace();
            }
        }
    }
}
