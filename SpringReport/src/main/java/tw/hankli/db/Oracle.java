package tw.hankli.db;

public class Oracle implements DataSource {

    @Override
    public void connect() {
        System.out.println("Oracle connect");
    }

    @Override
    public void disconnect() {
        System.out.println("Oracle disconnect");
    }

    @Override
    public String select(String sql) {
        return null;
    }
}
