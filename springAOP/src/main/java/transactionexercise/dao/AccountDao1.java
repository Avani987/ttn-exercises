package transactionexercise.dao;

import org.springframework.jdbc.core.RowMapper;

import transactionexercise.Account;
import transactionexercise.AccountMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class AccountDao1 {

    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Transactional
    public int insert(Account account){

        String insertSql ="INSERT INTO account (account_name, account_balance) VALUES('"+account.getName()+"',"+account.getBalance()+")";
        return jdbcTemplate.update(insertSql);
    }

    @Transactional
    public int update(Account account){

        String updateSql ="UPDATE account SET account_balance ="+account.getBalance()+" where account_name ='"+account.getName()+"'";
        return jdbcTemplate.update(updateSql);
    }

    @Transactional
    public int delete(String accountName){
        String deletesql="DELETE FROM account WHERE account_name='"+accountName+"' ";
        return jdbcTemplate.update(deletesql);
    }

    @Transactional
    public Account select(String accountName) {
        String selectSql = "SELECT * FROM account WHERE account_name ='"+accountName+"'";
        Account account = jdbcTemplate.queryForObject(selectSql,new AccountMapper());
        return account;
    }

    @Transactional
    public List<Account> getAccounts(){
        return getJdbcTemplate().query("select * from account",new RowMapper<Account>(){
            @Override
            public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
                Account account=new Account(rs.getString(1),rs.getLong(2));
                return account;
            }
        });
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

    /*@Transactional(propagation = Propagation.REQUIRED)
    public boolean transfer(User sender,User receiver,int amount){
        String query="update user set balance ='"+(sender.getBalance()-amount)+"' where id='"+sender.getId()+"'";
        String query2="update user set balance ='"+(receiver.getBalance()+amount)+"' where id='"+receiver.getId()+"'";
        int result=jdbcTemplate.update(query);
        int result2=jdbcTemplate.update(query2);
        if(result>0 && result2>0)
            return true;
        return false;
    }*/
}

