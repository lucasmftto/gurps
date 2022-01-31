package br.com.gurps.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.UUID;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Expertise extends CharacterRoot implements Serializable {

    private String id = String.valueOf(UUID.randomUUID());

}
