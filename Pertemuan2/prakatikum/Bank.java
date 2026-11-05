

public class Bank {
    private Account[] accounts;
    private int count;

    public Bank(int capacity){
        accounts = new Account[capacity];
        count = 0;
    }

    public boolean addAccount(Account account){
        if(count >= accounts.length){
            return false;
        }
        accounts[count] = account;
        count++;
        return true;
    }

    public Account findAccount(String accountNumber)throws AccountNotFoundException{
        for(int i = 0; i<count; i++){
            if(accounts[i].getAccountNumber().equals(accountNumber)){
                return accounts[i];
            }
        }
        throw new AccountNotFoundException("Account not found: " +  accountNumber);
    }

    public Account[] findAccountsByOwnerName(String name){
        int matchCount = 0;
        for (int i = 0;  i< count; i++){
            if(accounts[i].getOwner().getName().equals(name)){
                matchCount++;
            }
        }
        Account[] matches = new Account[matchCount];
        int index = 0;
        for (int i = 0; i <count; i++ ){
            if(accounts[i].getOwner().getName().equals(name)){
                matches [index] = accounts[i];
                index++;
            }
        }
        return matches;
    }

    public void printAllAccount(){
        for(int i = 0; i < count; i++){
            accounts[i].printInfo();
        }
    }
    
    public void printMonthlyFee(){
        for(int i = 0; i<count; i++){
            System.out.println(accounts[i].getAccountNumber() + "fee : " + accounts[i].monthlyFee());
        }
    }
    
    public void procesMontEnd(){
        for (int i = 0; i < count; i++){
            Account acc = accounts[i];
            if (acc instanceof InterestBearing bearing){
                bearing.applyInterest();
                System.out.println(acc.getAccountNumber()+ "interest applied, new balance: " + acc.getBalance());
            }
            System.out.println(acc.getAccountNumber() + " monthly fee: " + acc.monthlyFee());
        }
    }
    public void printAuditLog(){
        for (int i = 0; i < count; i++){
            Account acc = accounts[i];

            if(acc instanceof Auditable){
            Auditable audit = (Auditable) acc;
            System.out.println(acc.getAccountNumber() + ": " + audit.auditLog());
        
            }
        }
    }
}
