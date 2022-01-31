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
public class AdvantagesDisadvantages extends CharacterRoot implements Serializable {

    private String id = String.valueOf(UUID.randomUUID());

    public boolean equals(Object ref) {
        AdvantagesDisadvantages c = (AdvantagesDisadvantages) ref;
        return this.getName() == c.getName();
    }

    public int hashCode() {
        return this.getName().hashCode();
    }

}
