package com.abel.myhakimwebapp.repoistory;

import com.abel.myhakimwebapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
