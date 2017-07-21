package transactionexercise.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import transactionexercise.Account;
import transactionexercise.AccountMapper;

public class AccountDao extends JdbcDaoSupport{

    public void insert(Account account){

        String insertSql ="INSERT INTO account (account_name, account_balance) VALUES('"+account.getName()+"',"+account.getBalance()+")";
        getJdbcTemplate().update(insertSql);
    }

    public void update(Account account){

        String updateSql ="UPDATE account SET account_balance ="+account.getBalance()+" where account_name ='"+account.getName()+"'";
        getJdbcTemplate().update(updateSql);
    }

    public Account select(String accountName) {
        String selectSql = "SELECT * FROM account WHERE account_name ='"+accountName+"'";
        Account account = getJdbcTemplate().queryForObject(selectSql,new AccountMapper());
        return account;
    }

    public List<Account> getAccounts(){
        return getJdbcTemplate().query("select * from account",new RowMapper<Account>(){
            @Override
            public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
                Account account=new Account(rs.getString(1),rs.getLong(2));
                return account;
            }
        });
    }

    public int delete(String accountName){
        String deletesql="DELETE FROM account WHERE account_name='"+accountName+"' ";
        return getJdbcTemplate().update(deletesql);
    }

    /*private class AccountRowMapper implements RowMapper<Account>{

        @Override
        public Account mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
            Account account = new Account();
            account.setName(resultSet.getString("account_name"));
            account.setBalance(resultSet.getLong("account_balance"));
            return account;
        }

    }*/

}
