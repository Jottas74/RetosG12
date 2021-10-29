
package com.usa.Grupo12.RetoCiclo3.repository;

import com.usa.Grupo12.RetoCiclo3.Interface.ClientInterface;
import com.usa.Grupo12.RetoCiclo3.entity.Cliente;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class ClientRepository {
    
    @Autowired
    private ClientInterface crud1;

    public List<Cliente> getAll(){
        return (List<Cliente>) crud1.findAll();
    }
    public Optional<Cliente> getCliente(int id){
        return crud1.findById(id);
    }

    public Cliente save(Cliente cliente){
        return crud1.save(cliente);
    }
    public void delete(Cliente cliente){
        crud1.delete(cliente);
    }
    
}
