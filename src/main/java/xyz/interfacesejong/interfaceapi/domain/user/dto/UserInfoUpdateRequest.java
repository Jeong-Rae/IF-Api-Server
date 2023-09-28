package xyz.interfacesejong.interfaceapi.domain.user.dto;

import lombok.*;

@Getter
@ToString
@RequiredArgsConstructor
public class UserInfoUpdateRequest {
    private Integer generation;
    private String phoneNumber;
    private String githubId;
    private String discordId;
}