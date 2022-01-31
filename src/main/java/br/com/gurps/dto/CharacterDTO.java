package br.com.gurps.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Set;

@Data
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class CharacterDTO extends CharacterRootDTO {

    private Long dx;

    private Long st;

    private Long ht;

    private Long iq;

    private String gamer;

    private String description;

    private Set<AdvantagesDisadvantagesDTO> advantagesDisadvantages;

    private Set<PeculiarityDTO> peculiaritys;

    private Set<ExpertiseDTO> expertises;
}
