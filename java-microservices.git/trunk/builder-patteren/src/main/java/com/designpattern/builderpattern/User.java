package com.designpattern.builderpattern;


public class User {
    private final int id;
    private String firstName;
    private String lastName;
    private int age;
    private int pinCode;
    private String phone;

    private User(UserBuilder userBuilder) {
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.age = userBuilder.age;
        this.id = userBuilder.id;
        this.phone = userBuilder.phone;
        this.pinCode = userBuilder.pinCode;
    }

    public static class UserBuilder {
        private int id;
        private String firstName;
        private String lastName;
        private int age;
        private int pinCode;
        private String phone;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder pinCode(int pinCode) {
            this.pinCode = pinCode;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder id(int id) {
            this.id = id;
            return this;
        }

        public User build() {
            User user = new User(this);
            return user;
        }
    }

    @Override
    public String toString() {
        return "User: " + "firstName: " + firstName + " lastName: " + lastName + " age: " + age;
    }
}
