package transaction.src.security.src.security;

public interface ISecuritySystem {
    boolean authenticate(String correctPin, String pin);
}
