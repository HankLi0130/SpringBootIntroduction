package tw.hankli.spring_demo.datasource;


public class MySQL implements DataSource {

    @Override
    public String getTypeName() {
        return "MySQL";
    }

    @Override
    public void connect() {
        System.out.println("MySQL connect!");
    }

    @Override
    public void disconnect() {
        System.out.println("MySQL disconnect!");
    }
}
