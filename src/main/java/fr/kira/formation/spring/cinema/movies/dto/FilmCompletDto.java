package fr.kira.formation.spring.cinema.films.dto;

import fr.kira.formation.spring.cinema.acteurs.dto.ActeurSansFilmDto;
import fr.kira.formation.spring.cinema.realisateurs.Realisateur;
import fr.kira.formation.spring.cinema.realisateurs.dto.RealisateurSansFilmDto;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
public class FilmCompletDto {
    private Integer id;
    private String title;
    private String resume;
    private int duration;
    private LocalDate releaseDate;
    private List<ActorsWithoutMovieDto> actors = new ArrayList<>();
    private List<RealisatorWithoutMovieDto> realisators = new ArrayList<>();
}
