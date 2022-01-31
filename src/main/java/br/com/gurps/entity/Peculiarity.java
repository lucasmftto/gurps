package br.com.gurps.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Peculiarity extends CharacterRoot {

    @Id
    private String id = String.valueOf(UUID.randomUUID());

    public boolean equals(Object ref) {
        Peculiarity c = (Peculiarity) ref;
        return this.getName() == c.getName();
    }

    public int hashCode() {
        return this.getName().hashCode();
    }

}
