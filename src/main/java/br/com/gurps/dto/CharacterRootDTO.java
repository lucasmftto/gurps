package br.com.gurps.dto;

import lombok.*;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Builder
public class CharacterRootDTO {

    @NotNull(message = "Name obrigatorio")
    private String name;

    @NotNull(message = "Points obrigatorio")
    private Long points;
}
