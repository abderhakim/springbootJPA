package com.abel.myhakimwebapp.repoistory;

import com.abel.myhakimwebapp.model.Author;
import com.abel.myhakimwebapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
