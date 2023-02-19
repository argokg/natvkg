package kg.finalproject.natvkg.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name="channels")
public class Channels {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @Column(name="price_text_ad")
    private Double priceTextAd;
    @Column(name="price_banner_ad")
    private Double priceBannerAd;
    @JoinColumn(name="discount_id")
    private Discount discount;
}
