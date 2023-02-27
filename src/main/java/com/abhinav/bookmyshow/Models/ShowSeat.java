package com.abhinav.bookmyshow.Models;

import com.abhinav.bookmyshow.Enums.SeatType;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "showSeat")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShowSeat {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private boolean isBooked;

    @Column(unique = true)
    private String seatNumber;

    private double price;
    private Date bookedAt;

    @Enumerated(EnumType.STRING)
    private SeatType seatType;

    @ManyToOne
    @JoinColumn
    private Show show;
}
