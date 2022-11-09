package Adapter.example1;

public class DriverClass {

    public static void main(String[] args) {

        Fighter knight = new Knight();

        Wizard wizard = new WizardImpl();

        WizardAdapter wizardAdapter = new WizardAdapter(wizard);

        System.out.println("-----Knight's Action------");
        knight.attack();
        knight.defend();
        knight.escape();

        System.out.println("-----WIZARD's Action------");
        wizardAdapter.attack();
        wizardAdapter.defend();
        wizardAdapter.escape();
    }
}
