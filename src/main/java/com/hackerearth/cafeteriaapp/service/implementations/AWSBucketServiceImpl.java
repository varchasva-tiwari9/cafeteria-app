package com.hackerearth.cafeteriaapp.service.implementations;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.URL;

@Component
public class AWSBucketServiceImpl {
    AWSCredentials awsCredentials = new BasicAWSCredentials("AKIAJQDU22DTESJ4BXWA",
            "UVrQSahJg3jvkAWqovOFK0oQQnexaLEAseNw6enK");

    AmazonS3 s3Client = AmazonS3ClientBuilder
            .standard()
            .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
            .withRegion(Regions.US_EAST_1)
            .build();

    public URL saveFile(MultipartFile multipartFile) {
        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
        URL url = null;

        ObjectMetadata objectMetaData = new ObjectMetadata();
        objectMetaData.setContentType(multipartFile.getContentType());
        objectMetaData.setContentLength(multipartFile.getSize());

        try {
            PutObjectRequest putObjectRequest = new PutObjectRequest("cafeteria-bucket",
                    fileName, multipartFile.getInputStream(), objectMetaData);
            s3Client.putObject(putObjectRequest);
            url = s3Client.getUrl("cafeteria-bucket", fileName);
        } catch (IOException e) {}

        return url;
    }
}
