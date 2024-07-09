package com.riwi.Map_Struture.infraestructure.helpers;
import java.util.List;

import com.riwi.Map_Struture.api.dto.requests.BookRequest;
import com.riwi.Map_Struture.api.dto.responses.BookResponse;
import com.riwi.Map_Struture.domain.entities.Book;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;


@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface BookMapper {
    Book bookReqToEntity(BookRequest  bookRequest);

    BookResponse  entityToBookResp(Book book);

    List<BookResponse> listEntitiesToBookResp(List<Book > books);
}
