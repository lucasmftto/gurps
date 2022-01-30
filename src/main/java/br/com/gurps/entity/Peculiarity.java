package br.com.gurps.entity;


import lombok.*;
import org.springframework.data.annotation.Id;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Peculiarity extends CharacterRoot {

    @Id
    private String id;

}
