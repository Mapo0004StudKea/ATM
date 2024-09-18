package transaction.src.security;

public interface ISecuritySystem {
    boolean authenticate(String correctPin, String pin);
}
