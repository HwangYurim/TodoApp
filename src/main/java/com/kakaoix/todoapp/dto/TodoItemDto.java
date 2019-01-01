package com.kakaoix.todoapp.dto;

import com.kakaoix.todoapp.domain.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TodoItemDto {
    private Long id;
    private String content;
    private int isChecked;
    private Status status;
    private List<Long> prevIds;     // 참조할 id 목록
    private List<Long> deleteIds;   // 삭제할 id 목록
    private int modifyType;
    private LocalDateTime regDate;
    private LocalDateTime modDate;
}
