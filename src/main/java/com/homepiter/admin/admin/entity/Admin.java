package com.homepiter.admin.admin.entity;

import com.homepiter.commons.enums.AdminPosition;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "admin")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "admin_id" , nullable = false,unique = true)
    private String adminId;

    @Column(name = "admin_password",nullable = false,unique = true)
    private String adminPassword;


    @Column(name = "admin_email" , nullable = false, unique = true)
    private String adminEmail;


    @Column(name = "admin_phone",nullable = false,unique = true)
    private String adminPhone;


    /* role */

    @Column(name = "role", nullable = false)
    private String role;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name="position" , nullable = false )
    private AdminPosition adminPhosition  = AdminPosition.STAFF;

}
