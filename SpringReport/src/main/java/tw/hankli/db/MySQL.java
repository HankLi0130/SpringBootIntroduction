package tw.hankli.db;

public class MySQL implements DataSource {

    public void connect() {
        System.out.println("MySQL connect");
    }

    public void disconnect() {
        System.out.println("MySQL disconnect");
    }

    @Override
    public String select(String sql) {
        return null;
    }
}
