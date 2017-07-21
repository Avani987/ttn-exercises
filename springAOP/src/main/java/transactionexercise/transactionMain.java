package transactionexercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import transactionexercise.service.AccountService;
import transactionexercise.service.AccountService1;

import java.util.List;

public class transactionMain {

        public static void main(String[] args) throws Exception {

            ApplicationContext context = new ClassPathXmlApplicationContext("transactional-spring-config.xml");
            AccountService accountService = (AccountService) context.getBean("accountService");

            ApplicationContext context1 = new ClassPathXmlApplicationContext("transactional-spring-config1.xml");
            AccountService1 accountService1 = (AccountService1) context1.getBean("accountService");

            Account fromAccount = new Account("avani",1000);
            Account toAccount = new Account("sara",2000);

            //Question 2 CRUD operations

            //Create
            accountService.createAccount(fromAccount);
            accountService.createAccount(toAccount);
            accountService.createAccount(new Account("peter",123444));
            accountService.createAccount(new Account("xyz",20988));

            //Read
            List<Account> accounts= accountService.getAccounts();
            for(Account a: accounts){
                System.out.println(a);
            }

            //Update
            accountService.updateAccount(fromAccount);

            //Delete
            accountService.deleteAccount("peter");

            //Question 3 execution
            long transferAmount = 500;
            System.out.println("\n Using Programmatic Transaction : ");
            System.out.println("Transferring " + transferAmount + " from account " + fromAccount.getName() + " to account " + toAccount.getName());
            accountService.transferFunds(fromAccount, toAccount, transferAmount);
            System.out.println("After transfer :");
            Account a=accountService.getAccount(fromAccount.getName());
            System.out.println(a);
            Account a1=accountService.getAccount(fromAccount.getName());
            System.out.println(a1);

            //Question 4 and 6
            accountService1.transferFunds(fromAccount,toAccount,transferAmount);

        }


    }

