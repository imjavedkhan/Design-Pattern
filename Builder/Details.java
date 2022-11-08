package Builder;

public class Details {

    private final String firstName;
    private final String lastName;
    private final String job;
    private final int phone;

    private Details(DetailsBuilder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.job = builder.job;
        this.phone = builder.phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getJob() {
        return job;
    }

    public int getPhone() {
        return phone;
    }



    @Override
    public String toString() {
        return "Details{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", job='" + job + '\'' +
                ", phone=" + phone +
                '}';
    }

     static class DetailsBuilder {

        private final String firstName;
        private final String lastName;
        private String job;
        private int phone;

        public DetailsBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public DetailsBuilder job(String job){
            this.job = job;
            return this;
        }

        public DetailsBuilder phone(int phone){
            this.phone = phone;
            return this;
        }

        public Details build(){
            return new Details(this);
        }
    }
}
