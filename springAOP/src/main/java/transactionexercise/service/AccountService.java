/*Service class for programatic transaction-Question 2 */

package transactionexercise.service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;
import transactionexercise.Account;
import transactionexercise.dao.AccountDao;

import java.util.List;

public class AccountService {

    private AccountDao accountDao;
    private TransactionTemplate transactionTemplate;

    public AccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public TransactionTemplate getTransactionTemplate() {
        return transactionTemplate;
    }

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    public void createAccount(Account account) {
        accountDao.insert(account);
    }

    public List<Account> getAccounts() {
        return accountDao.getAccounts();
    }

    public Account getAccount(String accountName) {
        return accountDao.select(accountName);
    }

    public void deleteAccount(String accountName) {
        accountDao.delete(accountName);
    }

    public void updateAccount(Account accountName) {
        accountDao.update(accountName);
    }


    public void transferFunds(final Account fromAccount,
                              final Account toAccount, final long transferAmount) {

        getTransactionTemplate().execute(new TransactionCallback<Void>() {
            @Override
            public Void doInTransaction(TransactionStatus transactionStatus) {
                fromAccount.debit(transferAmount);
                toAccount.credit(transferAmount);
                getAccountDao().update(fromAccount);
                getAccountDao().update(toAccount);
                return null;
            }
        });

    }


}