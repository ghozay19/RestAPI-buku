package com.ghozay19.buku.repository;

import com.ghozay19.buku.model.Buku;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.Repository;

import java.util.Date;
import java.util.List;

public interface BukuRepository extends Repository<Buku, String>, PagingAndSortingRepository<Buku, String> {

    List<Buku> findByBookId(String BookId);

    List<Buku> findByTitle(String title);

    List<Buku> findByCategory(String category);

    List<Buku> findByRegistered(Date reg);

    List<Buku> findByTitleAndCategory(String title, String category);

    @Modifying
    @Query("update Buku b set b.total = ?1 where b.title = ?2")
    public void updateTotal(int jml, String title);

}
