package fr.kira.formation.spring.cinema.films;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Repository pour la gestion des films en utilisant Spring Boot data JPA.
 * Ici il y a deux types générique:
 * - Film qui definie que cette interface gère les films
 * - Integer qui est le type de la clé primaire des films.
 */
public interface FilmJpaRepository extends JpaRepository<Film, Integer> {
    List<Film> findByTitre(String title);
    List<Film> findByTitreContaining(String title);

    List<Film> findByTitreContainingIgnoreCaseAndDureeBetween(String title, int dureeStart, int dureeEnd);
}
