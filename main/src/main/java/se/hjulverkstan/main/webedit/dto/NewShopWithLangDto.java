package se.hjulverkstan.main.webedit.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import se.hjulverkstan.main.webedit.model.Language;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewShopWithLangDto {
    @NotNull(message = "Language is required")
    Language lang;

    @JsonProperty("shop")
    @Valid
    @NotNull(message = "'shop' is required")
    NewShopDto newShopDto;
}
