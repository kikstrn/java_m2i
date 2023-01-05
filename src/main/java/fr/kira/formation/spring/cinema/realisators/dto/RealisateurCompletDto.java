package fr.kira.formation.spring.cinema.realisateurs.dto;

import fr.kira.formation.spring.cinema.films.dto.FilmReduitDto;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class RealisateurCompletDto {
    private Integer id;
    private String lastname;
    private String firstname;
    private List<FilmReduitDto> films = new ArrayList<>();
}
