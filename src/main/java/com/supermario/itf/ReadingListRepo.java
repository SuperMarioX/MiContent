package com.supermario.itf;

import com.supermario.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Victor on 28/02/2017.
 */

public interface ReadingListRepo extends JpaRepository<Book, String> {

    List<Book> findByTitle(String title);

}
