package com.riwi.Map_Struture.infraestructure.abstract_services;

import com.riwi.Map_Struture.api.dto.requests.BookRequest;
import com.riwi.Map_Struture.api.dto.responses.BookResponse;

public interface IBookService  extends CrudService<BookRequest, BookResponse,Long>{
}
