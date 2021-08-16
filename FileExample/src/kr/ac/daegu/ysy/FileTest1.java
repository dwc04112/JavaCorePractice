package kr.ac.daegu.ysy;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

//p 471 file예제
public class FileTest1 {

    public static class ImageNameFilter implements FilenameFilter{

        @Override
        public boolean accept(File dir, String name) {
            return name.endsWith(".jpg");
        }
    }

    // File 클래스의 메소드 사용하기

    public static void main(String[] args) {
        System.out.println("C: 드라이브의 전체 파일 출력");
        File file = new File("C:\\");
        //(윈도우용 경로 설정) 파일객체 생성 > c드라이브 경로 이용 : \\ 사용
        // pathname에 위치한 파일/디렉토리 들의 정보(디렉토리 인지? 파일 이름들..) 들을 모두 가져와 file에 넣음
        String [] files = file.list();      // C드라이브 안에 존재하는 모든 (위에 file) 파일이름을 String[] 타입으로 얻어옴


        for(String fileName : files) {
            File subFile = new File(file, fileName);    //pathname(file) 에 속한 파일이름 fileName 을 생성자 파라미터로 제공하여
            //한 개의 파일 객체를 메모리에 적재한다
            if (subFile.isDirectory()) {       // << 디렉토리 일경우
                System.out.println("디렉터리 이름 : " + fileName);
            } else {                           //아닐경우 = file
                System.out.println("파일이름 : " + fileName + ", 파일 크기 : " + subFile.length()
                        + "byte" + ", 파일 경로 : " + subFile.getAbsolutePath());
            }

        }

        System.out.println("C: 드라이브의 이미지 파일만 출력");
        String [] imageFiles = file.list(new ImageNameFilter());        //jpg로 끝나는 파일 이름 String[] 으로
            for(String fileName:imageFiles){
                File subFile = new File(file,fileName);
                System.out.println("파일 이름 : " +fileName + ", 파일 경로 : "
                + subFile.getAbsolutePath());
            }


        File makeFile = new File("C:\\javaExample\\JavaCorePractice\\FileExample\\test\\testFile2.txt");
        try{
            makeFile.createNewFile();     //java 언어에서는 일부 객체의 메소드에 한해 강제적인 예외처리를 요구 (파일접근, db관련...)
                                          //java 시스템 바깥의 시스템에 접근해서 뭔가 하고싶을때
        }catch (IOException e){          //파일 처리의 경우 담당하는 예외
            e.printStackTrace();
        }

        if(makeFile.exists()){
            System.out.println("makeFile이 생성됨됨");
        }

        File renameFile = new File("C:\\javaExample\\JavaCorePractice\\FileExample\\test\\testFile.txt");
        makeFile.renameTo(renameFile);

        if(renameFile.exists()){
            System.out.println("makeFile의 이름이 변경됨");
        }

        if(renameFile.delete()){
            System.out.println("renameFile이 제거됨");
        }

    }
}
