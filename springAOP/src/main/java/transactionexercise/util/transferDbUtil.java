/*Question 1- To Create account_transaction table with sender,receiver, balance_transferred fields.*/

package transactionexercise.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

public class transferDbUtil {

    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void initialize(){
        DataSource dataSource = getDataSource();
        try {
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE account_transaction (sender VARCHAR(50),receiver VARCHAR(50), balance_transferred long)");
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


