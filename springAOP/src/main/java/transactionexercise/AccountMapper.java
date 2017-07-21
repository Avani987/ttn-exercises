package transactionexercise;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class AccountMapper implements RowMapper<Account> {
    public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
        Account account = new Account();
        account.setName(rs.getString("account_name"));
        account.setBalance(rs.getInt("account_balance"));
        return account;
    }
}