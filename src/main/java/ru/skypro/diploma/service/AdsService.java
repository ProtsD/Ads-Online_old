package ru.skypro.diploma.service;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.multipart.MultipartFile;
import ru.skypro.diploma.dto.ads.CreateOrUpdateAd;

public interface AdsService {
    ResponseEntity<?> getAllAds(Authentication authentication);
    ResponseEntity<?> addAd(Authentication authentication, CreateOrUpdateAd properties, MultipartFile image);
    ResponseEntity<?> getAdInfo(Authentication authentication, Integer id);
    ResponseEntity<?> deleteAd(Authentication authentication, Integer id);
    ResponseEntity<?> updateAdInfo(Authentication authentication, Integer id, CreateOrUpdateAd properties);
    ResponseEntity<?> getCurrentUserAds(Authentication authentication);
    ResponseEntity<?> updateAdImage(Authentication authentication, Integer id, MultipartFile image);
}
