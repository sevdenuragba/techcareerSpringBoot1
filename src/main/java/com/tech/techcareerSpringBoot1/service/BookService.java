package com.tech.techcareerSpringBoot1.service;

import com.tech.techcareerSpringBoot1.data.dto.BookDto;
import com.tech.techcareerSpringBoot1.data.entity.Book;
import com.tech.techcareerSpringBoot1.data.request.CreateBookRequest;
import com.tech.techcareerSpringBoot1.repository.BookRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static com.tech.techcareerSpringBoot1.data.mapper.BookMapper.BOOK_MAPPER;

@Service
@RequiredArgsConstructor

public class BookService {
    private final BookRepo bookRepo;
    public BookDto createBook(CreateBookRequest createBookRequest){
        Book book = BOOK_MAPPER.createBook(createBookRequest);
        book = bookRepo.save(book);
        return BOOK_MAPPER.convertToBookDto(book);
    }
}
