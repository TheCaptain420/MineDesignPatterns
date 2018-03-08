package Strategy;

public class Strategytext {
    public static void main(String[] args) {
        //Tillader et program at have flere måder f.eks. at komme fra A til B.
        //F.eks. bus eller bil.
        //Eller
        //Betalingservice.
        //man kan betale med creditkort, mobilospay eller cash
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));



    }
}
