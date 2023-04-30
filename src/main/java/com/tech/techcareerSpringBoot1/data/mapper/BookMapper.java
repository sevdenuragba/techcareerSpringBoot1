package com.tech.techcareerSpringBoot1.data.mapper;

import com.tech.techcareerSpringBoot1.data.dto.BookDto;
import com.tech.techcareerSpringBoot1.data.entity.Book;
import com.tech.techcareerSpringBoot1.data.request.CreateBookRequest;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface BookMapper {

    BookMapper BOOK_MAPPER = Mappers.getMapper(BookMapper.class);

    BookDto convertToBookDto(Book book);

    Book createBook(CreateBookRequest createBookRequest);
}