package com.lcwd.electronic.store.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User {

    @Id
    private String userId;
    @Column(name = "user_name")
    private String name;
    @Column(name = "user_email", unique = true)
    private  String email;
    @Column(name = "user_password", length = 10, nullable = false)
    private String password;
    private String gender;
    @Column(length = 1000)
    private String about;
    @Column(name = "user_image_name")
    private String imageName;

}
