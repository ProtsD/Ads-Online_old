package ru.skypro.diploma.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.skypro.diploma.dto.ads.Ad;
import ru.skypro.diploma.dto.ads.Ads;
import ru.skypro.diploma.dto.ads.CreateOrUpdateAd;
import ru.skypro.diploma.dto.ads.ExtendedAd;
import ru.skypro.diploma.service.AdsService;

@RestController
@RequestMapping("/ads")
@RequiredArgsConstructor
public class AdsController {

    private final AdsService adsService;

    @GetMapping()
    public ResponseEntity<Ads> getAllAds(Authentication authentication){
        Ads allAds = adsService.getAllAds(authentication);

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .body(allAds);
    }

    @PostMapping()
    public ResponseEntity<Ad> addAd(Authentication authentication, @RequestBody CreateOrUpdateAd properties, @RequestBody MultipartFile image){
        Ad addAd = adsService.addAd(authentication, properties, image);

        return ResponseEntity.status(HttpStatus.CREATED)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .body(addAd);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ExtendedAd> getAdInfo(Authentication authentication, @PathVariable(name = "id") Integer id){
        ExtendedAd adInfo = adsService.getAdInfo(authentication, id);

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .body(adInfo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteAd(Authentication authentication, @PathVariable(name = "id") Integer id){
        adsService.deleteAd(authentication, id);

        return ResponseEntity.ok().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Ad> updateAdInfo(Authentication authentication, @PathVariable(name = "id") Integer id, @RequestBody CreateOrUpdateAd properties){
        Ad updateAdInfo = adsService.updateAdInfo(authentication, id, properties);

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .body(updateAdInfo);
    }

    @GetMapping("/me")
    public ResponseEntity<Ads> getCurrentUserAds(Authentication authentication){
        Ads currentUserAds = adsService.getCurrentUserAds(authentication);

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .body(currentUserAds);
    }

    @PatchMapping("/{id}/image")
    public ResponseEntity<String> updateAdImage(Authentication authentication, @PathVariable(name = "id") Integer id, @RequestBody MultipartFile image){
        String updateAdImage = adsService.updateAdImage(authentication, id, image);

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_OCTET_STREAM_VALUE)
                .body(updateAdImage);
    }
}
