package com.designpattern.builderpattern;
/*

 */
public class UserMain {
    public static void main(String[] args) {
        User user = new User.UserBuilder("sanjay","pakale")
                .id(1)
                .age(37)
                .pinCode(591213)
                .phone("9916657109")
                .build();
        System.out.println(user);
    }
}
