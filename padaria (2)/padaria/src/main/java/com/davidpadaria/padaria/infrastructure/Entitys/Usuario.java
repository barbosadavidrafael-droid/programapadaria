package com.davidpadaria.padaria.infrastructure.Entitys;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name= "lb_Usuario")
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column (name = "nome")
    private String nome;
    @Column (name = "Email")
    private String email;
    @Column(name = "cpf")
    private String cpf;
    @Column (name = "dataNascimento")
    private Integer dataNascimento;
}
