package spring.umc.domain.mission.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

public class UserMissionResDTO {
    @Builder
    public record ChallengeDTO(
            Long userMissionId,
            Long memberId,
            Long missionId,
            Long storeId,
            boolean isComplete
    ) {}
    @Getter
    @Builder
    public static class OngoingMissionSummary {
        private Long userMissionId;
        private Long missionId;
        private String storeName;
        private String conditional;
        private Integer point;
        private LocalDate deadline;
    }
}
