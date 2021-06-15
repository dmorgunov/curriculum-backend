package dm.dev.curriculum.model;

import lombok.Data;

@Data
public class UserAccount {
    private int userId;
    private String userEmail;
    private String userPassword;
    private String userName;
    private UserType userType;

}
