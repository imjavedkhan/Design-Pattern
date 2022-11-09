package Adapter.example1;

public class WizardImpl implements Wizard {
    @Override
    public void castSpell() {
        System.out.println("Fireball is coming...");
    }

    @Override
    public void shield() {
        System.out.println("Wizard casted shield...");
    }

    @Override
    public void openPortal() {
        System.out.println("Wizard open portal...");
    }
}
