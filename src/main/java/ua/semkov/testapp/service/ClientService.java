package ua.semkov.testapp.service;

import org.springframework.stereotype.Service;
import ua.semkov.testapp.model.Client;
import ua.semkov.testapp.repository.ClientRepository;

import java.util.List;


@Service
public class ClientService implements IClientService {

    private final ClientRepository repository;

    public ClientService(ClientRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Client> findAll() {
        return repository.findAll();
    }

    @Override
    public Client create(Client client) {
        return repository.save(client);
    }

    @Override
    public Client read(long id) {
        return repository.findById(id).get();
    }

    @Override
    public Client update(Client clientDetails, long id) {
        Client client = repository.findById(id).get();
        client.setFirstName(clientDetails.getFirstName());
        client.setLastName(clientDetails.getLastName());
        client.setBirth(clientDetails.getBirth());

        return repository.save(client);

    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
    }
}
