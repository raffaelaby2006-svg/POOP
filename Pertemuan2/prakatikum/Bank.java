
import java.util.LinkedHashMap;
import java.util.Map;

public class Bank {
    private Map<String, Account> accounts = new LinkedHashMap<>();
    private int count;

    public boolean addAccount(Account account){
        if(accounts.containsKey(account.getAccountNumber())){
            return false;
        }
        accounts.put(account.getAccountNumber(),account);
        return true;
    }

    public Account findAccount(String accountNumber){
        return accounts.get(accountNumber);
    }
//ga masuk
    public void printAllAccount(){
        for(Account acc : accounts.values()){
            acc.printInfo();
        }
    }
    
    public void printMonthlyFee(){
        for(Account acc : accounts.values() ){
            System.out.println(acc.getAccountNumber() + " for" + acc.monthlyFee());
        }
    }
    
    public void procesMontEnd(){
        for (Account acc : accounts.values()){
            if (acc instanceof InterestBearing bearing){
                bearing.applyInterest();
                System.out.println(acc.getAccountNumber()+ "interest applied, new balance: " + acc.getBalance());
            }
            System.out.println(acc.getAccountNumber() + " monthly fee: " + acc.monthlyFee());
        }
    }// ini lagi 
    public void printHistory(String accountNumber){
        Account acc = findAccount(accountNumber);
        if(acc == null){
            System.out.println("Account not found: " + accountNumber);
            return;
        }
        for(Transaction t : acc.getHistory()){
            System.out.println(accountNumber + " " + t);
        }
    }
}
