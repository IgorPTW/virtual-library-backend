package com.love2code.springbootlibrary.requestmodels;

import lombok.*;

import java.util.Optional;

@Getter
@Setter
@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
public class ReviewRequest {

    private double rating;

    private Long bookId;

    private Optional<String> reviewDescription;
}
