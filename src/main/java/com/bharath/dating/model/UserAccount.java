package com.bharath.dating.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
