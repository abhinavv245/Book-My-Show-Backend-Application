package com.abhinav.bookmyshow.Models;

import com.abhinav.bookmyshow.Enums.Genre;
import com.abhinav.bookmyshow.Enums.Language;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "movie")
@Data
@NoArgsConstructor
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true,nullable = false)
    private String name;
    private int duration;
    private double rating;
    @Enumerated(value = EnumType.STRING)
    private Language language;
    @Enumerated(value = EnumType.STRING)
    private Genre genre;

    @OneToMany(mappedBy = "movie",cascade = CascadeType.ALL)
    private List<Show> showList;
}
