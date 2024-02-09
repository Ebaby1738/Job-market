package com.jobmarket.jobmarketapp.services.serviceImpl;


import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.jobmarket.jobmarketapp.services.FileUpload;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class FileUploadImpl implements FileUpload {
    private final Cloudinary cloudinary;
    @Override
    public String uploadFile(MultipartFile multipartFile) throws IOException {
        return cloudinary.uploader()
                .upload(multipartFile.getBytes(), ObjectUtils.emptyMap())
                .get("secure_url")
                .toString();
    }
}
