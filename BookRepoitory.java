package com.abel.myhakimwebapp.repoistory;

import com.abel.myhakimwebapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepoitory extends CrudRepository<Book, Long> {
}
