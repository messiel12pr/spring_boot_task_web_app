package com.joelm.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.security.core.GrantedAuthority;

@Data
@Entity
@Table(name="role")
public class Role implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="role_id")
    private Integer roleId;

    private String authority;

    public Role() {
        super();
    }

    public Role(String authority) {
        this.authority = authority;
    }

    public Role(Integer roleId, String authority) {
        this.roleId = roleId;
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return this.authority;
    }
}
