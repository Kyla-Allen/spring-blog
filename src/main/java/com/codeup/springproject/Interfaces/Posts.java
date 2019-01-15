package com.codeup.springproject.Interfaces;

import com.codeup.springproject.Model.Post;
import org.springframework.data.repository.CrudRepository;

public interface Posts extends CrudRepository<Post, Integer> {
}
