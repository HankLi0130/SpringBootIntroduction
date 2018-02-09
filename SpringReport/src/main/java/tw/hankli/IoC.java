package tw.hankli;

import tw.hankli.db.DataSource;
import tw.hankli.db.MySQL;
import tw.hankli.db.Oracle;

public class IoC {

    public static void main(String[] args) {

        // 一般
        MySQL mySQL = new MySQL();
        mySQL.connect();
        mySQL.disconnect();

        // 改變資料庫
        Oracle oracle = new Oracle();
        oracle.connect();
        oracle.disconnect();


        // IoC
        DataSource dataSource1 = new MySQL();
        dataSource1.connect();
        dataSource1.disconnect();

        DataSource dataSource2 = new Oracle();
        dataSource2.connect();
        dataSource2.disconnect();
    }
}
