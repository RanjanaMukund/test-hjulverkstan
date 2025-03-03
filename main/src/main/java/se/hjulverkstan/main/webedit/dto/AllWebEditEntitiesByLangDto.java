package se.hjulverkstan.main.webedit.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import se.hjulverkstan.main.webedit.model.AllWebEditEntitiesDto;
import se.hjulverkstan.main.webedit.model.Language;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AllWebEditEntitiesByLangDto {
    private Map<Language, AllWebEditEntitiesDto> entities;
}