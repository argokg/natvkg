package kg.finalproject.natvkg.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Table(name="chosen_days")
public class ChosenDays {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate chosenDays;
    @JoinColumn(name = "channels_id")
    private Channels channels;
}
