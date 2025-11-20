package org.ldv.gymthmicproject.service

import org.ldv.gymthmicproject.model.dao.CategorieDAO
import org.ldv.gymthmicproject.model.dao.CommentaireDAO
import org.ldv.gymthmicproject.model.dao.CouleurDAO
import org.ldv.gymthmicproject.model.dao.ProduitDAO
import org.ldv.gymthmicproject.model.dao.RoleDAO
import org.ldv.gymthmicproject.model.dao.TailleDAO
import org.ldv.gymthmicproject.model.dao.UtilisateurDAO
import org.ldv.gymthmicproject.model.dao.VarianteDAO
import org.ldv.gymthmicproject.model.entity.Categorie
import org.ldv.gymthmicproject.model.entity.Commentaire
import org.ldv.gymthmicproject.model.entity.Couleur
import org.ldv.gymthmicproject.model.entity.Produit
import org.ldv.gymthmicproject.model.entity.Role
import org.ldv.gymthmicproject.model.entity.Taille
import org.ldv.gymthmicproject.model.entity.Utilisateur
import org.ldv.gymthmicproject.model.entity.Variante
import org.springframework.boot.CommandLineRunner
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Component
import java.time.LocalDate

@Component
class DataInitializer (
    private val categorieDAO: CategorieDAO,
    private val produitDAO: ProduitDAO,
    private val couleurDAO: CouleurDAO,
    private val tailleDAO: TailleDAO,
    private val varianteDAO: VarianteDAO,
    private val commentaireDAO: CommentaireDAO,
    val passwordEncoder: PasswordEncoder,
    private val roleDAO: RoleDAO,
    private val utilisateurDAO: UtilisateurDAO
) : CommandLineRunner {


    override fun run(vararg args: String?) {
        // Vérifie si la base contient déjà des données
        if (categorieDAO.count() > 0 || produitDAO.count() > 0 || couleurDAO.count() > 0 || tailleDAO.count() > 0 || varianteDAO.count() > 0 || commentaireDAO.count() > 0) {
            println("ℹ️ Données déjà présentes, initialisation ignorée.")
            return
        }

        println("🚀 Initialisation des données...")

        // == Rôles ==
        val roleAdmin = Role(
            nom = "ADMIN"
        )

        val roleClient = Role(
            nom = "CLIENT"
        )

        roleDAO.saveAll(listOf(roleAdmin, roleClient))

        // === Utilisateurs ===
        val admin = Utilisateur(
            id = null,
            nom = "SuperKelly",
            email = "admin@admin.com",
            mdp = passwordEncoder.encode("admin123"), // mot de passe hashé
            role = roleAdmin
        )

        val client = Utilisateur(
            id = null,
            nom = "Maili",
            email = "client@client.com",
            mdp = passwordEncoder.encode("client123"), // mot de passe hashé
            role = roleClient
        )
        utilisateurDAO.saveAll(listOf(admin, client))

        // === Catégories ===
        val catJustaucorps = Categorie(nom = "justaucorps")
        val catSportwear = Categorie(nom = "sportwear")
        val catAccessoires = Categorie(nom = "accessoires")

        categorieDAO.saveAll(listOf(catJustaucorps,catSportwear,catAccessoires)) // sauvegarde des catégories

        // === Produits ===

        val produitJustaucorps = Produit(
            nom = "Justaucorps slayy",
            description = "Justaucorps fluide qui s'adapte aux mouvements de la gymnaste.",
            prix = 50.99
        )

        val produitShort = Produit(
            nom = "Short cool",
            description = "Short basique agréable pour l'entrainement.",
            prix = 15.99
        )

        val produitManique = Produit(
            nom = "Manique",
            description = "Maniques souples, adaptées au barres asymétriques !",
            prix = 149.99
        )

        produitDAO.saveAll(listOf(produitJustaucorps,produitShort,produitManique)) // sauvegarde des produits

        // === Couleurs ===

        val blanc = Couleur(
            nom = "Blanche",
            codeCouleur = "FFFFFF"
        )

        val rose = Couleur(
            nom = "Rose clair",
            codeCouleur = "FFFFFF"
        )
        couleurDAO.saveAll(listOf(blanc, rose))

        // === Tailles ===

        val tailleSM = Taille(
            nom = "SM"
        )

        val tailleML = Taille(
            nom = "ML"
        )
        tailleDAO.saveAll(listOf(tailleSM, tailleML))

        // === Variantes ===
        val var1 = Variante(
            estDisponible = true,
            lienImage = "..."
        )
        varianteDAO.saveAll(listOf(var1))

        // === Commentaires ===
        val comGentil = Commentaire(
            zone = "Justaucorps magnifique",
            datePublication = LocalDate.of(2026, 5, 2),
            dateModification = LocalDate.of(2025, 1, 30)
        )
        commentaireDAO.saveAll(listOf(comGentil))

        println("✅ Données initiales insérées : ${categorieDAO.count()} catégories, ${produitDAO.count()} produits, ${couleurDAO.count()} couleurs, ${tailleDAO.count()} tailles, ${varianteDAO.count()} variantes, ${commentaireDAO.count()} commentaires")

    }

}