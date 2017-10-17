package com.pal.microservice.directory.repository;

import com.pal.microservice.directory.model.Directory;
import org.springframework.data.repository.CrudRepository;

public interface DirectoryRepository extends CrudRepository<Directory, Long> {

}