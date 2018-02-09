package tw.hankli.spring_demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tw.hankli.spring_demo.datasource.DataSource;

@Component(value = "myService")
public class Microservice1 {

    private DataSource mySQL;
    private DataSource oracle;

    @Autowired
    public Microservice1(DataSource mySQL, DataSource oracle) {
        this.mySQL = mySQL;
        this.oracle = oracle;
    }

    public void sayHello(String name) {
        System.out.println("Hello! " + name);
    }

    public void connect() {
        mySQL.connect();
        oracle.connect();
    }

    public void disconnect() {
        mySQL.disconnect();
        oracle.disconnect();
    }
}
