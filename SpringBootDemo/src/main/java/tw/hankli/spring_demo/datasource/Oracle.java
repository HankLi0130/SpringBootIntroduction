package tw.hankli.spring_demo.datasource;


public class Oracle implements DataSource {

    @Override
    public String getTypeName() {
        return "Oracle";
    }

    @Override
    public void connect() {
        System.out.println("Oracle connect!");
    }

    @Override
    public void disconnect() {
        System.out.println("Oracle disconnect!");
    }
}
