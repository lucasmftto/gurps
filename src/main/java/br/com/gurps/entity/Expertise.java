package br.com.gurps.entity;


import lombok.*;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Expertise extends CharacterRoot implements Serializable {

    @Id
    private String id;

}
