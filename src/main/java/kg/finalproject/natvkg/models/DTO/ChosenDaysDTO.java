package kg.finalproject.natvkg.models.DTO;

import kg.finalproject.natvkg.models.Channels;
import lombok.Data;
import java.time.LocalDate;


@Data
public class ChosenDaysDTO {
    private Long id;
    private LocalDate chosenDays;
    private Channels channels;
}
