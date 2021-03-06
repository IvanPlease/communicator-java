package com.communicator.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MessageBlopDto {
    private Long id;
    private UserConvDto author;
    private String content;
    private List<AttachmentsDto> attachmentsList;
    private boolean read;
}
