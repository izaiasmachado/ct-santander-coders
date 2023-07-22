package exercicio01;

public class CannotLeaveEmptyItem extends Exception {
    public CannotLeaveEmptyItem() {
        super("Não é possível deixar a quantidade de itens igual a zero.");
    }
}
