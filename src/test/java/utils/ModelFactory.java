package utils;

import advanced.models.User;

import java.util.UUID;

public class ModelFactory {
    private static final long ID_ONE = 1L;
    public static User userMock(){
        return User.builder()
                .id(ID_ONE)
                .fName("Test first name")
                .lName("Test last name")
                .userName("Test username")
                .password(UUID.randomUUID().toString())
                .build();
    }
}
