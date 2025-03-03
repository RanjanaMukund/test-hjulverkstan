package se.hjulverkstan.main.webedit.dto.pipeline;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ShopStrippedDto {
    private Long id;
    private String bodyText;
}