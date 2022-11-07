package AbstractFactoryMethod;

public interface Computer {
    String getRAM();
    String getHDD();
    String getCPU();

    default String print(){
        return "RAM = " + this.getRAM() + ", HDD  = " + this.getHDD() + ", CPU = " + this.getCPU();
    }
}
