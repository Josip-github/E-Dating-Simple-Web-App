package com.bharath.dating.model;


import javax.persistence.*;

@Entity
public class Interest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String likes;
    private String dislikes;
    private String hobbies;
    private String profileUrl;
    private String about;
    @OneToOne
    @JoinColumn(name = "user_id")
    private UserAccount userAccount;

}
