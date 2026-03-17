package sn.uidt.tp1.messageService.service;

import org.springframework.stereotype.Service;

@Service
public class FormattageService {
    public String mettreEnMajuscule(String texte){
        return texte.toUpperCase();
    }

    public String mettreEnMiniscule(String texte){
        return texte.toLowerCase();
    }

    public String inverser(String texte){
        return new StringBuilder(texte).reverse().toString();
    }
}
