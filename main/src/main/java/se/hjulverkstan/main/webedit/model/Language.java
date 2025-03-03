package se.hjulverkstan.main.webedit.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import se.hjulverkstan.main.common.util.deserializer.CaseInsensitiveLanguageDeserializer;


@JsonDeserialize(using = CaseInsensitiveLanguageDeserializer.class)
public enum Language {
    SWE, // Swedish
    ENG, // English
    ARA, // Arabic
    PER, // Persian
    SOM, // Somali
    BOS, // Bosnian
    TUR, // Turkish
}
