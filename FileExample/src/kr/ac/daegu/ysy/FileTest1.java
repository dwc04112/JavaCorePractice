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
        File file = new File("C:\\"); //파일객체 생성 > c드라이브 경로 이용 : \\
        String [] files = file.list();      // C드라이브 안에 존재하는 모든 파일이름을 String[] 타입으로 얻어옴
        for(String fileName : files) {
            File subFile = new File(file, fileName);
            if (file.isDirectory()) {       //디렉토리 일경우
                System.out.println("디렉터리 이름 : " + fileName);
            } else {                        //아닐경우 = file
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


        File makeFile = new File("C:\\data\\testFile.txt");
        try{
            makeFile.createNewFile();
        }catch (IOException e){
            e.printStackTrace();
        }
        if(makeFile.exists()){
            System.out.println("makeFile이 생성됨됨");
        }

        File renameFile = new File("C:\\data\\testFile2.txt");
        makeFile.renameTo(renameFile);
        if(renameFile.exists()){
            System.out.println("makeFile의 이름이 변경됨");
        }

        if(renameFile.delete()){
            System.out.println("renameFile이 제거됨");
        }

    }
}
