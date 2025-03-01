package se.hjulverkstan.main.common.util;

import se.hjulverkstan.Exceptions.UnsupportedArgumentException;
import se.hjulverkstan.main.model.webedit.Language;
import se.hjulverkstan.main.webedit.model.Language;

public class WebEditUtils {
    public static se.hjulverkstan.main.webedit.model.Language validateLanguage(String lang) {
        try {
            return se.hjulverkstan.main.webedit.model.Language.valueOf(lang.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new UnsupportedArgumentException("Invalid language code: " + lang);
        }
    }
}
