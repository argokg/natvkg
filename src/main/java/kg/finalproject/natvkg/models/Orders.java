package kg.finalproject.natvkg.models;

import com.fasterxml.jackson.annotation.JsonFormat;
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
@Table(name="orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    @JoinColumn(name = "banner_ad_id")
    private BannerAd bannerAd;
    @OneToOne
    @JoinColumn(name="text_ad_id")
    private TextAd textAd;
    @OneToOne
    @JoinColumn(name="user_id")
    private Users users;
    @ManyToOne
    @JoinColumn(name="chosen_channels_id")
    private ChosenChannels chosenChannels;
    @ManyToOne
    @JoinColumn(name="chosen_days_id")
    private ChosenDays chosenDays;
    private long totalPrice;
    private long payCode;
    private String payStatus;
    private String orderStatus;
    @JsonFormat(pattern = "dd-mm-yyyy")
    private LocalDate orderStartDate;
    @JsonFormat(pattern = "dd-mm-yyyy")
    private LocalDate orderEndDate;


}
