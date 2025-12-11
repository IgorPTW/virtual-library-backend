package com.love2code.springbootlibrary.requestmodels;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
public class AdminQuestionRequest {

    private Long id;

    private String response;
}
