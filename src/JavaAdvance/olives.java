package JavaAdvance;

public class Olive {

    public OliveName oliveName;
    public OliveColor color;

    public Olive() {
    }

    public Olive(OliveName oliveName, OliveColor color) {
        this.oliveName = oliveName;
        this.color = color;
    }

    @Override
    public String toString() {
        return "oliveName: " + this.oliveName.toString() +
                ", color: " + this.color.toString();
    }

    public enum OliveName {
        KALAMATA("Kalamata"), LIGURIO("Ligurio"),
        PICHOLINE("Picholine"), GOLDEN("Golden");

        private String nameAsString;

        private OliveName(String nameAsString) {
            this.nameAsString = nameAsString;
        }

        @Override
        public String toString() {
            return this.nameAsString;
        }
    }
    public enum OliveColor {
        BLACK("Black"), GREEN("Green"), GOLDEN("Golden");

        private String colorAsString;

        private OliveColor(String colorAsString) {
            this.colorAsString = colorAsString;
        }

        @Override
        public String toString() {
            return this.colorAsString;
        }
    }

}
