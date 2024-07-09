package com.riwi.Map_Struture.api.controllers;

import com.riwi.Map_Struture.api.dto.requests.BookRequest;
import com.riwi.Map_Struture.api.dto.responses.BookResponse;
import com.riwi.Map_Struture.infraestructure.abstract_services.IBookService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/books")
@AllArgsConstructor
public class BookController {
    @Autowired
    private final IBookService  bookService;

    @PostMapping
    public ResponseEntity<BookResponse> insert(
            @Validated
            @RequestBody BookRequest  request){
        return ResponseEntity.ok(this.bookService.create(request));
    }

    @GetMapping()
    public ResponseEntity<List<BookResponse>> getAll() {
        return ResponseEntity.ok(this.bookService.getAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<BookResponse> getById(@PathVariable Long id){
        return ResponseEntity.ok(this.bookService.getById(id));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        this.bookService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<BookResponse> update(@PathVariable Long id,
                                               @Validated
                                               @RequestBody BookRequest request){
        return ResponseEntity.ok(this.bookService.update(id,request));
    }
}
