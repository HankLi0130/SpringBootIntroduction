package tw.hankli.spring_demo.datasource;

public interface DataSource {

    String getTypeName();

    void connect();

    void disconnect();
}
