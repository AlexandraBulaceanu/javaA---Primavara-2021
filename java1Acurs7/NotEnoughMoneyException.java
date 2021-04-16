public class NotEnoughMoneyException extends Exception {
    public NotEnoughMoneyException() {
        super("Aceasta este o exceptie checked => trebuie sa fie trata sau propagata, altfel crapa la compilare!");
    }
}