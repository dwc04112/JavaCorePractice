package kr.ac.daegu.yey;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        System.out.println("Java HashCryptoPractice");

        String password = "dddd";
        String salt = String.valueOf(UUID.randomUUID());    // 무작위 문자열 : 회원가입 할 때 생성되어 DB의 salt 컬럼에 insert된다
        String passwordSalt =  password + salt;
        String encodedPassword = "";


        try{
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
            digest.reset();;
            digest.update(passwordSalt.getBytes(StandardCharsets.UTF_8));
            encodedPassword = String.format("%040x",new BigInteger(1,digest.digest()));
        }catch (NoSuchAlgorithmException e){
            e.printStackTrace();
        }

        System.out.println("password = " + password);
        System.out.println("salt = " + salt);
        System.out.println("PasswordSalt = " + passwordSalt);
        System.out.println("encodedPassword = " + encodedPassword);
        System.out.println("saltLength = " + salt.length());
    }
}
