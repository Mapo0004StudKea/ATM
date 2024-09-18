package transaction.src.security.src.transaction;

public interface ITransactionProcessor {

    boolean doTransaction(double amount, Object account);

}
