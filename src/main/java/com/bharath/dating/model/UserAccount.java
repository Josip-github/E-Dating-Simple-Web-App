package com.bharath.dating.model;

import javax.persistence.*;

@Entity
public class UserAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String userName;
    private String password;
    private Integer age;
    private String email;
    private String phoneNumber;
    private String gender;
    private String city;
    private String country;
    @OneToOne(mappedBy = "userAccount")
    private Interest interest;


}
