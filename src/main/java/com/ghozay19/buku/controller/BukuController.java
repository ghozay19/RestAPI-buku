package com.ghozay19.buku.controller;

import com.ghozay19.buku.model.Buku;
import com.ghozay19.buku.repository.BukuRepository;
import com.ghozay19.buku.service.BukuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import org.springframework.data.domain.Pageable;

@RestController
@RequestMapping("api/buku")
public class BukuController {

    @Autowired
    BukuRepository bukuRepository;

    @Autowired
    BukuService bukuService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    public Iterable<Buku> showAll (Pageable page){
        return bukuRepository.findAll();
    }


}
