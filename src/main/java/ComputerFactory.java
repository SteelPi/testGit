public class ComputerFactory {
    private static final Add add = new Add();
    private static final Sub sub = new Sub();

    public static Computable getComputer(String symbol)
            throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        return (Computable) Class.forName(symbol).newInstance();
    }
}
