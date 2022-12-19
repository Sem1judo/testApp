package ua.semkov.testapp.controller;


import org.springframework.web.bind.annotation.*;
import ua.semkov.testapp.model.Client;
import ua.semkov.testapp.repository.ClientRepository;
import ua.semkov.testapp.service.ClientService;

import java.util.List;

@RestController
@RequestMapping("/api")

public class ClientController {


    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @RequestMapping(value = "/clients", method = RequestMethod.POST)
    public Client createEmployee(@RequestBody Client client) {
        return clientService.create(client);
    }

    @RequestMapping(value = "/clients", method = RequestMethod.GET)
    public List<Client> readClients() {
        return clientService.findAll();
    }

    @RequestMapping(value = "/clients/{clientId}", method = RequestMethod.PUT)
    public Client readClient(@PathVariable(value = "clientId") Long id, @RequestBody Client clientDetails) {
        return clientService.update(clientDetails, id);
    }

    @RequestMapping(value = "/clients/{clientId}", method = RequestMethod.GET)
    public Client readClient(@PathVariable(value = "clientId") Long id) {
        return clientService.read(id);
    }


    @RequestMapping(value = "/clients/{clientId}", method = RequestMethod.DELETE)
    public void deleteClient(@PathVariable(value = "clientId") Long id) {
        clientService.delete(id);
    }

}
