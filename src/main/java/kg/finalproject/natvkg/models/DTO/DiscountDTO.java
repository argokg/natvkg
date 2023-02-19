package kg.finalproject.natvkg.models.DTO;

import lombok.Data;

@Data
public class DiscountDTO {
    private Long id;
    private int minimumDays;
    private int discountPercentage;
}
