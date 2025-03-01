package se.hjulverkstan.main.webedit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import se.hjulverkstan.main.webedit.dto.AllWebEditEntitiesByLangDto;
import se.hjulverkstan.main.model.webedit.Language;
import se.hjulverkstan.main.service.webedit.LocalisationServiceImpl;

import static se.hjulverkstan.main.util.WebEditUtils.validateLanguage;

@RestController
@RequestMapping("v1/webedit")
public class LocalisationController {
    LocalisationServiceImpl localizedContentAndShopServiceImpl;

    public LocalisationController(LocalisationServiceImpl localizedContentAndShopServiceImpl) {
        this.localizedContentAndShopServiceImpl = localizedContentAndShopServiceImpl;
    }

    @GetMapping("get-all")
    public ResponseEntity<AllWebEditEntitiesByLangDto> getAllLocalisedContentWithFallbackLang(@RequestParam String fallbackLang) {
        Language fallbackLangValidated = validateLanguage(fallbackLang);
        return new ResponseEntity<>(localizedContentAndShopServiceImpl.getAllLocalisedEntitiesWithFallback(fallbackLangValidated), HttpStatus.OK);
    }
}