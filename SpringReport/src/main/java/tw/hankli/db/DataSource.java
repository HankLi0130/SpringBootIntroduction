package tw.hankli.db;

public interface DataSource {

    // 連線
    void connect();

    // 斷線
    void disconnect();

    // 查詢
    String select(String sql);
}
