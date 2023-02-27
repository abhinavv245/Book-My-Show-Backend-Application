package com.abhinav.bookmyshow.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "theaterSeat")
@Getter
@Setter
@NoArgsConstructor
public class TheaterSeat {

    @Column(unique = true)
    private String seatNumber;
    private String seatType;

    @ManyToOne
    @JoinColumn
    private Theater theater;
}
