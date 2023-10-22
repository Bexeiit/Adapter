public class Adapter extends EuroToTenge implements DollarToTenge{

    @Override
    public void course() {
        checkCourse();
    }

    @Override
    public void exchange() {
        exchangeValuto();
    }

    @Override
    public void toTenge() {
        Tengege();
    }
}
