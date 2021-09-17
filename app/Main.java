package app;

public class Main {

    public static void main(String[] args) {


        Dilute dilute = new Dilute(
                Action.HOW_MUCH_ALCOHOL,
                96,
                20,
                500
        );

        System.out.println("@ " + dilute.getAction().getName() + " @");
        System.out.println("---- Przed rozcieńczeniem ----");
        System.out.println(dilute.getFirst().getType().getName() + ": " + dilute.getFirst().getValue());
        System.out.println(dilute.getSecond().getType().getName() + ": " + dilute.getSecond().getValue());
        System.out.println(dilute.getThird().getType().getName() + ": " + dilute.getThird().getValue());
        dilute.calculate();
        System.out.println("---- Po rozcieńczeniem ----");
        System.out.println(dilute.getFirst().getType().getName() + ": " + dilute.getFirst().getValue());
        System.out.println(dilute.getSecond().getType().getName() + ": " + dilute.getSecond().getValue());
        System.out.println(dilute.getThird().getType().getName() + ": " + dilute.getThird().getValue());
        Convert convertFirst = new Convert(dilute.getFirst(), Unit.LITR);
        Convert convertSecond = new Convert(dilute.getSecond(), Unit.KILOGRAM);
        Convert convertThird = new Convert(dilute.getThird(), Unit.LITR);
        System.out.println("---- Po konwersji ----");
        System.out.println(dilute.getFirst().getType().getName() + ": " + convertFirst.calculate());
        System.out.println(dilute.getSecond().getType().getName() + ": " + convertSecond.calculate());
        System.out.println(dilute.getThird().getType().getName() + ": " + convertThird.calculate());

    }
}
