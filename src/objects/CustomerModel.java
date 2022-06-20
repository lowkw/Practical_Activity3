package objects;

public class CustomerModel {

    private int id;
    private String name;
    private String email;
    private String mobile;

    public CustomerModel() {
    }

    public CustomerModel(int id, String name, String email, String mobile) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }
}
