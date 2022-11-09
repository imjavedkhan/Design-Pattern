package Adapter.example1;

public class Knight implements Fighter {

    @Override
    public void attack() {
        System.out.println("Knight attacking");
    }

    @Override
    public void defend() {
        System.out.println("Knight defend");
    }

    @Override
    public void escape() {
        System.out.println("Knight escape");
    }
}
