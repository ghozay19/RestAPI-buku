package com.ghozay19.buku.service;

import com.ghozay19.buku.model.Buku;
import com.ghozay19.buku.repository.BukuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BukuServiceImpl implements BukuService{

    @Autowired
    BukuRepository bukuRepository;
    @Override
    public Buku editBuku(Buku buku) {
        return bukuRepository.save(buku);
    }
}
