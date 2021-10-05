package com.br.example.prj.biblioteca.repositories;

import com.br.example.prj.biblioteca.models.Book;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BookRepository extends PagingAndSortingRepository<Book, Long> {

    List<Book> findByTitleContaining(String title,Pageable pageable);



}

