package com.love2code.springbootlibrary.requestmodels;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
public class AddBookRequest {

    private String title;

    private String author;

    private String description;

    private int copies;

    private String category;

    private String img;
}
