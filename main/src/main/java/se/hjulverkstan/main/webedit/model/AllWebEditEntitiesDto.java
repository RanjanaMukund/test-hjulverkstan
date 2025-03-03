package se.hjulverkstan.main.webedit.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import se.hjulverkstan.main.webedit.dto.ShopDto;

import java.util.Set;

@Getter
@Setter
@ToString
public class AllWebEditEntitiesDto {
    private Set<GeneralContentStrippedDto> generalContent;
    private Set<ShopDto> shop;
}
