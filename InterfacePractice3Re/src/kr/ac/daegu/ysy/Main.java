package kr.ac.daegu.ysy;

public class Main {


    public static void main(String[] args){
        Connector oracleConnector = ConnectorFactory.getConnector("oracle");
        oracleConnector.connect();
        Connector mySQLConnector = ConnectorFactory.getConnector("mysql");
        mySQLConnector.connect();
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

    public static Connector getConnector (String dbmsName){
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