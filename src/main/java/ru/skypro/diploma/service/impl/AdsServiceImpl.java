package ru.skypro.diploma.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ru.skypro.diploma.dto.ads.CreateOrUpdateAd;
import ru.skypro.diploma.service.AdsService;

@Service
@RequiredArgsConstructor
public class AdsServiceImpl implements AdsService {
    @Override
    public ResponseEntity<?> getAllAds(Authentication authentication) {
        return null;
    }

    @Override
    public ResponseEntity<?> addAd(Authentication authentication, CreateOrUpdateAd properties, MultipartFile image) {
        return null;
    }

    @Override
    public ResponseEntity<?> getAdInfo(Authentication authentication, Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<?> deleteAd(Authentication authentication, Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<?> updateAdInfo(Authentication authentication, Integer id, CreateOrUpdateAd properties) {
        return null;
    }

    @Override
    public ResponseEntity<?> getCurrentUserAds(Authentication authentication) {
        return null;
    }

    @Override
    public ResponseEntity<?> updateAdImage(Authentication authentication, Integer id, MultipartFile image) {
        return null;
    }
}
