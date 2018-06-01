public class Bee extends Insect implements Flying {

    @Override
    public int wings() {
        return 0;
    }

    @Override
    public boolean takeOff() {
        return false;
    }

    @Override
    public boolean land() {
        return false;
    }
}
