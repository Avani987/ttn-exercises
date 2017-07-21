package transactionexercise.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import transactionexercise.Account;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class transferDao {

    JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public int log(Account sender,Account receiver,long amount){
        String query="insert into account_transaction(sender,receiver,balance_transferred) values('"+sender.getName()+"','"+receiver.getName()+"',"+amount+")";
        return jdbcTemplate.update(query);

    }
}
