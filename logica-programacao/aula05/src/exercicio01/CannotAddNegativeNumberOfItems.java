package exercicio01;

public class CannotAddNegativeNumberOfItems extends Exception {
    public CannotAddNegativeNumberOfItems() {
        super("Não é possível comprar uma quantidade negativa de itens.");
    }
}
