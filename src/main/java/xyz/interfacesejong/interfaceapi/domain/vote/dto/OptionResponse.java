package xyz.interfacesejong.interfaceapi.domain.vote.dto;

import lombok.*;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString
public class OptionResponse {
    private String subject;

    private List<OptionDTO> options;

    private Integer total;

    @Builder
    public OptionResponse(String subject, List<OptionDTO> options, Integer total) {
        this.subject = subject;
        this.options = options;
        this.total = total;
    }
}
