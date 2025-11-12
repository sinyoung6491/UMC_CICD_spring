package spring.umc.domain.review.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

public class ReviewResDTO {

    @Getter
    @Builder
    public static class Summary {
        private Long id;
        private String storeName;
        private String locationName;
        private Float star;
        private String content;
        private String memberNickname;
        private LocalDateTime createdAt;
    }
}
