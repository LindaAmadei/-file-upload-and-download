package co.develhope.UploaderDownloader.controller;


import co.develhope.UploaderDownloader.service.FileStorageService;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;

//ho creato controller rest che mappa su /file che consuma il fileStorageService
@RestController
@RequestMapping("/file")
public class FileController {

    @Autowired
    private FileStorageService fileStorageService;

// ci sono 2 endpoint upload e download
    @PostMapping("/upload")
    public String upload(@RequestParam MultipartFile file) throws IOException {
        fileStorageService.upload(file);
        return fileStorageService.upload(file);

    }

    @GetMapping ("/download")
    public @ResponseBody byte[] dowload (@RequestParam String fileName, HttpServletResponse response) throws Exception {
        System.out.println("Downloading " + fileName);
        String extension = FilenameUtils.getExtension(fileName);
        switch (extension){
            case "gif":
                response.setContentType(MediaType.IMAGE_GIF_VALUE);
                break;
            case "jpg":
            case "jpeg" :
                response.setContentType(MediaType.IMAGE_GIF_VALUE);
                break;
            case  "png" :
                response.setContentType(MediaType.IMAGE_GIF_VALUE);
                break;
        }
        response.setHeader("Content-Disposition", "attachment; filename=\"" +fileName+"\"");
        return fileStorageService.download(fileName);

    }

}
