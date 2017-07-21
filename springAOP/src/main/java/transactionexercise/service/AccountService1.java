package transactionexercise.service;


    import org.springframework.transaction.annotation.Propagation;
    import org.springframework.transaction.annotation.Transactional;
    import transactionexercise.Account;
    import transactionexercise.dao.AccountDao1;

    import java.util.List;

/*@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)*/
    public class AccountService1 {

        private AccountDao1 accountDao;
        private transferLogService loggingService;

    public transferLogService getLoggingService() {
        return loggingService;
    }

    public void setLoggingService(transferLogService loggingService) {
        this.loggingService = loggingService;
    }


        public AccountDao1 getAccountDao() {
            return accountDao;
        }

        public void setAccountDao(AccountDao1 accountDao) {
            this.accountDao = accountDao;
        }

        @Transactional
        public void create(Account account) {
            getAccountDao().insert(account);
        }

        @Transactional(readOnly = true) //Question 5 solution
        public List<Account> getAccounts() {
        return accountDao.getAccounts();
    }

        @Transactional
        public Account getAccount(String accountName) {
        return accountDao.select(accountName);
        }

        /*@Transactional
        public void deleteAccount(String accountName) {
        accountDao.delete(accountName);
    }

        @Transactional
        public void updateAccount(String accountName) {
        accountDao.update(accountName);
    }*/


    @Transactional(propagation=Propagation.REQUIRED, readOnly=false)
        public void transferFunds(final Account fromAccount,final Account toAccount, final long transferAmount) {
            fromAccount.debit(transferAmount);
            toAccount.credit(transferAmount);
            getAccountDao().update(fromAccount);
            getAccountDao().update(toAccount);
        System.out.println("\n Using Transaction Annotations : ");
        System.out.println("Transfer of Rs."+transferAmount+" being done from "+fromAccount.getName()+" to "+toAccount.getName());
        try{
            loggingService.logTransaction(fromAccount,toAccount,transferAmount);
        }
        catch(Exception e){
            System.out.println(e);
        }
        }

       /* @Transactional(propagation=Propagation.REQUIRED, readOnly=false, rollbackFor=Exception.class)
        public void transferFundsException(final Account fromAccount,
                                           final Account toAccount, final long transferAmount) throws Exception {
            fromAccount.debit(transferAmount);
            toAccount.credit(transferAmount);
            getAccountDao().update(fromAccount.getName());
            getAccountDao().update(toAccount.getName());
// Simulate an exception that occurs during funds transfer
            throw new Exception();
        }*/


    }
