package polymorphism;

public class Test {

    public static void main(String[] args) {
        /*SbiBank sbiBank = new SbiBank();
        sbiBank.calculateRoi();*/

        AxisBank axisBank = new AxisBank();
        axisBank.calculateRoi();
        axisBank.trading();

        /*IciciBank iciciBank = new IciciBank();
        iciciBank.calculateRoi();*/
    }
}
