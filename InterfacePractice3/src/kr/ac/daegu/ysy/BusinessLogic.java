package kr.ac.daegu.ysy;
//p 274 ~ 275
public class BusinessLogic {
    // 웹 어플리케이션이 실제 비즈니스 로직 (DB의 데이터에 따라 처리를 달리 해야하는 경우) 을 수행하는 코드.
    // < 팩토리 패턴 >
    //getConnector 호출해서 값을 하나씩 줘서 하나씩 생성. 그래서 팩토리 패턴이다
    public static void main(String[] args){
        Connector oracleConnector = ConnectorFactory.getConnector("oracle");
        oracleConnector.connect();
        Connector mySQLConnector = ConnectorFactory.getConnector("mysql");
        mySQLConnector.connect();

        //인터페이스 - 인터페이스 (구체적으로 어떻게 돌아가는지 ) 구현 객체 : 부조건 존재하게 되어있음

        // static remind
        // 참조형 object(객체) = 런타임 에서 쓸 수 있는 방법 2가지
        // 1. new생성자() : 인스턴스
        // 2. static 메소드 , 멤버 변수
        // 인스턴스끼리 공유
    }
}
interface Connector{
    void connect();
}

class OracleConnector implements Connector{

    @Override
    public void connect() {
        System.out.println("Oracle 연결됨");
    }
}


class MySQLConnector implements Connector{

    @Override
    public void connect() {
        System.out.println("mySQL 연결됨");
    }
}


class ConnectorFactory{

    public static Connector getConnector (String dbmsName){ //비즈니스 로직으로 호출되어 값을받음. oracle or mysql
        //static 바로 메모리에 올려주어서 바로 쓸수있다
        Connector connector = null;

        if(dbmsName.contentEquals("oracle")){
            connector = new OracleConnector();
        }
        else if(dbmsName.contentEquals("mysql")){
            connector = new MySQLConnector();
        }

        return connector;
    }
}




