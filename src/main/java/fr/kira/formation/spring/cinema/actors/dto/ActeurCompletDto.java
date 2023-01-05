package fr.kira.formation.spring.cinema.acteurs.dto;

import fr.kira.formation.spring.cinema.films.dto.FilmReduitDto;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ActeurCompletDto {
    private Integer id;
    private String lastname;
    private String firstname;
    private List<FilmReduitDto> movies = new ArrayList<>();
}
