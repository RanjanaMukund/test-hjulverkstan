package se.hjulverkstan.main.webedit.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import se.hjulverkstan.main.model.webedit.Language;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateGeneralContentWithLangDto {
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Language lang;

    @JsonProperty("generalContent")
    @NotNull(message = "Must include generalContent")
    private UpdateGeneralContentDto updateGeneralContentDto;
}
