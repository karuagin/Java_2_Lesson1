package homework;

public class Road extends Barrier {
    private int length;

    public Road(String name, int length) {
        super(name);

        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    protected boolean moving(Actions actions) {
        System.out.println("Дорога " + super.getName() + " длиной: " + this.length);

        actions.run();

        if (getLength() <= actions.getRunDistance()) {
            System.out.println("Забег успешный");

            return true;
        } else {
            System.out.println("Забег неудачный");

            return false;
        }
    }
}
