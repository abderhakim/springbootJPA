package com.abel.myhakimwebapp.repoistory;

import com.abel.myhakimwebapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface authorRepository extends CrudRepository<Author, Long> {
}
