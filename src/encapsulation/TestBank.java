package encapsulation;

public class TestBank {
    public static void main(String[] args) {
        State state = new State();
        Account laxmi = new Account();
        laxmi.accHoldername = "Laxmi";
        laxmi.state = state.getMh();
        //state.setMh("Madhya Pradesh");
        System.out.println(laxmi.accHoldername + " " + laxmi.state);


        Account rushi = new Account();
        rushi.accHoldername = "Rushikesh";
        rushi.state = state.getMh();
        System.out.println(rushi.accHoldername + " " + rushi.state);
    }
}
