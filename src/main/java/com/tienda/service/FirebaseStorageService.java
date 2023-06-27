package com.tienda.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


@Service
public interface FirebaseStorageService {
    
    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);
        
        //El BucketName es el <id_del_proyecto> + ".appspot.com#
        final String BucketName = "techshop-67f5e.appspot.com";
        
        final String rutaSuperiorStorage = "techshop";
        
        final String rutaJsonFile = "firebase";
        
        final String archivoJsonFile = "techshop-67f5e-firebase-adminsdk-t9qqz-89d24c8338";
        
}
