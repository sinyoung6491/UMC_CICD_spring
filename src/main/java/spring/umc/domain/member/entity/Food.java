package spring.umc.domain.member.entity;

import jakarta.persistence.*;
import lombok.*;
import spring.umc.domain.member.entity.mapping.MemberFood;
import spring.umc.domain.member.enums.FoodName;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "food")
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "food_id")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "name", nullable = false, length = 255)
    private FoodName name;

    @OneToMany(mappedBy = "food")
    private List<MemberFood> memberFoods = new ArrayList<>();
}
