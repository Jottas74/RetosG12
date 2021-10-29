
package com.usa.Grupo12.RetoCiclo3.repository;

import com.usa.Grupo12.RetoCiclo3.Interface.MessageInterface;
import com.usa.Grupo12.RetoCiclo3.entity.Mensaje;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class MessageRepository {
    
    @Autowired
    private MessageInterface crud3;
    public List<Mensaje> getAll(){
        return (List<Mensaje>) crud3.findAll();
    }
    public Optional<Mensaje> getMessage(int id){
        return crud3.findById(id);
    }

    public Mensaje save(Mensaje message){
        return crud3.save(message);
    }
    public void delete(Mensaje message){
        crud3.delete(message);
    }
    
}
