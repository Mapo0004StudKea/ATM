package transaction.src.card;


public interface ICard {
    String getCardNumber();
    String getPin();
    IAccount getAccount();
}