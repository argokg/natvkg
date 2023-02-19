package kg.finalproject.natvkg.models.DTO;

import kg.finalproject.natvkg.models.Discount;
import lombok.Data;

@Data
public class ChannelsDTO {
    private Long id;
    private String name;
    private Double priceTextAd;
    private Double priceBannerAd;
    private Discount discount;
}
