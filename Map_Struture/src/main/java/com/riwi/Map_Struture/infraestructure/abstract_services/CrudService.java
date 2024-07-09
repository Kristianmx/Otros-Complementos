package com.riwi.Map_Struture.infraestructure.abstract_services;

import java.util.List;

public interface CrudService<Request, Response , ID> {
    public void delete(ID id);
    public Response create(Request request);
    public Response update(ID id, Request request);
    public List<Response> getAll();
    public Response getById(ID id);
}
