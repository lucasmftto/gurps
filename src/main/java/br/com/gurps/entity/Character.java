package br.com.gurps.entity;


import lombok.*;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Set;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Character extends CharacterRoot implements Serializable {

    @Id
    private String id;

    private Long dx;

    private Long st;

    private Long ht;

    private Long iq;

    private String gamer;

    private String description;

    private Set<AdvantagesDisadvantages> advantagesDisadvantages;

    private Set<Peculiarity> peculiaritys;

    private Set<Expertise> expertises;

}
