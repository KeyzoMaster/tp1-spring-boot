package sn.uidt.tp1.messageService.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sn.uidt.tp1.messageService.service.FormattageService;
import sn.uidt.tp1.messageService.service.MessageService;

@RestController
@RequestMapping("/api/bonjour")
// @RequiredArgsConstructor
public class MessageController {

    private  MessageService messageService;
    private  FormattageService formattageService;

    @Autowired
    public void setMessageService(MessageService messageService){
        this.messageService = messageService;
    }

    @Autowired
    public void setFormattageService(FormattageService formattageService){
        this.formattageService = formattageService;
    }

    //public MessageController(MessageService messageService, FormattageService formattageService) {
      //  this.messageService = messageService;
        //this.formattageService = formattageService;
    //}

    @GetMapping
    public String getBonjour(@RequestParam(defaultValue = "invité") String name){
        return messageService.hello() + " " + name;
    }

    @GetMapping("/majuscule")
    public String getTexteEnMajuscule(@RequestParam String texte){
        return formattageService.mettreEnMajuscule(texte);
    }

    @GetMapping("/miniscule")
    public String getTexteEnMiniscule(@RequestParam String texte){
        return formattageService.mettreEnMiniscule(texte);
    }

    @GetMapping("/inverse")
    public String getTexteInverse(@RequestParam String texte){
        return formattageService.inverser(texte);
    }
}
