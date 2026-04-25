public class ComputerFactory {
    private static final Add add = new Add();
    private static final Sub sub = new Sub();

    public static Computable getComputer(char symbol) {
        switch (symbol) {
            case '+':
                return add;
            case '-':
                return sub;
            default:
                throw new IllegalArgumentException();
        }
    }
}
