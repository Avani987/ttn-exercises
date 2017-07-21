package transactionexercise.service;

import transactionexercise.dao.transferDao;
import transactionexercise.Account;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class transferLogService {

    private transferDao transfer;

    public transferDao getTransfer() {
        return transfer;
    }

    public void setTransfer(transferDao transfer) {
        this.transfer = transfer;
    }

    @Transactional(propagation = Propagation.NESTED,noRollbackFor = Exception.class)
    public void logTransaction(Account sender,Account receiver,long amount){
        System.out.println("Logging in transaction table");
        transfer.log(sender,receiver,amount);
        throw new RuntimeException(); // to log entry even if exception occurs
    }


}
