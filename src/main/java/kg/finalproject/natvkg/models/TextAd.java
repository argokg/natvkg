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
@Table(name="text_ad")
public class TextAd {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String adText;
    private int symbols;
}
