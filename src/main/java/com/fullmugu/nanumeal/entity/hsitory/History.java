package com.fullmugu.nanumeal.entity.hsitory;

import com.fullmugu.nanumeal.entity.restaurant.Restaurant;
import com.fullmugu.nanumeal.entity.user.User;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class History {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id")
//    @JsonIgnore
    private User userId;

    @ManyToOne
    @JoinColumn(name = "id")
    private Restaurant restaurantId;

    @Column(nullable = false)
    private Long usePrice;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDateTime regDate;

}


