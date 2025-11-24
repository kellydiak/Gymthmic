package org.ldv.gymthmicproject.controller.clientcontrollers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class ClientController {
    /**
     * //TODO a faire la doc
     * @return le chemin vers le template à partir du dossier ressources/templates (on ne marque pas le .html)
     */
    @GetMapping("/GymthmicProject/client")
    fun home(): String {
        return "pagesClient/profil"
    }


}