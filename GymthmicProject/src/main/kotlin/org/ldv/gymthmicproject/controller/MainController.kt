package org.ldv.gymthmicproject.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class MainController (){

    /**
     * Méthode permettant d'afficher la page d'accueil de l'application.
     * @return le chemin vers le template à partir du dossier ressources/templates (on ne marque pas le .html)
     */
    @GetMapping("/GymthmicProject")
    fun home():String{
        return "index"
    }


}
