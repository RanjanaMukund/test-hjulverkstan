package se.hjulverkstan.main.webedit.service;

import se.hjulverkstan.main.webedit.dto.AllWebEditEntitiesByLangDto;
import se.hjulverkstan.main.model.webedit.Language;

public interface LocalisationService {
    AllWebEditEntitiesByLangDto getAllLocalisedEntitiesWithFallback(Language fallbackLang);
}