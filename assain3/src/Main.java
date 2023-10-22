public class Main {
    public static void main(String[] args) {
        DollarToTenge dollarToTenge = new Adapter();

        dollarToTenge.course();
        dollarToTenge.exchange();
        dollarToTenge.toTenge();
    }
}