package br.com.gurps.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AdvantagesDisadvantagesDTO extends CharacterRootDTO {

    public boolean equals(Object ref) {
        AdvantagesDisadvantagesDTO c = (AdvantagesDisadvantagesDTO) ref;
        return this.getName() == c.getName();
    }

    public int hashCode() {
        return this.getName().hashCode();
    }
}
