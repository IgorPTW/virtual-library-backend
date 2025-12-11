package com.love2code.springbootlibrary.responsemodels;

import com.love2code.springbootlibrary.entity.Book;
import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
public class ShelfCurrentLoansResponse {

    public ShelfCurrentLoansResponse(Book book, int daysLeft) {
        this.book = book;
        this.daysLeft = daysLeft;
    }

    private Book book;

    private int daysLeft;
}
