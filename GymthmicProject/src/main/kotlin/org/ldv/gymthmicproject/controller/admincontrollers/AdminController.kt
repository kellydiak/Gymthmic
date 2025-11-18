package org.ldv.gymthmicproject.controller.admincontrollers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping


@Controller
class AdminController {
    /**
     * //TODO a faire la doc
     * @return le chemin vers le template à partir du dossier ressources/templates (on ne marque pas le .html)
     */
    @GetMapping("/GymthmicProject/admin")
    fun home (): String {
        return "pageAdmin/dashboard"
    }


}
