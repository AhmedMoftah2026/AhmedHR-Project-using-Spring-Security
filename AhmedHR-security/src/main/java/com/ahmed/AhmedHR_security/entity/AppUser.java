package com.ahmed.AhmedHR_security.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity()
@Table(name = "sec_users")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AppUser {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id ;

    private String fullName;

    private String userName;

    private String password ;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "sec_user_roles" ,
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    @OrderColumn(name = "id")
    private Set<Role> roles = new HashSet<>();
}
