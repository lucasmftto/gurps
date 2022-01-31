package br.com.gurps.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ExpertiseDTO extends CharacterRootDTO {

    public boolean equals(Object ref) {
        ExpertiseDTO c = (ExpertiseDTO) ref;
        return this.getName() == c.getName();
    }

    public int hashCode() {
        return this.getName().hashCode();
    }
}
