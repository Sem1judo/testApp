package ua.semkov.testapp.service;

import ua.semkov.testapp.model.Client;

import java.util.List;

public interface IClientService {
    List<Client> findAll();

    Client create(Client client);

    Client read(long id);

    Client update(Client clientDetails, long id);

    void delete(long id);

}
