public class Main {
    public static void main(String[] args) {

        Albero a1 = new Albero(9,
                new Albero(6, null, null),
                new Albero(4,
                        new Albero(5,
                                new Albero(10, null, null),
                                new Albero(8, null, null)),
                        new Albero(12, null, null))
        );

        System.out.println(a1.print());
        System.out.println("Max: " + a1.max());
    }
}