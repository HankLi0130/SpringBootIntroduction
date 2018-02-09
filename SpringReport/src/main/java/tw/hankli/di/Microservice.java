package tw.hankli.di;

import tw.hankli.db.DataSource;
import tw.hankli.db.MySQL;

public class Microservice {

    private DataSource dataSource;

    // 與Microservice緊耦合
    public Microservice() {
        dataSource = new MySQL();
    }

    // Datasource注入
    public Microservice(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public String getUsername(String sql) {
        return dataSource.select(sql);
    }
}
