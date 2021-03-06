package br.com.gurps.dto;

import lombok.Data;

@Data
public class PeculiarityDTO extends CharacterRootDTO {

    public boolean equals(Object ref) {
        PeculiarityDTO c = (PeculiarityDTO) ref;
        return this.getName() == c.getName();
    }

    public int hashCode() {
        return this.getName().hashCode();
    }
}
