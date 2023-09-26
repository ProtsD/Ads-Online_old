package ru.skypro.diploma.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.skypro.diploma.dto.ads.CreateOrUpdateAd;
import ru.skypro.diploma.service.AdsService;

@RestController
@RequestMapping("/ads")
@RequiredArgsConstructor
public class AdsController {

    private final AdsService adsService;

    @GetMapping()
    public ResponseEntity<?> getAllAds(Authentication authentication){
        return adsService.getAllAds(authentication);
    }

    @PostMapping()
    public ResponseEntity<?> addAd(Authentication authentication, @RequestBody CreateOrUpdateAd properties, @RequestBody MultipartFile image){
        return adsService.addAd(authentication, properties, image);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getAdInfo(Authentication authentication, @PathVariable(name = "id") Integer id){
        return adsService.getAdInfo(authentication, id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteAd(Authentication authentication, @PathVariable(name = "id") Integer id){
        return adsService.deleteAd(authentication, id);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> updateAdInfo(Authentication authentication, @PathVariable(name = "id") Integer id, @RequestBody CreateOrUpdateAd properties){
        return adsService.updateAdInfo(authentication, id, properties);
    }

    @GetMapping("/me")
    public ResponseEntity<?> getCurrentUserAds(Authentication authentication){
        return adsService.getCurrentUserAds(authentication);
    }

    @PatchMapping("/{id}/image")
    public ResponseEntity<?> updateAdImage(Authentication authentication, @PathVariable(name = "id") Integer id, @RequestBody MultipartFile image){
        return adsService.updateAdImage(authentication, id, image);
    }
}
