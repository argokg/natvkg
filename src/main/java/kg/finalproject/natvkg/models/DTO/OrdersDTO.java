package kg.finalproject.natvkg.models.DTO;

import kg.finalproject.natvkg.models.*;
import lombok.Data;

import java.time.LocalDate;


@Data
public class OrdersDTO {
    private Long id;
    private BannerAd bannerAd;
    private TextAd textAd;
    private Users users;
    private ChosenChannels chosenChannels;
    private ChosenDays chosenDays;
    private long totalPrice;
    private long payCode;
    private String payStatus;
    private String orderStatus;
    private LocalDate orderStartDate;
    private LocalDate orderEndDate;
}
