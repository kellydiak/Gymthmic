package org.ldv.gymthmicproject.controller.admincontrollers


import org.ldv.gymthmicproject.model.dao.CategorieDAO
import org.ldv.gymthmicproject.model.entity.Categorie
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable


@Controller
class AdminCategorieController (val categorieDAO: CategorieDAO) {
    @GetMapping("/GymthmicProject/admin/categories") // path sur le web
    fun index(model: Model):String {
        val categories = categorieDAO.findAll()
        model.addAttribute("categories", categories)
        // manque qqch
        return "pageAdmin/categorie/indexCategorie" //correspond au chemin dans le projet
    }
    @GetMapping("/GymthmicProject/admin/categories/{id}")
    open fun show(@PathVariable id:Int, model: Model) : String {
        val uneCategorie = categorieDAO.findById(id).orElseThrow()
        model.addAttribute("categorie", uneCategorie)
        return "pageAdmin/categorie/showCategorie"
  }

    //@GetMapping("/GymthmicProject/admin/categories/create")
//    open fun create (model: Model) : String {
//        var nouvelleCategorie = Categorie(nom = "")
//        model.addAttribute("categorie", nouvelleCategorie)
//        return "pageAdmin/categorie/createCategorie"
//    }

}
