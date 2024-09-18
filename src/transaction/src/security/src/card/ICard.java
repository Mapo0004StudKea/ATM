package transaction.src.security.src.card;


public interface ICard {
    String getCardNumber();
    String getPin();
    IAccount getAccount();
}