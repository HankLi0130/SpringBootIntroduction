package tw.hankli.container;

import tw.hankli.db.DataSource;
import tw.hankli.db.MySQL;
import tw.hankli.db.Oracle;

public class Container {

    public static DataSource getMySQL() {
        return new MySQL();
    }

    public static DataSource getOracle() {
        return new Oracle();
    }
}
