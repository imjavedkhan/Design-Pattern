package Builder;

public class DriverClass {

    public static void main(String[] args) {
        Details details = new Details.DetailsBuilder("javed","khan")
                .job("developer")
                .phone(12345)
                .build();

        System.out.println(details);
    }
}
