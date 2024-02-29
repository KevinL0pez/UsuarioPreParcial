package org.usuariopreparcial.jpa.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
@Entity
@Table(
        schema = "dbausers",
        name = "user"
)
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long userId;

    @Column(name = "names")
    private String names;

    @Column(name = "lastnames")
    private String lastnames;

    @Column(name = "age")
    private Integer age;

    @Column(name = "address")
    private String address;

    @Column(name = "state")
    private boolean state;

    @ManyToOne
    @JoinColumn(name = "id_rol")
    private RolEntity rol;

}

