package com.br.example.prj.biblioteca.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

import java.util.function.Function;


public interface PageService<T> extends Slice<T> {

    long getTotalElements();
    int getTotalPages();
    <U> Page<U> map(Function<? super T,? extends U> converter);


}


