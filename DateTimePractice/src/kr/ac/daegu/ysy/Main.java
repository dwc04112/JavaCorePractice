package kr.ac.daegu.ysy;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {


        //날짜를 직접 지정
        LocalDate targetDate = LocalDate.of(2021,8,30);
        System.out.println(targetDate);

        //현재 시간 출력
        // 로컬 컴퓨터의 현재 시간 정보를 저장한 LocalDate 객체를 리턴.
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        //시간을 직접 지정
        LocalTime targetTime = LocalTime.of(12,33,35,12);   //0.000000012
        System.out.println(targetTime);

        //현재 날짜 & 시간
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        //날짜 &시간 직접 지정
        LocalDateTime targetDateTime = LocalDateTime.of(2021,8,11,16,23,33,222);
        System.out.println(targetDateTime);

        // [2021 - 12 - 1] [10:00:00.000] 에서 [1일] [4시간] [전] - 엔드유저의 입력을 받는 파라미터라면
        // 2021 - 11 - 30 06:00:00.000


        //String date (dbms에서 가져온 값)을 LocalDateTime으로 바꾸려면?
        String date="2021-08-11";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        //위의 date랑 dateTimeFormatter를 아래에 집어넣음. 패턴은 yyyy-MM-dd
        LocalDate parsedDate = LocalDate.parse(date,dateTimeFormatter);
        System.out.println(parsedDate);

        String date2 = "2021-08-11T16:41:31.087";
        LocalDateTime parsedLocalDateTime = LocalDateTime.parse(date2);
        System.out.println("parsedLocalDateTime = " + parsedLocalDateTime);

        System.out.println("=================================================");


        //날짜 더하기 빼기
        LocalDateTime currentDateTimePlus = LocalDateTime.now();
        currentDateTimePlus = currentDateTimePlus.plusDays(2);
        System.out.println(currentDateTimePlus);
        System.out.println(currentDateTimePlus.minusDays(2));


        //날짜 비교예제
        LocalDateTime startDateTime = LocalDateTime.now();
        LocalDateTime endDateTime = LocalDateTime.of(2021,9,11,5,33,50);

        startDateTime.isBefore(endDateTime); //startDate 가 endDate 보다 이전 날짜인지 비교
        startDateTime.isEqual(endDateTime); //동일 날짜인지
        startDateTime.isAfter(endDateTime); //이후날짜인지
        System.out.println(startDateTime.isAfter(endDateTime));


        System.out.println("====================날짜 포맷===================");
        //날짜 포맷
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy년 M월 d일 a h시 m분");

        String nowstring = now.format(dateTimeFormatter1);
        System.out.println(nowstring); //결과 : 2021년 8월 오후 5시 32분

        LocalDateTime now2 = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        String now2string = now.format(dateTimeFormatter2);
        System.out.println(now2string); //결과 : 2021-08-11 05:35:04



        System.out.println("=================================================");

        //날짜 변환
        //LocalDate > String
        LocalDate.of(2021, 12, 12).format(DateTimeFormatter.BASIC_ISO_DATE);

        //String > LocalDate
        LocalDate.parse("2021-12-27");
        LocalDate.parse("20211227", DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(LocalDate.parse("2021-12-27"));

        System.out.println("여기까지 LocalDate String 변환");




        //LocalDateTime > String
        //LocalDate > String 처럼 변환하면 일 까지 출력되더라
        LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));




        //LocalDate > java.sql.Date
        date.valueOf(LocalDate.of(2021,12,27));
        //출력해봄
        System.out.println(date.valueOf(LocalDate.of(2021,12,27)));


        /*
        For example:
    LocalDate date = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
    String text = date.format(formatter);
    LocalDate parsedDate = LocalDate.parse(text, formatter);

All letters 'A' to 'Z' and 'a' to 'z' are reserved as pattern letters. The following pattern letters are defined:
    Symbol  Meaning                     Presentation      Examples
    ------  -------                     ------------      -------
     G       era                         text              AD; Anno Domini; A
     u       year                        year              2004; 04
     y       year-of-era                 year              2004; 04
     D       day-of-year                 number            189
     M/L     month-of-year               number/text       7; 07; Jul; July; J
     d       day-of-month                number            10

     Q/q     quarter-of-year             number/text       3; 03; Q3; 3rd quarter
     Y       week-based-year             year              1996; 96
     w       week-of-week-based-year     number            27
     W       week-of-month               number            4
     E       day-of-week                 text              Tue; Tuesday; T
     e/c     localized day-of-week       number/text       2; 02; Tue; Tuesday; T
     F       week-of-month               number            3

     a       am-pm-of-day                text              PM
     h       clock-hour-of-am-pm (1-12)  number            12
     K       hour-of-am-pm (0-11)        number            0
     k       clock-hour-of-am-pm (1-24)  number            0

     H       hour-of-day (0-23)          number            0
     m       minute-of-hour              number            30
     s       second-of-minute            number            55
     S       fraction-of-second          fraction          978
     A       milli-of-day                number            1234
     n       nano-of-second              number            987654321
     N       nano-of-day                 number            1234000000

     V       time-zone ID                zone-id           America/Los_Angeles; Z; -08:30
     z       time-zone name              zone-name         Pacific Standard Time; PST
     O       localized zone-offset       offset-O          GMT+8; GMT+08:00; UTC-08:00;
     X       zone-offset 'Z' for zero    offset-X          Z; -08; -0830; -08:30; -083015; -08:30:15;
     x       zone-offset                 offset-x          +0000; -08; -0830; -08:30; -083015; -08:30:15;
     Z       zone-offset                 offset-Z          +0000; -0800; -08:00;

     p       pad next                    pad modifier      1

     '       escape for text             delimiter
     ''      single quote                literal           '
     [       optional section start
     ]       optional section end
     #       reserved for future use
     {       reserved for future use
     }       reserved for future use
         */

        }
}
