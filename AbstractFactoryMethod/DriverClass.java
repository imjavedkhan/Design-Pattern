package AbstractFactoryMethod;

public class DriverClass {

    public static void main(String[] args) {

        Computer pc = ComputerFactory.
                getComputer(new PCFactory("2 GB", "500 GB", "2 GHz"));

        Computer server = ComputerFactory.
                getComputer(new ServerFactory("4 GB", "1 TB", "4 GHz"));

        System.out.println("PC: " + pc.print());
        System.out.println("Server: " + server.print());
    }
}
