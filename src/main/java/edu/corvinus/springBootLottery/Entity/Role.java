package edu.corvinus.springBootLottery.Entity;

import jakarta.persistence.*;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private RoleName name;

    // Standard getters and setters

    public enum RoleName {
        ROLE_USER,
        ROLE_ADMIN
    }
}

