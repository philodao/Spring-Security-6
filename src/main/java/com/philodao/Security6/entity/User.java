package com.philodao.Security6.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

import com.philodao.Security6.dto.UserDto;


@Entity
@Table(name = "users")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString(of = { "id", "email", "department", "position", "roleType", "createdBy", "modifiedBy" })
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 45)
    private String email;

    @Column(nullable = false, length = 64)
    private String password;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String department;

    @Column(nullable = false)
    private String position;

    @Column(nullable = false)
    private String roleType;

    private String createdBy;
    private LocalDateTime createdDt;
    private String modifiedBy;
    private LocalDateTime modifiedDt;

    public User(UserDto dto) {
        this.email = dto.getEmail();
        this.password = dto.getPassword();
        this.username = dto.getUsername();
        this.department = dto.getDepartment();
        this.position = dto.getPosition();
        this.roleType = dto.getRoleType();
    }
}
